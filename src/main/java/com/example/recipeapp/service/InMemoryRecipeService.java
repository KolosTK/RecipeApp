package com.example.recipeapp.service;

import com.example.recipeapp.model.Recipe;
import com.example.recipeapp.model.User;

import java.util.List;

public class InMemoryRecipeService implements IRecipeService {
    @Override
    public User addRecipe(Recipe recipe) {
        return null;
    }

    @Override
    public List<Recipe> getAllRecipes() {
        return List.of();
    }

    @Override
    public User findById(Integer id) {
        return null;
    }

    @Override
    public User updateRecipe(Integer id, Recipe recipe) {
        return null;
    }

    @Override
    public Boolean deleteById(Integer id) {
        return null;
    }
}
