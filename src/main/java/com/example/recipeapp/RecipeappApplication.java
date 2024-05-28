package com.example.recipeapp;

import com.example.recipeapp.model.Ingredient;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
//import java.util.logging.Logger;

@SpringBootApplication
@RestController
public class RecipeappApplication {
	
	private static final Logger log = LoggerFactory.getLogger(RecipeappApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RecipeappApplication.class, args);
	}
	@Bean
	public CommandLineRunner recipe() {
		return args -> {
			Ingredient ingredient = new Ingredient(4,"apple",new BigDecimal("3.04"));
			log.info("Ingredient is " + ingredient);
		};
	}
}
