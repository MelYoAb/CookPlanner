package com.cookplanner.models;

import javax.persistence.*;
import java.util.List;

/**
 * @author Created by Yassine on 2/17/17.
 */


@Entity
@Table(name = "ingredients")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "ingredient")
    private String ingredient;

    @ManyToOne
    @JoinColumn(name = "categories_id")
    private Category category;

    @OneToMany(mappedBy = "ingredient")
    List<IngredientList> ingredientLists;

    public Ingredient() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
