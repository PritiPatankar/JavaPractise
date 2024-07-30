package JDBC_Recall;

import java.sql.SQLException;
import java.sql.*;

public class PatientsDAO{
    //constructor - try-catch sqlexception - conn variable
    private static Connection conn;
    public PatientsDAO() throws ClassNotFoundException{
        try{
            conn = DatabaseConnection.getconn();
        }
        catch(SQLException sqle){
            sqle.printStackTrace();
        }
        catch(ClassNotFoundException cnfe){
            cnfe.printStackTrace();
        }
    }

    //createrecord method - sql - try(ps = statement.return_){ ps queries execution - store result
    //in resultset = if rs.next set patientID}catch sql
    public void createPatient(Patient patient) throws SQLException{
        String sql = "insert into Patient(patientName, medicalHistory) values(?,?)";
        try(PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS) ){
            ps.setString(1, patient.getPatientName());
            ps.setString(2, patient.getMedicalHistory());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if(rs.next()){
                patient.setPatientID(rs.getInt(1));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }

    }

    //retrive ddata
    public Patient getPatientByID(int patientID) throws RecordNotFoundException{
        String sql = "select * from Patient where patientID = ?";
        try(PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, patientID);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                Patient patient = new Patient();
                patient.setPatientID(rs.getInt("PatientID"));
                patient.setPatientName(rs.getString("patientName"));
                patient.setMedicalHistory(rs.getString("medicalHistory"));
                return patient;
            }
            else{
                throw new RecordNotFoundException("Patient with ID "+ patientID+ " not found");
            }
        }
        catch(SQLException sqle){
            sqle.printStackTrace();
            return null;
        }
    } 

    public static void Close() {
        try{
            if(conn != null){
                conn.close();
            }
        }
        catch(SQLException sqle){
            sqle.printStackTrace();
        }
    }




       
}