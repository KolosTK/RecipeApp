package com.example.recipeapp.repository;

import com.example.recipeapp.model.Ingredient;
import com.example.recipeapp.model.User;
import jakarta.annotation.PostConstruct;
import org.apache.tomcat.Jar;
import org.springframework.stereotype.Repository;

import javax.sound.midi.VoiceStatus;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class IngredientRepository {
    private List<Ingredient> ingredients =new ArrayList<>();
    public List<Ingredient> findAllIngredients() {
        return ingredients;
    }
    public Ingredient findIngredientById(int id) {
        return ingredients
                .stream()
                .filter(u -> id==u.getId())
                .findFirst()
                .orElseThrow();
    }
    public void create (Ingredient ingredient) {
        ingredients.add(ingredient);
    }
    public void findIngredientByIdAndUpdate (Ingredient updatedIngredient,Integer id) {
       
            Ingredient existingIngredient = findIngredientById(id);
            if (existingIngredient != null) {
                existingIngredient.setName(updatedIngredient.getName());
                existingIngredient.setPrice(updatedIngredient.getPrice());
            }
    }
    public void deleteById(Integer id){
        ingredients.removeIf(ingredient -> ingredient.getId().equals(id));
    }
    @PostConstruct
    private void init(){
        ingredients.add(new Ingredient(1,"Egg",new BigDecimal("4.00")));
        ingredients.add(new Ingredient(2,"Milk",new BigDecimal("40.30")));
    }
}
