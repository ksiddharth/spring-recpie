package guru.springproject.recipe.controller;

import guru.springproject.recipe.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipeController {

    private RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","index", "index.html"})
    public String indexPage(Model model) {
        model.addAttribute("recipes", recipeService.findAllRecipes());
        return "index";
    }
}
