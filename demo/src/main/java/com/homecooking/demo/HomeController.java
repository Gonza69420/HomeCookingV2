package com.homecooking.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


public class HomeController {

    @GetMapping("/home") //Landing page
    public String home() {
        return "home";
    }

    @GetMapping ("/register") //Register page
    public String register() {
        return "register";
    }
    @GetMapping ("/profile") //Profile page
    public String profile() {
        return "profile";
    }
    @GetMapping ("/recipe") //Recipe page
    public String recipe() {
        return "recipe";
    }
    @GetMapping ("/recipe/add") //Recipe add page
    public String recipeAdd() {
        return "recipe-add";
    }
    @GetMapping ("/recipe/edit") //Recipe edit page
    public String recipeEdit() {
        return "recipe-edit";
    }
    @GetMapping ("/recipe/delete") //Recipe delete page
    public String recipeDelete() {
        return "recipe-delete";
    }
    @GetMapping ("/recipe/search") //Recipe search page
    public String recipeSearch() {
        return "recipe-search";
    }
    @GetMapping ("/recipe/view") //Recipe view page
    public String recipeView() {
        return "recipe-view";
    }
    @GetMapping ("/recipe/view/edit") //Recipe view edit page
    public String recipeViewEdit() {
        return "recipe-view-edit";
    }
    @GetMapping ("/recipe/view/delete") //Recipe view delete page
    public String recipeViewDelete() {
        return "recipe-view-delete";
    }
    @GetMapping ("/recipe/view/add") //Recipe view add page
    public String recipeViewAdd() {
        return "recipe-view-add";
    }
    @GetMapping ("/recipe/view/search") //Recipe view search page
    public String recipeViewSearch() {
        return "recipe-view-search";
    }
    @GetMapping ("/recipe/view/search/edit") //Recipe view search edit page
    public String recipeViewSearchEdit() {
        return "recipe-view-search-edit";
    }

}
