import java.sql.*;
import java.util.Scanner;

public class BooksApp{
    public static void main(String[] args) {
        try {
            // Establish database connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");

            PreparedStatement insertStatement = connection.prepareStatement("INSERT INTO Books (bookName, bookReleaseDate, bookAuthor) VALUES (?, ?, ?)");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Book ID ");
            int bookId = scanner.nextInt();
            System.out.print("Enter Book name ");
            String bookName = scanner.nextLine();
            System.out.print("Enter Release Date ");
            String releaseDate = scanner.nextLine();
            System.out.print("Enter Book author ID ");
            int authorId = scanner.nextInt();

            insertStatement.setString(1, bookName);
            insertStatement.setString(2, releaseDate);
            insertStatement.setInt(3, authorId);
            insertStatement.executeUpdate();
            insertStatement.close();
            connection.close();
            System.out.println("Book record inserted successfully!");

            PreparedStatement selectStatement = connection.prepareStatement("SELECT b.bookName, a.authorName FROM Books b INNER JOIN Author a ON b.bookAuthor = a.authorId WHERE b.bookName LIKE ?");
            System.out.print("Enter book name to search: ");
            String searchBookName = scanner.nextLine();
            selectStatement.setString(1, "%" + searchBookName + "%");
            ResultSet resultSet = selectStatement.executeQuery();
            while (resultSet.next()) {
                String book = resultSet.getString("bookName");
                String author = resultSet.getString("authorName");
                System.out.println("Book: " + book + ", Author: " + author);
            }

            resultSet.close();
            selectStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
    
}

