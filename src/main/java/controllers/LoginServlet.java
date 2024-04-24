package controllers;

import beans.UserBean;
import dao.DBconn;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("Login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Login logic
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        UserBean user = new UserBean();
        user.setUsername(username);
        user.setPassword(password);

        // Authenticate user (for simplicity, hardcoded authentication)
        boolean isAuthenticated = DBconn.authenticateUser(username, password);

        // Set isAuthenticated attribute
        request.setAttribute("isAuthenticated", isAuthenticated);

        if (isAuthenticated) {
            request.getSession().setAttribute("username", username);
            request.getSession().setAttribute("user", user);
            response.sendRedirect("Dashboard.jsp?username=" + URLEncoder.encode(username, "UTF-8"));
        } else {
            response.sendRedirect("Login.jsp?error=1");
        }
    }


//    @WebFilter("/loginFilter")
    public static class AuthenticationFilter implements jakarta.servlet.Filter {

        @Override
        public void doFilter(jakarta.servlet.ServletRequest request, jakarta.servlet.ServletResponse response, jakarta.servlet.FilterChain chain)
                throws IOException, ServletException {

            // Login logic
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            // Authenticate user (for simplicity, hardcoded authentication)
            boolean isAuthenticated = DBconn.authenticateUser(username, password);


            if (isAuthenticated) {
                System.out.println("Authentication successful");
                chain.doFilter(request, response);
            } else {
                System.out.println("Authentication failed");
            }
        }
    }
}





