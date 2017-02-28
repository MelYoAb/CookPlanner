package com.cookplanner.controller;

import com.cookplanner.models.User;
import com.cookplanner.repositories.Ingredients;
import com.cookplanner.repositories.IngredientsList;
import com.cookplanner.services.UserSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Created by Yassine on 2/24/17.
 */

@Controller
public class ShoppingListController {

    @Autowired
    IngredientsList ingridients;

    @Autowired
    UserSvc userSvc;

    @GetMapping("/list")
    public String viewShoppingList (Model model) {
        User loggedInUser = userSvc.loggedInUser();
        model.addAttribute("ingredientList", ingridients.findIndredientsPerLoggedinUser(loggedInUser.getId()));
        return "recipes/shoppingList";
    }
}
