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

import java.util.Date;
import java.util.List;

/**
 * @author Created by abdelmoughit on 2/23/2017.
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
    public String recipesOfWeek(Model model){
        User loggedInUser= userSvc.loggedInUser();
        Date today =new Date();
        DateTime dt= new DateTime(today);
//        Date endDate;
//        System.out.println(id+"capstone");
//        if (id==1){
//            endDate =dt.plusWeeks(1).toDate();
//        }else{
//            endDate =dt.plusMonths(1).toDate();
//        }
        List<UserRecipe> RecipesOfWeek = recipesDao.listOfRecipes(loggedInUser.getId(),today,dt.plusWeeks(1).toDate());
        model.addAttribute("recipes", RecipesOfWeek);
        model.addAttribute("loggedInUser",userSvc.loggedInUser() );
        return  "users/dashboard";
    }






}
