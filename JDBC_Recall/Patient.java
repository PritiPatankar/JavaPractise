package JDBC_Recall;

public class Patient {
    private int patientID;
    private String patientName;
    private String medicalHistory;
    
    //Create Constructor with and without argument
    Patient(){

    } 

    //Create getter and Setter
    public int getPatientID() {
        return patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    
}