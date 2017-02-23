package com.cookplanner.repositories;
import com.cookplanner.models.UserRecipe;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
/**
 * Created by abdelmoughit on 2/20/2017
 */
@Repository
public interface UserRecipes extends CrudRepository<UserRecipe, Long> {
    @Query("select u  FROM UserRecipe u INNER JOIN u.recipe r WHERE u.user.id=?1")
     List<UserRecipe> listOfRecipes(long userId);
}
