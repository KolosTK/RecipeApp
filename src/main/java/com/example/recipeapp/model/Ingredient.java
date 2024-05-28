package com.example.recipeapp.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public class Ingredient {


    

    public Ingredient(Integer id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    @NotNull
    private Integer id;
    @NotEmpty
    private String name;
    @Positive
    @NotNull
    private BigDecimal price;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }



    public Ingredient(BigDecimal price) {
        this.price = price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
