package io.github.nebubit.guru.services;

import io.github.nebubit.guru.models.Recipe;
import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}