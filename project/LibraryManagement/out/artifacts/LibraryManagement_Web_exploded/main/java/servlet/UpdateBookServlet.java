package main.java.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

import main.java.dao.BookDao;
import main.java.model.Book;

public class UpdateBookServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String category = request.getParameter("category");
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        Book book = new Book(0, title, author, category, quantity);
        BookDao dao = new BookDao();

        int status = dao.addBook(book);

        if (status > 0) {
            response.sendRedirect("viewBooks.jsp");
        } else {
            response.getWriter().println("Error adding book");
        }
    }
}
