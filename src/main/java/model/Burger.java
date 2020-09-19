package model;

import java.io.Serializable;
import java.util.List;

//must implement Serializable for bean when using mvc
public class Burger implements Serializable {


    // properties for bun, pickles, numPatties, Cheese
    //must be able to differentiate each burger from the rest, so a uniqe id is required
    private long id;
    private String burgerName;
    private List<Ingredient> ingredients;
   /* private int numBuns; // 3 for big mac, etc
    private int numPickles;
    private int numPatties;
    private boolean cheese; // true or false*/


    //TODO: Segment the condiments out into their own bean (i.e public class ingredient)
    //private List<Ingredient> ingredients;
    //we have to craete a zero-argument constructor so java can reserve space and memory for this object
    public Burger(){}

    // constructor
    public Burger(String burgerName, List<Ingredient> ingredientList) {
        // set each of the local class properties, to the arguments passed into this constructor
        this.burgerName = burgerName;
        this.ingredients = ingredientList;

        /*this.numBuns = numberBuns;
        this.numPickles = numberPickles;
        numPatties = numberPatties;
        cheese = hasCheese;*/
    }

//    Getters and Setters

    public String getBurgerName() {
        return burgerName;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    // public Burger(int numBuns, int numPickles, int numPatties, boolean cheese) {
    //     this.numBuns = numBuns;
    //     this.numPickles = numPickles;
    //     this.numPatties = numPatties;
    //     this.cheese = cheese;
    // }

    // ctrl - enter (to get the menu where you can create getters/setters)

    /*public int getNumBuns() {
        return numBuns;
    }

    public void setNumBuns(int numBuns) {
        this.numBuns = numBuns;
    }

    public int getNumPickles() {
        return numPickles;
    }

    public void setNumPickles(int numPickles) {
        this.numPickles = numPickles;
    }

    public int getNumPatties() {
        return numPatties;
    }

    public void setNumPatties(int numPatties) {
        this.numPatties = numPatties;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }*/

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Ingredient> getIngredients(){
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

}