package JDBC_Recall;

import java.sql.SQLException;

public class Main{
    public static void main(String[] args) throws ClassNotFoundException,SQLException {
        PatientsDAO patientDAO=new PatientsDAO();
        Patient patient=new Patient();
        patient.setPatientName("John Doe");
        patient.setMedicalHistory("High Sugar");
        patientDAO.createPatient(patient);
        try{
            Patient p=patientDAO.getPatientByID(patient.getPatientID());
           // System.out.println(p.getPatientID());
            System.out.println(p.getPatientName());
            System.out.println(p.getMedicalHistory());
        }
        catch(RecordNotFoundException e){
            System.out.println(e.getMessage());
        }
        PatientsDAO.Close();

    }
   

}



