package controllers;

import dao.DBconn;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("Register.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Registration logic
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        int age = Integer.parseInt(request.getParameter("age"));
        // Save user data to the database
        DBconn.insertUserData(username, password, age);
        response.sendRedirect("Login.jsp");
    }

//    @WebFilter("/register")
    public static class RegistrationFilter implements Filter {

        @Override
        public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
                throws IOException, ServletException {

            // Registration filter logic
            int age = Integer.parseInt(request.getParameter("age"));

            if (age >= 18) {
                chain.doFilter(request, response);
            } else {
                request.getRequestDispatcher("/error.jsp").forward(request, response);
            }
        }
    }
}


