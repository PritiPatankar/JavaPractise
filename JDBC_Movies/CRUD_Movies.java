package JDBC_Movies;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.sql.*;

public class CRUD_Movies {
    MoviesBean M = new MoviesBean();
    Scanner sc = new Scanner(System.in);

    void getData(){
        System.out.println("Enter Movie ID: ");
        M.setMovieID(sc.nextInt());
        System.out.println("Enter Movie Name: ");
        M.setMovieName(sc.next());
        System.out.println("Enter Movie Release Year: ");
        M.setmovieReleasedYear(sc.nextInt());
    }

    void insertData(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Movies_Data", "root","root");
            PreparedStatement ps = connection.prepareStatement("insert into Movies(movieId, MovieName, movieReleasedYear) values(?,?,?)");
            ps.setInt(1, M.getMovieID());
            ps.setString(2, M.getMovieName());
            ps.setDouble(3, M.getmovieReleasedYear());
            int res = ps.executeUpdate();
            if(res>0){
                System.out.println("Inserted Successfully");
            }
            else{
                System.out.println("Error in Inserting");
            }

        }
        catch(ClassNotFoundException cnfe){
            System.out.println(cnfe);
        }
        catch(SQLException sqle){
            System.out.println(sqle);
        }
    }
    void retrieveData(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Movies_Data", "root","root");
            PreparedStatement ps = connection.prepareStatement("select * from Movies");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("Movie ID is: "+ rs.getInt(1));
                System.out.println("Movie Name is: "+ rs.getString(2));
                System.out.println("Movie Release Year is: "+ rs.getInt(3));
            }
        }
        catch(ClassNotFoundException cnfe){
            System.out.println(cnfe);
        }
        catch(SQLException sqle){
            System.out.println(sqle);
        }
    }

    public static void main(String[] args){
        CRUD_Movies cObject = new CRUD_Movies();

        cObject.getData();
        cObject.insertData();
        cObject.retrieveData();

    }

}
