package com.cookplanner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Created by Yassine on 2/27/17.
 */
@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public String homepage() {
        return "welcome";
    }

    @GetMapping("/users/dashboard")
    public String showCollage() {
        return"users/dashboard";
    }
}
