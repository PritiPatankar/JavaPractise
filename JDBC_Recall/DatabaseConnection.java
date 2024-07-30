package JDBC_Recall;
import java.sql.*;

public class DatabaseConnection{

    public static final String URL="jdbc:mysql://localhost:3306/PatientRecord";
    public static final String USERNAME="root";
    public static final String PASSWORD="root";

    public static Connection getconn() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
    
}
