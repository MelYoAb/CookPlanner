package com.cookplanner.controller;

import com.cookplanner.models.*;
import com.cookplanner.repositories.Categories;
import com.cookplanner.repositories.Ingredients;
import com.cookplanner.repositories.IngredientsList;
import com.cookplanner.repositories.Recipes;
import com.cookplanner.services.UserSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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
    IngredientsList ingredientsListSrv;

    @Autowired
    Ingredients ingredientsDAO;

    @Autowired
    Categories categoriesDAO;

    @Value("${uploads}")
    private String uploadPath;

    @GetMapping("/all")
    public String viewAllRecipe(Model model) {
        model.addAttribute("recipes", recipesDao.findAll());
        return "/recipes/recipes";
    }

    @GetMapping("/create")
    public String viewCreateRecipeForm(Model model) {
        model.addAttribute("recipe", new Recipe());
        return "/recipes/create";
    }

    @GetMapping("/ingredients.json")
    public @ResponseBody
    List<Ingredient> retrieveAllIngredients(){
        return  ingredientsDAO.findAllIndredients();
    }

    @PostMapping("/create")
    public String createRecipe(@Valid Recipe recipe, Errors validation, Model model,
                               @RequestParam(name = "image_file") MultipartFile uploadedFile,
                               @RequestParam(value = "ingredients[]") String[] ingredients,
                               @RequestParam(value = "qnty[]") List<String> qnty,
                               @RequestParam(value = "selectedCategory") String selectedCategory,
                               @RequestParam(name = "new_ingredient") String new_ingredient,
                               @RequestParam(name = "quantity") String quantity) {


        if (validation.hasErrors()) {
            model.addAttribute("errors", validation);
            model.addAttribute("recipe", recipe);
            model.addAttribute("ingredients", ingredientsDAO.findAllIndredients());
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

        int counter = 0;

        List<String> newArray = new ArrayList<>();
        for (String q : qnty) {
            if (!(q.equals(""))) {
                newArray.add(q);
            }
        }

        for (String ingr : ingredients) {
            IngredientList ingredientList = new IngredientList();
            ingredientList.setRecipe(savedRecipe);
            Ingredient savedIngredient = ingredientsListSrv.findByIngredient(ingr);
            ingredientList.setIngredient(savedIngredient);
            ingredientList.setQty(newArray.get(counter));
            counter++;
            ingredientsListSrv.save(ingredientList);
        }

        if (!(quantity.isEmpty() || selectedCategory.isEmpty() || new_ingredient.isEmpty())) {
            Category newCategory = new Category();
            newCategory.setName(selectedCategory);
            Category savedCategory = categoriesDAO.save(newCategory);

            Ingredient newIngredient = new Ingredient();
            newIngredient.setIngredient(new_ingredient);
            newIngredient.setCategory(savedCategory);
            Ingredient savedIngredient = ingredientsDAO.save(newIngredient);

            IngredientList newIngredientList = new IngredientList();
            newIngredientList.setRecipe(savedRecipe);
            newIngredientList.setIngredient(savedIngredient);
            newIngredientList.setQty(quantity);
            ingredientsListSrv.save(newIngredientList);
        }

        return "redirect:/create";
    }

    @GetMapping("/single/{id}")
    public String viewSingle(@PathVariable long id, Model model) {
        Recipe singleRecipe = recipesDao.findOne(id);
        model.addAttribute("recipe", singleRecipe);
        return "recipes/single";
    }

}
