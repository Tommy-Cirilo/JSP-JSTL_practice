package model;

import java.util.ArrayList;
import java.util.List;

public class IngredientsDAO implements Ingredients {

    //create a temporary list, to hold the burgers as they are created
    private List<Ingredient> ingredients = new ArrayList<>();

    //create some ingredients
    public IngredientsDAO(){
        Ingredient pickles = new Ingredient();
        pickles.setId(1L);
        pickles.setName("Pickels (x3)");
        pickles.setQuantity(3);
        ingredients.add(pickles);


        Ingredient tomatoes = new Ingredient();
        tomatoes.setId(2L);
        tomatoes.setName("Tomatoes (x2)");
        tomatoes.setQuantity(2);
        ingredients.add(tomatoes);

        Ingredient cheese = new Ingredient();
        cheese.setId(3L);
        cheese.setName("Cheese (x2)");
        cheese.setQuantity(2);
        ingredients.add(cheese);

        Ingredient patty = new Ingredient();
        patty.setId(4L);
        patty.setName("Patty (x1)");
        patty.setQuantity(1);
        ingredients.add(patty);

        Ingredient bun = new Ingredient();
        bun.setId(5L);
        bun.setName("Bun (x2)");
        bun.setQuantity(2);
        ingredients.add(bun);
    }




    @Override
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