package DatabaseDAO.Patient_Data;

import java.sql.SQLException;
 
public class MainPgm{
    public static void main(String[] args)  throws SQLException,ClassNotFoundException{
        PatientDAO patientDAO=new PatientDAO();
        Patient patient=new Patient();
        patient.setPatientName("John Doe");
        patient.setMedicalHistory("High Sugar");
        patientDAO.createPatientRecords(patient);
        try{
            Patient p=patientDAO.retrievePatient(patient.getPatientID());
            System.out.println(p.getPatientID());
            System.out.println(p.getPatientName());
            System.out.println(p.getMedicalHistory());
        }
        catch(RecordNotFound e){
            e.printStackTrace();
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }
    }
}
