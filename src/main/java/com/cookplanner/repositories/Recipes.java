package com.cookplanner.repositories;

import com.cookplanner.models.Recipe;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Created by Yassine on 2/20/17.
 */
public interface Recipes extends CrudRepository<Recipe, Integer> {
}
