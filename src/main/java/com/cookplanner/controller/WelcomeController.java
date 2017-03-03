package com.cookplanner.controller;

import com.cookplanner.models.User;
import com.cookplanner.services.UserSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Created by Yassine on 2/27/17.
 */
@Controller
public class WelcomeController {

    @Autowired
    UserSvc userSvc;

    @GetMapping("/")
    public String homepage() {
        return "welcome";
    }

    @GetMapping("/dashboard")
    public String showCollage(Model model) {
        User loggedInUser = userSvc.loggedInUser();
        model.addAttribute("loggedInUser", loggedInUser);
        return"users/dashboard";
    }
}
