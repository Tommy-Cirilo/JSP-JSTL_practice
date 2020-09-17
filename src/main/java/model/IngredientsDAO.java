package model;

import java.util.ArrayList;
import java.util.List;

public class IngredientsDAO implements Ingredients {

    //create a temporary list, to hold the burgers as they are created
    private List<Ingredient> ingredients = new ArrayList<>();


    public long createIngredient(Ingredient ingredient) {
        ingredient.setId(ingredients.size() + 1);

        ingredients.add(ingredient);

        return ingredient.getId();
    }

    //this method will search for a burger by its id
    //and return the full burger object
    @Override
    public Ingredient findById(long id) {
        return ingredients.get((int) id + 1);
    }
}