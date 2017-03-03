package com.cookplanner.repositories;

import com.cookplanner.models.Ingredient;
import com.cookplanner.models.IngredientList;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.ConstructorResult;
import javax.persistence.SqlResultSetMapping;
import java.util.List;


/**
 * @author Created by Yassine on 2/22/17.
 */
@Repository
public interface IngredientsList extends CrudRepository<IngredientList, Long> {

    @Query("select i from Ingredient i where i.ingredient=?1")
    Ingredient findByIngredient (String ingredient);
}
