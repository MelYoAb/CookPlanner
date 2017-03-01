package com.cookplanner.repositories;

import com.cookplanner.models.Ingredient;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Created by Yassine on 2/22/17.
 */
public interface Ingredients extends CrudRepository<Ingredient, Long> {
    /*@Query( "SELECT i FROM Ingredient i\n" +
            "JOIN i.ingredientLists il\n" +
            "JOIN il.recipe r\n" +
            "JOIN r.userRecipe ur\n" +
            "JOIN ur.user u\n" +
            "WHERE (u.id=?1\n)" +
            "GROUP BY i.id" )
    List<Ingredient> findIndredientsPerLoggedinUser(long id);*/
//    AND ur.date > NOW())
}
