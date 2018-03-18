package org.perucchi.springs.course.recipe.domain;

import javax.persistence.*;

@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long d;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

    public Long getD() {
        return d;
    }

    public void setD(Long d) {
        this.d = d;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }

}
