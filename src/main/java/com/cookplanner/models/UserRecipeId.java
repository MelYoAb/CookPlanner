package com.cookplanner.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by abdelmoughit on 2/20/2017.
 */
@Embeddable
public class UserRecipeId implements Serializable {
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "recipes_id")
    private Long recipeId;

    public UserRecipeId() {
    }

    public UserRecipeId(Long userId, Long recipeId) {
        this.userId = userId;
        this.recipeId = recipeId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Long recipeId) {
        this.recipeId = recipeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserRecipeId)) return false;
        UserRecipeId that = (UserRecipeId) o;
        return Objects.equals(getRecipeId(), that.getRecipeId()) &&
                Objects.equals(getUserId(), that.getUserId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRecipeId(), getUserId());
    }
}
