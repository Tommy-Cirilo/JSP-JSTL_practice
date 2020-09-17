package model;

import java.util.ArrayList;
import java.util.List;

public class IngredientsDAO implements Ingredients{

    //create a temporary list, to hold the burgers as they are created
    private List<Ingredient> ingredients = new ArrayList<>();

    //this method will search for a burger by its id
    //and return the full burger object
    @Override
    public Ingredient findById(long id) {
        return ingredients.get((int)id +1);
    }

    //this method will create a burger object in our local repo
    //of burgers, and return the newly added burgers id
    @Override
    public long createBurger(Ingredient ingredient) {
        ingredient.setId(ingredients.size() + 1);
        ingredients.add(ingredient);
        return 0;
    }
}
