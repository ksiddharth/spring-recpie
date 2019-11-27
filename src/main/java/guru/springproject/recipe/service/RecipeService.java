package guru.springproject.recipe.service;

import guru.springproject.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    public Set<Recipe> findAllRecipes();
}
