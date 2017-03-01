package com.cookplanner.controller;

import com.cookplanner.models.Recipe;
import com.cookplanner.models.User;
import com.cookplanner.models.UserRecipe;
import com.cookplanner.models.UserRecipeId;
import com.cookplanner.repositories.RandomRecipe;
import com.cookplanner.repositories.UserRecipes;
import com.cookplanner.services.UserSvc;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;
import java.util.List;

/**
 * Created by abdelmoughit on 2/28/2017.
 */
@Controller
public class GenerateRecipesController {
    @Autowired
    RandomRecipe recipesDao;
    @Autowired
    UserSvc userSvc;
    @Autowired
    UserRecipes userRecipesDao;

    @GetMapping("/recipes")
    public String showForm(){
        return "recipes/generateRecipes";
    }


    @PostMapping ("/recipes")
    public String retrieveAllData(Model model){
        User loggedInUser= userSvc.loggedInUser();
        Date today =new Date();
        DateTime dt= new DateTime(today);
        int month = dt.dayOfMonth().getMaximumValue();
        int count=1;



        List<Recipe> randomRecipesMonth = recipesDao.listOfRandomRecipes(month);
        for (Recipe recipes : randomRecipesMonth) {
            UserRecipe urs = new UserRecipe();
            urs.setId(new UserRecipeId(loggedInUser.getId(), recipes.getId()));
            urs.setDate(dt.plusDays(count).toDate());
            urs.setCost(0);
            userRecipesDao.save(urs);
            count++;
        }
        model.addAttribute("recipes", randomRecipesMonth);
        return  "calendar/signGoogle";
    }

}
