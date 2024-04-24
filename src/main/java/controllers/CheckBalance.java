package controllers;

import dao.DBconn;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/checkBalance")
public class CheckBalance extends HttpServlet {

    // Inside your CheckBalance servlet
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the username from the session or wherever you store it after login
        String username = (String) request.getSession().getAttribute("username");
        request.setAttribute("username", username);

        if (username != null) {
            // Call the checkBalance method
            double balance = DBconn.checkBalance(username);

            // Set balance as a request attribute
            System.out.println("Balance attribute set: " + balance);
            request.setAttribute("balance", balance);

            // Forward the request to the Dashboard.jsp page
            RequestDispatcher dispatcher = request.getRequestDispatcher("Dashboard.jsp");
            dispatcher.forward(request, response);
        } else {
            // Redirect to login if the username is not available
            response.sendRedirect("Login.jsp");
        }
    }
}