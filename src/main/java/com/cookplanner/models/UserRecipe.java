package com.cookplanner.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Created by Yassine on 2/17/17.
 */

@Entity
@Table(name = "users_recipes")
public class UserRecipe implements Serializable {

    @EmbeddedId
    private UserRecipeId id;

    @Column(name = "date")
    @JsonFormat(pattern="yyyy-MM-dd 19:00")
    private Date date;

    @Column(name = "cost")
    private double cost;

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;


    @ManyToOne
    @JoinColumn(name = "recipes_id", insertable = false, updatable = false)
    private Recipe recipe;

    public UserRecipe() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public UserRecipeId getId() {
        return id;
    }

    public void setId(UserRecipeId id) {
        this.id = id;
    }
}
