package main.java.dao;

import java.sql.*;
import java.util.*;
import main.java.model.Book;

public class BookDao {

    // ADD BOOK
    public int addBook(Book book) {
        int status = 0;
        try {
            Connection conn = DBConnection.getConnection();
            String sql = "INSERT INTO books (title, author, category, quantity) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setString(3, book.getCategory());
            ps.setInt(4, book.getQuantity());

            status = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    // GET ALL BOOKS
    public List<Book> getAllBooks() {
        List<Book> list = new ArrayList<>();

        try {
            Connection conn = DBConnection.getConnection();
            String sql = "SELECT * FROM books ORDER BY id ASC";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Book b = new Book(
                    rs.getInt("id"),
                    rs.getString("title"),
                    rs.getString("author"),
                    rs.getString("category"),
                    rs.getInt("quantity")
                );
                list.add(b);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    // GET BOOK BY ID
    public Book getBookById(int id) {
        Book book = null;

        try {
            Connection conn = DBConnection.getConnection();
            String sql = "SELECT * FROM books WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                book = new Book(
                    rs.getInt("id"),
                    rs.getString("title"),
                    rs.getString("author"),
                    rs.getString("category"),
                    rs.getInt("quantity")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return book;
    }

    // UPDATE BOOK
    public int updateBook(Book book) {
        int status = 0;

        try {
            Connection conn = DBConnection.getConnection();
            String sql = "UPDATE books SET title=?, author=?, category=?, quantity=? WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setString(3, book.getCategory());
            ps.setInt(4, book.getQuantity());
            ps.setInt(5, book.getId());

            status = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    // DELETE BOOK
    public int deleteBook(int id) {
        int status = 0;

        try {
            Connection conn = DBConnection.getConnection();
            String sql = "DELETE FROM books WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, id);

            status = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }
}
