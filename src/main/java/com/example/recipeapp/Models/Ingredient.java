package com.example.recipeapp.Models;

import java.math.BigDecimal;

public class Ingredient {
    
    private BigDecimal price;
    private String name;
    

    public Ingredient(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
