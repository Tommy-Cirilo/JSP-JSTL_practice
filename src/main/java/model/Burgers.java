package model;

//this interface will define all the methods we need to access the data from our bean
//This is the interace that the DAO will implement
public interface Burgers {
    //we need a method to go find a burger by its id
    //we want the return object to be type 'Burger'

    Burger findById(long id);

    //we need a method to create a new burger, and return the ID (long)
    // once it is successfully created

    long createBurger(Burger burger);
}
