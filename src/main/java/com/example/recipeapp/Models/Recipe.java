package com.example.recipeapp.Models;

import ch.qos.logback.core.joran.sanity.Pair;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Recipe {
    private Long id;
    private LinkedList<Pair<Ingredient,Integer>> ingredients;
    private String name;
    private Difficulty difficulty;
    private BigDecimal price;
    private Integer rating;


    public Recipe(String name) {
        this.name = name;
    }

    public Recipe(LinkedList<Pair<Ingredient,Integer>> ingredients, String name, Difficulty difficulty, BigDecimal price, Integer rating) {
        this.ingredients = ingredients;
        this.name = name;
        this.difficulty = difficulty;
        this.price = price;
        this.rating = rating;
        if(!ingredients.isEmpty()) calculatePrice();
    }
    
    public Recipe(Long id, LinkedList<Pair<Ingredient,Integer>> ingredients, String name, Difficulty difficulty, BigDecimal price, Integer rating) {
        this.id = id;
        this.ingredients = ingredients;
        this.name = name;
        this.difficulty = difficulty;
        this.price = price;
        this.rating = rating;
        if(!ingredients.isEmpty()) calculatePrice();
    }
    private void calculatePrice() {
        price = BigDecimal.ZERO;
       for (Pair<Ingredient,Integer> pair : ingredients) {
           price.add(pair.first.getPrice().subtract(BigDecimal.valueOf(pair.second)));
       }
    }


}
