package com.cookplanner.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

/**
 * @author Created by Yassine on 2/17/17.
 */


@Entity
@Table(name = "ingredients")
/*@NamedNativeQueries({
    @NamedNativeQuery(
            name    =   "sevemDaysIngredients",
            query   =   "SELECT i.id, i.ingredient, i.categories_id" +
            "FROM ingredients i\n" +
            "  JOIN ingredients_list il\n" +
            "    ON i.id = il.ingredient_id\n" +
            "  JOIN recipes r\n" +
            "    ON il.recipe_id = r.id\n" +
            "  JOIN users_recipes ur\n" +
            "    ON r.id = ur.recipes_id\n" +
            "  JOIN users u\n" +
            "    ON ur.user_id = u.id\n" +
            "WHERE u.id = ?1 AND  (ur.date >= NOW() AND ur.date <= NOW() + INTERVAL 7 DAY)\n" +
            "GROUP BY i.id",
            resultClass=Ingredient.class
    )
})*/
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "ingredient")
    private String ingredient;

    @ManyToOne
    @JoinColumn(name = "categories_id")
    @JsonBackReference
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
