package com.example.recipeapp.repository;

import com.example.recipeapp.model.Recipe;
import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;

public class RecipeRepository {
    private static final List<Recipe> DATABASE_RECIPES = new ArrayList<Recipe>();
    @PostConstruct
    private void init() {
//        DATABASE_RECIPES.add()
    }
}
