package com.cookplanner.controller;

import com.cookplanner.models.User;
import com.cookplanner.models.UserRecipe;
import com.cookplanner.repositories.RandomRecipe;
import com.cookplanner.repositories.UserRecipes;
import com.cookplanner.services.UserSvc;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;
import java.util.List;

/**
 * Created by abdelmoughit on 2/23/2017.
 */
@Controller
public class RecipesViewController {
    @Autowired
    RandomRecipe recipesDao;
    @Autowired
    UserSvc userSvc;
    @Autowired
    UserRecipes userRecipesDao;

    @GetMapping("/view")
    public String view(){
        return "users/dashboard";
    }

    @PostMapping("/view/{id}")
    public String recipesOfWeek(@PathVariable long id,Model model){
        User loggedInUser= userSvc.loggedInUser();
        Date today =new Date();
        DateTime dt= new DateTime(today);
        Date endDate;
        if (id==1){
            endDate =dt.plusWeeks(1).toDate();
        }else{
            endDate =dt.plusMonths(1).toDate();
        }
        List<UserRecipe> RecipesOfWeek = recipesDao.listOfRecipes(loggedInUser.getId(),today,endDate);
        model.addAttribute("recipes", RecipesOfWeek);
        return  "users/dashboard";
    }






}
