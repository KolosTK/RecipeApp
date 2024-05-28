package com.example.recipeapp.service;

import com.example.recipeapp.model.Recipe;
import com.example.recipeapp.model.User;

import java.util.List;

public interface IRecipeService {
    User addRecipe(Recipe recipe);
    List<Recipe> getAllRecipes();
    User findById(Integer id);
    User updateRecipe(Integer id, Recipe recipe);
    Boolean deleteById(Integer id);
}
