package guru.springproject.recipe.domain;

import javax.persistence.*;

@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recpieNotes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecpieNotes() {
        return recpieNotes;
    }

    public void setRecpieNotes(String recpieNotes) {
        this.recpieNotes = recpieNotes;
    }
}
