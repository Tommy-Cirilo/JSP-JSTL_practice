package model;

public interface Ingredients {

    //find an ingredient method
    Ingredient findById (long id);

    //add an ingredient to inventory
    long createIngredient(Ingredient ingredient);
}
