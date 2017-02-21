package com.cookplanner.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Created by Yassine on 2/17/17.
 */

@Entity
@Table(name = "ingredients_list")
public class IngredientList implements Serializable {

    @Column(name = "qty")
    private double qty;

    @Id
    @ManyToOne
    @JoinColumn(name = "ingredients_id")
    private Ingredient ingredient;

    @Id
    @ManyToOne
    @JoinColumn(name = "recipes_id")
    private Recipe recipe;

    public IngredientList() {
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}
