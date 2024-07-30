package DatabaseDAO.Patient_Data;
import java.sql.*;
public class PatientDAO {
  Connection conn;
  PatientDAO() throws SQLException,ClassNotFoundException{
      conn=DatabaseConnection.getConn();
  }  
  public void createPatientRecords(Patient patient){
    String sql="insert into Patient(patientName,medicalHistory) values(?,?)";
    try{
      PreparedStatement ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
      ps.setString(1,patient.getPatientName());
      ps.setString(2,patient.getMedicalHistory());
      ps.executeUpdate();
      ResultSet generatedkeys=ps.getGeneratedKeys();
      if(generatedkeys.next()){
          patient.setPatientID(generatedkeys.getInt(1));
      }
    }
      catch(SQLException se){
        se.printStackTrace();
      }
    }
    public Patient retrievePatient(int patientId) throws RecordNotFound{
      Patient patient=new Patient();
     
      try{
        String sql="select * from Patient where patientId= ?;";
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setInt(1,patientId);
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
            System.out.println(rs);
            patient.setPatientID(rs.getInt("patientID"));
            patient.setPatientName(rs.getString("patientName"));
            patient.setMedicalHistory(rs.getString("medicalHistory"));
            return patient;
        }
        else{
          throw new RecordNotFound("Record is not found");
 
        }
      }
      catch(SQLException e){
        e.printStackTrace();
      }
      return patient;
    }
  }