package com.cookplanner.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Created by Yassine on 2/17/17.
 */

@Entity
@Table(name = "ingredients_list")
public class IngredientList implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "qty")
    private String qty;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @ManyToOne
    private Ingredient ingredient;


    @ManyToOne
    private Recipe recipe;

    public IngredientList() {
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
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
