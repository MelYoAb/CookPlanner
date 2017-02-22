package com.cookplanner.repositories;

import com.cookplanner.models.Recipe;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Created by Yassine on 2/20/17.
 */
public interface Recipes extends CrudRepository<Recipe, Long> {
    @Query("select r from Recipe r where r.title like ?1")
    public List<Recipe> findByTitle (String title);
}
