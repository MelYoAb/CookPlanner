package com.cookplanner.repositories;

import com.cookplanner.models.Ingredient;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Created by Yassine on 2/22/17.
 */
public interface Ingredients extends CrudRepository<Ingredient, Integer> {

}
