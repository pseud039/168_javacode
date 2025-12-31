package main.java.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import main.java.dao.AdminDao;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        AdminDao dao = new AdminDao();

        if (dao.validate(username, password)) {
            response.sendRedirect("dashboard.jsp");
        } else {
            response.getWriter().println("Invalid username or password");
        }
    }
}
