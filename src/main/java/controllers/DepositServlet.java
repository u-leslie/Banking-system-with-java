package controllers;

import dao.DBconn;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet("/deposit")
public class DepositServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("Dashboard.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the username from the session
        String username = (String) request.getSession().getAttribute("username");
        request.setAttribute("username", username);

        if (username != null) {
            // Get the amount to deposit from the form parameter
            double amount = Double.parseDouble(request.getParameter("amount"));

            // Call the depositAmount method
            DBconn.depositAmount(username, amount);
            request.getSession().setAttribute("username", username);
            response.sendRedirect("Dashboard.jsp?username=" + URLEncoder.encode(username, "UTF-8"));
//            response.sendRedirect("Dashboard.jsp");
        } else {
            // Redirect to login if the username is not available
            response.sendRedirect("Login.jsp");
        }
    }
}
