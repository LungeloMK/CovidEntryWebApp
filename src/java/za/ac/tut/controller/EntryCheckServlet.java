
package za.ac.tut.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.AccessChecker;


public class EntryCheckServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        boolean mask = request.getParameter("mask")!=null;
        boolean sanitize = request.getParameter("sanitize")!=null;
        double temp = Double.parseDouble(request.getParameter("temperature"));
        
        AccessChecker ac = new AccessChecker();
        String message = ac.checkAccess(mask, sanitize, temp);
        
        request.setAttribute("mask", mask);
        request.setAttribute("sanitize", sanitize);
        request.setAttribute("temp", temp);
        request.setAttribute("message", message);
        
        RequestDispatcher disp = request.getRequestDispatcher("result.jsp");
        disp.forward(request, response);
        
        
    }

   

}
