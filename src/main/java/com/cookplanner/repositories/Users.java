package com.cookplanner.repositories;

import com.cookplanner.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Created by Yassine on 2/19/17.
 */

@Repository
public interface Users extends CrudRepository<User, Integer> {

    public User findByUsername(String username);
}
