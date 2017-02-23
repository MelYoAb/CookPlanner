package com.cookplanner.repositories;

import com.cookplanner.models.UserRole;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Created by Yassine on 2/19/17.
 */


@Repository
public interface Roles extends CrudRepository<UserRole, Integer> {
    @Query("select ur.role from UserRole ur, User u where u.username=?1 and ur.userId = u.id")
    public List<String> ofUserWith (String username);

}
