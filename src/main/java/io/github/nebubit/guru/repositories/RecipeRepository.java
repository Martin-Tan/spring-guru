package io.github.nebubit.guru.repositories;

import io.github.nebubit.guru.models.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}