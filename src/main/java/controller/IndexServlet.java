package controller;

import model.Burger;
import model.DaoFactory;
import model.Soda;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "IndexServlet", urlPatterns = "")
public class IndexServlet extends HttpServlet {
    // we want to display our 'home page' using this servlet, when someone loads
    //  'http://localhost:8080/'

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // this is where we want to tell the Tomcat server to display the webapp/index.jsp template file (as a webpage)

        // Get all the burgers to a list with links to their individual profile
        List<Burger> allBurgers = new ArrayList<>();
        allBurgers.add(DaoFactory.getBurgersDao().findById(1L)); //bigMac
        allBurgers.add(DaoFactory.getBurgersDao().findById(2L)); //homestyle
        allBurgers.add(DaoFactory.getBurgersDao().findById(3L)); //quarter pounder
        // Send that list to our JSP page, as a parameter
        // Name in "quotes" is the variable name we'll use in our JSP,
        // and the second argument is the actual value we are sending to JSP

        //sends the list of Burger to the attribute 'allburgers'
        req.setAttribute("allBurgers", allBurgers);


        // create a list of all our existing sodas
        List<Soda> allSodas = new ArrayList<>();
        allSodas.add(DaoFactory.getSodasDao().findById(1L)); // coke
        allSodas.add(DaoFactory.getSodasDao().findById(2L)); // drpepper
        allSodas.add(DaoFactory.getSodasDao().findById(3L)); // sprite

        // add a new attribute called "allSodas" or something similar
        req.setAttribute("allSodas", allSodas);


        List<String> cokeSize = new ArrayList<>();
        for ( Soda soda : allSodas ) {

            switch (soda.getQuantity()) {
                case 1:
                    cokeSize.add("Small");
                    break;
                case 2:
                    cokeSize.add("Medium");
                    break;
                case 3:
                    cokeSize.add("SuperSize");
                    break;
                default:
                    cokeSize.add("Huh?");
                    break;
            }

        }

        //  [ "medium", "medium", "Super-Size" ]
        req.setAttribute("cokeSizes", cokeSize);



        // Send that list to our JSP page, as a parameter
        // Name in "quotes" is the variable name we'll use in our JSP,
        // and the second argument is the actual value we are sending to JSP
       /* req.setAttribute("completeBurgerList", allBurgers);
        req.setAttribute("truthiness", false);*/



        // The FUN way!!
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
        // we want to load the index.jsp template, when this Servlet is called upon
        // END: The FUN way!!
    }
}