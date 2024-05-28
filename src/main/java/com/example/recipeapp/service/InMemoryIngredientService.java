package com.example.recipeapp.service;

import com.example.recipeapp.model.Ingredient;
import com.example.recipeapp.model.User;

import java.util.List;

public class InMemoryIngredientService implements IIngredientService {
    @Override
    public User addIngredient(Ingredient ingredient) {
        return null;
    }

    @Override
    public List<User> getAllIngredients() {
        return List.of();
    }

    @Override
    public User findById(Integer id) {
        return null;
    }

    @Override
    public User updateIngredient(Integer id, Ingredient ingredient) {
        return null;
    }

    @Override
    public Boolean deleteById(Integer id) {
        return null;
    }
}
