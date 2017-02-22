package com.cookplanner.controller;

import com.cookplanner.models.Ingredient;
import com.cookplanner.models.IngredientList;
import com.cookplanner.models.Recipe;
import com.cookplanner.repositories.IngredientsList;
import com.cookplanner.repositories.Recipes;
import com.cookplanner.services.UserSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

/**
 * @author Created by Yassine on 2/20/17.
 */

@Controller
public class RecipeController {

    @Autowired
    Recipes recipesDao;

    @Autowired
    UserSvc userSvc;
    @Autowired
    IngredientsList ingredientsList;

    @Value("${uploads}")
    private  String uploadPath;

    @GetMapping("/create")
    public String viewCreateRecipeForm ( Model model) {
        model.addAttribute(new Recipe());
        return "/recipes/create";
    }

    @PostMapping("/create")
    public String createRecipe (@Valid Recipe recipe, Errors validation, Model model,
                                @RequestParam(name = "image_file") MultipartFile uploadedFile,
                                @RequestParam(value = "ingredients[]") String[] ingredients) {

        if(validation.hasErrors()){
            model.addAttribute("errors", validation);
            model.addAttribute("recipe", recipe);
            return "recipes/create";
        }

        // uploadedFile.isEmpty()

        String filename = uploadedFile.getOriginalFilename();
        String filepath = Paths.get(uploadPath, filename).toString();

        File destinationFile = new File(filepath);
        try {
            uploadedFile.transferTo(destinationFile);
            model.addAttribute("message", "Image successfully uploaded!");
        } catch (IOException e) {
            e.printStackTrace();
            model.addAttribute("message", "Oops! Something went wrong! " + e);
        }

//        userRecipe.setUser(userSvc.loggedInUser());
        recipe.setImage(filename);
        Recipe savedRecipe = recipesDao.save(recipe);

        for (String ingr: ingredients
             ) {
            System.out.println(ingr);
        }


//        IngredientList ingredientList = new IngredientList();
//        Ingredient ingredient = new Ingredient();
//        ingredientList.setIngredient(ingredient);
//        ingredientList.setQty(1.5);
//        ingredientList.setRecipe(savedRecipe);
//        ingredientsList.save();
//


        return "redirect:/create";
    }
}
