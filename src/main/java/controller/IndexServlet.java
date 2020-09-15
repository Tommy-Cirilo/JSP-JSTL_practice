package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "IndexServlet", urlPatterns = "/")
public class IndexServlet extends HttpServlet {
    //We want to display our home page


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //This is where we want to tell the tomcat server to display the webapp/index.jsp

        //The Boring way
//        resp.setContentType("text/html");
//        PrintWriter out = resp.getWriter();
        resp.getWriter().println("Welcome to Burger Galore");
        //end boring way

    }
}
