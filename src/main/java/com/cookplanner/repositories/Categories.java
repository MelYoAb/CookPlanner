package com.cookplanner.repositories;

import com.cookplanner.models.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Created by Yassine on 2/24/17.
 */
public interface Categories extends CrudRepository <Category, Long> {
}
