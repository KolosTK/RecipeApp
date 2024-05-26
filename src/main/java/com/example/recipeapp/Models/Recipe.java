package com.example.recipeapp.Models;

import java.math.BigDecimal;
import java.util.LinkedList;

public class Recipe {
    private Long id;
    private LinkedList<Ingredient> ingredients;
    private String name;
    private Difficulty difficulty;
    private BigDecimal price;
    private Integer rating;


    public Recipe(String name) {
        this.name = name;
    }

    public Recipe(LinkedList<Ingredient> ingredients, String name, Difficulty difficulty, BigDecimal price, Integer rating) {
        this.ingredients = ingredients;
        this.name = name;
        this.difficulty = difficulty;
        this.price = price;
        this.rating = rating;
        if(!ingredients.isEmpty()) calculatePrice();
    }
    
    public Recipe(Long id, LinkedList<Ingredient> ingredients, String name, Difficulty difficulty, BigDecimal price, Integer rating) {
        this.id = id;
        this.ingredients = ingredients;
        this.name = name;
        this.difficulty = difficulty;
        this.price = price;
        this.rating = rating;
        if(!ingredients.isEmpty()) calculatePrice();
    }
    private void calculatePrice(){
        for (Ingredient ingredient : ingredients) {
            price.add(ingredient.getPrice());
        }
    }


}
