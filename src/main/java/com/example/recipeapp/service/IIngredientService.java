package com.example.recipeapp.service;

import com.example.recipeapp.model.Ingredient;
import com.example.recipeapp.model.User;

import java.util.List;

public interface IIngredientService {
    User addIngredient(Ingredient ingredient);
    List<User> getAllIngredients();
    User findById(Integer id);
    User updateIngredient(Integer id,Ingredient ingredient);
    Boolean deleteById(Integer id);
}
