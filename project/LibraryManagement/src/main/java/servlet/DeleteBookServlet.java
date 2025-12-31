package main.java.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

import main.java.dao.BookDao;

public class DeleteBookServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        BookDao dao = new BookDao();

        int status = dao.deleteBook(id);

        if (status > 0) {
            response.sendRedirect("viewBooks.jsp");
        } else {
            response.getWriter().println("Error deleting book.");
        }
    }
}
