package com.example.recipeapp.controller;

import com.example.recipeapp.exception.IngredientNotFoundException;
import com.example.recipeapp.model.Ingredient;
import com.example.recipeapp.repository.IngredientRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "/api/ingredients")
public class IngredientController {
    private final IngredientRepository ingredientRepository;

    public IngredientController(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }
    @GetMapping
    List<Ingredient> findAll(){
        return ingredientRepository.findAllIngredients();
    }
    @GetMapping("{id}")
    public Ingredient findIngredientById(@PathVariable("id") Integer id){
        Ingredient ingredient = ingredientRepository.findIngredientById(id);
        if (ingredient ==null) {
            throw new IngredientNotFoundException();
        }
        return ingredient;
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseEntity<Ingredient> addIngredient(@Valid @RequestBody Ingredient ingredient) {
        ingredientRepository.create(ingredient);
        return new ResponseEntity<>(ingredient, HttpStatus.CREATED);
    }
    
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("{id}")
    public void updateIngredient(@Valid @RequestBody Ingredient ingredient, @PathVariable Integer id ) {
        ingredientRepository.findIngredientByIdAndUpdate(ingredient,id);
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping({"{id}"})
    public void deleteIngredient(@PathVariable Integer id) {
        ingredientRepository.deleteById(id);
    }

}
