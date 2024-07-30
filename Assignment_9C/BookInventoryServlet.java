package Assignment_9C;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bookinventory")
public class BookInventoryServlet extends HttpServlet {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/bookstore_db";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action != null) {
            switch (action) {
                case "add":
                    addBook(request, response);
                    break;
                default:
                    response.getWriter().write("Invalid action.");
            }
        }
    }

    private void addBook(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String isbn = request.getParameter("isbn");
        String genre = request.getParameter("genre");
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String insertQuery = "INSERT INTO books (title, author, isbn, genre, quantity) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(insertQuery)) {
                stmt.setString(1, title);
                stmt.setString(2, author);
                stmt.setString(3, isbn);
                stmt.setString(4, genre);
                stmt.setInt(5, quantity);
                stmt.executeUpdate();
                response.getWriter().write("Book added successfully!");
            }
        } catch (SQLException e) {
            response.getWriter().write("Error adding book: " + e.getMessage());
        }
    }

    // Implement other methods for update, delete, and search operations

    // Remember to close resources properly (e.g., ResultSet, PreparedStatement, Connection)
}
