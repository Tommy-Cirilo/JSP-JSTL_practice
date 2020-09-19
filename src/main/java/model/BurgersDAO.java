package model;
import java.util.ArrayList;
import java.util.List;


//This class will implement the burgers interface
//therefore it must have all the methods defined in burgers
public class BurgersDAO implements Burgers{

    //create a temporary list, to hold the burgers as they are created
    private List<Burger> burgers = new ArrayList<>();

    public BurgersDAO() {

        //BigMac
        List<Ingredient> bigMacingredients = new ArrayList<>();
        bigMacingredients.add(DaoFactory.getIngredientsDao().findById(7L));
        bigMacingredients.add(DaoFactory.getIngredientsDao().findById(6L));
        bigMacingredients.add(DaoFactory.getIngredientsDao().findById(3L));
        bigMacingredients.add(DaoFactory.getIngredientsDao().findById(1L));

        Burger bigMac = new Burger("Big Mac", bigMacingredients);
        burgers.add(bigMac);
        bigMac.setId(1L);

        //home style
        List<Ingredient> homeStyleingredients = new ArrayList<>();
        homeStyleingredients.add(DaoFactory.getIngredientsDao().findById(7L));
        homeStyleingredients.add(DaoFactory.getIngredientsDao().findById(6L));
        homeStyleingredients.add(DaoFactory.getIngredientsDao().findById(3L));
        homeStyleingredients.add(DaoFactory.getIngredientsDao().findById(2L));
        homeStyleingredients.add(DaoFactory.getIngredientsDao().findById(1L));

        Burger homeStyle = new Burger("Home Style", homeStyleingredients);
        burgers.add(homeStyle);
        homeStyle.setId(2L);

        //quarter pounder
        List<Ingredient> QuarterPounderingredients = new ArrayList<>();
        QuarterPounderingredients.add(DaoFactory.getIngredientsDao().findById(7L));
        QuarterPounderingredients.add(DaoFactory.getIngredientsDao().findById(6L));
        QuarterPounderingredients.add(DaoFactory.getIngredientsDao().findById(3L));
        QuarterPounderingredients.add(DaoFactory.getIngredientsDao().findById(1L));

        Burger QuarterPounder = new Burger("Home Style", QuarterPounderingredients);
        burgers.add(QuarterPounder);
        QuarterPounder.setId(3L);


    }


    //create some burgers that contain those ingredients

    //BigMac = patty x 2, buns x 3, cheese x1, pickles x3

    //homestyle = patty x 1, buns x 2, pickles x 3, tomatoes x 2

    //quarter pounder = patty x2, buns x2, pickles x3, tomatoes x2





    //this method will search for a burger by its id
    //and return the full burger object
    @Override
    public Burger findById(long id) {
        return burgers.get((int)id +1);
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
