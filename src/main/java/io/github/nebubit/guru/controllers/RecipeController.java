package io.github.nebubit.guru.controllers;

import io.github.nebubit.guru.models.Category;
import io.github.nebubit.guru.models.UnitOfMeasure;
import io.github.nebubit.guru.repositories.CategoryRepository;
import io.github.nebubit.guru.repositories.UnitOfMeasureRepository;
import io.github.nebubit.guru.services.RecipeService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.Optional;

@Controller
public class RecipeController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;
    private RecipeService recipeService;

    public RecipeController(
        CategoryRepository categoryRepository,
        UnitOfMeasureRepository unitOfMeasureRepository,
        RecipeService recipeService
    ) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
        this.recipeService = recipeService;
    }

    @RequestMapping({"recipe"})
    public String getIndexPage(Model model) {

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat Id is: " + categoryOptional.get().getId());
        System.out.println("UOM ID is: " + unitOfMeasureOptional.get().getId());

        // For template
        model.addAttribute("recipes", recipeService.getRecipes());

        return "recipe";
    }
}