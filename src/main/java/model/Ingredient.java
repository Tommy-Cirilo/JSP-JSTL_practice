package model;

//we want this class to represent a burger ingredient

import java.io.Serializable;

public class Ingredient implements Serializable {
    // long id
    //string name
    //int quantity
    private long id;
    private String name;
    private int quantity;

    public Ingredient () {};

    public Ingredient(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }




    // TODO: Create all properties with the correct access type (publiv/protected/private)
    // TODO: Create all getters and setters
    // TODO: Create a Zero-argument instructor
    // TODO: Create a constructor with all properties except the ID


}
