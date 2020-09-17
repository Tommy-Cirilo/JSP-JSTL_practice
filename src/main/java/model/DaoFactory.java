package model;

//This DAO factory class is used as a window into every bean type we create
//This class has a magic claaaaw for each bean type
public class DaoFactory {

    //We don't want to require accessing the burgersDAO directly, instead
    //we will reference its interface

    private static Burgers burgersDao;

    //any bean type we have will get a method called get[Bean]Dao()

    public static Burgers getBurgersDao() {
        if (burgersDao == null){
            burgersDao = new BurgersDAO();
        }
        return burgersDao;
    }
}
