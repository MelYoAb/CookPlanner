package com.cookplanner.repositories;

import com.cookplanner.models.Ingredient;
import com.cookplanner.models.IngredientList;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by apple on 2/22/17.
 */
@Repository
public interface IngredientsList extends CrudRepository<IngredientList, Long> {

    @Query("select i from Ingredient i where i.ingredient=?1")
    public Ingredient findByIngredient (String ingredient);
}
