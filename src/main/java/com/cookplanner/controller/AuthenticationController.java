package com.cookplanner.controller;

import com.cookplanner.models.User;
import com.cookplanner.models.UserRole;
import com.cookplanner.repositories.Roles;
import com.cookplanner.repositories.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

/**
 * @author Created by Yassine on 2/19/17.
 */

@Controller
public class AuthenticationController {

    private Users usersRepository;
    private PasswordEncoder encoder;

    @Autowired
    Roles roles;

    @Autowired
    public AuthenticationController(Users usersRepository, PasswordEncoder encoder) {
        this.usersRepository = usersRepository;
        this.encoder = encoder;
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "/users/login";
    }

    @GetMapping("/register")
    public String showRegisterForm (Model m){
        m.addAttribute("user", new User());
        return "/users/register";
    }

    @PostMapping("/register")
    public String registerUser(@Valid User user,
                               Errors validation,
                               Model model,
                               @RequestParam(name = "password_confirm") String confirmPassword) {
        if(!confirmPassword.equals(user.getPassword())){
            validation.rejectValue(
                    "password",
                    "user.password",
                    "your password don't match"
            );
        }

        if(validation.hasErrors()){
            model.addAttribute("errors", validation);
            model.addAttribute("user", user);
            return "/users/register";
        }
        String hashedPassword = encoder.encode(user.getPassword());
        user.setPassword(hashedPassword);
        User newUser = usersRepository.save(user);
        UserRole userRole = new UserRole();
        userRole.setRole("ROLE_USER");
        userRole.setUserId(newUser.getId());
        roles.save(userRole);
        return "redirect:/login";
    }
}
