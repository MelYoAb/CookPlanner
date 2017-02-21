package com.cookplanner.models;

import javax.persistence.*;
import java.util.List;

/**
 * @author Created by Yassine on 2/17/17.
 */


@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Ingredient> ingredients;
}

