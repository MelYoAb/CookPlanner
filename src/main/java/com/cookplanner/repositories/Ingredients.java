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

    @Query( "SELECT i FROM Ingredient i")
    List<Ingredient> findAllIndredients();

    @Query(value = "SELECT i.id, i.ingredient, i.categories_id\n" +
            "FROM ingredients i\n" +
            "  JOIN ingredients_list il\n" +
            "    ON i.id = il.ingredient_id\n" +
            "  JOIN recipes r\n" +
            "    ON il.recipe_id = r.id\n" +
            "  JOIN users_recipes ur\n" +
            "    ON r.id = ur.recipes_id\n" +
            "  JOIN users u\n" +
            "    ON ur.user_id = u.id\n" +
            "WHERE u.id = ?1 AND  (ur.date >= NOW() AND ur.date <= NOW() + INTERVAL 7 DAY)\n" +
            "GROUP BY i.id", nativeQuery = true)
    List<Ingredient> findIndredientsPerLoggedinUser(long id);
}
