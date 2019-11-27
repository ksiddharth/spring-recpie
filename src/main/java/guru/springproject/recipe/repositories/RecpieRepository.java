package guru.springproject.recipe.repositories;

import guru.springproject.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecpieRepository extends CrudRepository<Recipe, Long> {
}
