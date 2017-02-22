package com.cookplanner.repositories;

import com.cookplanner.models.IngredientList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by apple on 2/22/17.
 */
@Repository
public interface IngredientsList extends CrudRepository<IngredientList, Long> {
}
