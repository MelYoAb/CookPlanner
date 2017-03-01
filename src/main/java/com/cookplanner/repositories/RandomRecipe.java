package com.cookplanner.repositories;

import com.cookplanner.models.Recipe;
import com.cookplanner.models.UserRecipe;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by abdelmoughit on 2/23/2017
 */
@Repository
public interface RandomRecipe extends CrudRepository<Recipe,Long> {

    @Query(value = "SELECT * FROM recipes r ORDER BY RAND() LIMIT ?1" ,nativeQuery = true)
    List<Recipe> listOfRandomRecipes(int days);

    @Query("SELECT ur FROM UserRecipe ur WHERE ur.user.id =?1 AND ur.date BETWEEN ?2 and ?3")
    List<UserRecipe>listOfRecipes(long user_id, Date startDate, Date endDate);
}
