package guru.springproject.recipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipeController {
    @RequestMapping({"","/","index", "index.html"})
    public String indexPage() {
        return "index";
    }
}
