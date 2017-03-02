package com.cookplanner.repositories;

import com.cookplanner.models.Ingredient;
import com.cookplanner.models.IngredientList;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author Created by Yassine on 2/22/17.
 */
@Repository
public interface IngredientsList extends CrudRepository<IngredientList, Long> {

    @Query("select i from Ingredient i where i.ingredient=?1")
    Ingredient findByIngredient (String ingredient);


    @Query( "SELECT i, COUNT(i) as qty FROM IngredientList il, UserRecipe ur\n" +
            "JOIN il.ingredient i\n" +
            "JOIN il.recipe r\n" +
            "WHERE (ur.user.id=?1 AND ur.recipe.id = il.recipe.id\n) AND ur.date >= NOW()" +
            "GROUP BY i" )
    List<Ingredient> findIndredientsPerLoggedinUser(long id);
}
