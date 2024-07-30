import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.sql.*;

public class CRUD_Employee{
    EmployeeBean E = new EmployeeBean();
    Scanner sc = new Scanner(System.in);
    void getData(){
        System.out.println("Enter your name: ");
        E.setName(sc.next());
        System.out.println("Enter your department: ");
        E.setDept(sc.next());
        System.out.println("Enter your Salary: ");
        E.setSalary(sc.nextFloat());
        System.out.println("Enter your Email ID: ");
        E.setEmailID(sc.next());
        System.out.println("Enter your Phone No: ");
        E.setPhoneNo(sc.nextLong());
    }

    void insertData(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_Data", "root","root");
            PreparedStatement ps = connection.prepareStatement("insert into Employee(name, dept, salary, emailID, phoneNo) values(?,?,?,?,?)");
            ps.setString(1, E.getName());
            ps.setString(2, E.getDept());
            ps.setDouble(3, E.getSalary());
            ps.setString(4, E.getEmailID());
            ps.setLong(5, E.getPhoneNo());
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
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_Data", "root","root");
            PreparedStatement ps = connection.prepareStatement("select * from Employee");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("Employee ID is: "+ rs.getInt(1));
                System.out.println("Employee Name: "+ rs.getString(2));
                System.out.println("Employee Department: "+ rs.getString(3));
                System.out.println("Employee Salary: "+ rs.getFloat(4));
                System.out.println("Employee Email Inserted: "+ rs.getString(5));
                System.out.println("Employee Mobile No. is: "+ rs.getInt(6));
            }
        }
        catch(ClassNotFoundException cnfe){
            System.out.println(cnfe);
        }
        catch(SQLException sqle){
            System.out.println(sqle);
        }
    }

    void update(){
        System.out.println("Enter the Sno for the person u want to perform Updattion");
    }

    public static void main(String[] args){
        CRUD_Employee cObject = new CRUD_Employee();

        cObject.getData();
        cObject.insertData();
        cObject.retrieveData();
    }
}