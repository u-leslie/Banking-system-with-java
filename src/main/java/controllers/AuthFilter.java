package controllers;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter("/secured/*")
public class AuthFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        // Authorization filter logic
        String role = (String) request.getAttribute("role");

        if ("admin".equals(role)) {
            chain.doFilter(request, response);
        } else {
            request.getRequestDispatcher("/unauthorized.jsp").forward(request, response);
        }
    }
}
