package com.cookplanner.controller;

import com.cookplanner.models.User;
import com.cookplanner.models.UserRecipe;
import com.cookplanner.repositories.UserRecipes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.List;

/**
 * Created by abdelmoughit on 2/19/2017.
 */
@Controller
public class CalendarController {
    @Autowired
    UserRecipes calendarsDao;

    @GetMapping("/calendar.json")
    public @ResponseBody
    List<UserRecipe> retrieveAllData(){
       User user =(User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return  calendarsDao.listOfRecipes(user.getId());

    }


    @GetMapping("/")
    public String showCalendar(Model model){
        model.addAttribute("calendars", Collections.emptyList());
        return "calendar/show";
    }
    @GetMapping("/googlecalendar")
    public String showGoogleCalendar(){
        return "calendar/googleCalendar";
    }

}
