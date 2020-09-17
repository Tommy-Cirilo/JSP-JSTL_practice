package model;
import java.util.ArrayList;
import java.util.List;

//This class will implement the burgers interface
//therefore it must have all the methods defined in burgers
public class BurgersDAO implements Burgers{

    //create a temporary list, to hold the burgers as they are created
    private List<Burgers> burgers = new ArrayList<>();

    //this method will search for a burger by its id
    //and return the full burger object
    @Override
    public Burger findById(long id) {
        return burgers.get((int)id -1);
    }

    //this method will create a burger object in our local repo
    //of burgers, and return the newly added burgers id
    @Override
    public long createBurger(Burger burger) {
        burger.setId(burgers.size() + 1);
        burgers.add(burger);
        return 0;
    }
}
