package com.example.recipeapp.model;

import java.math.BigDecimal;

public class Ingredient {
    private Integer id;
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
