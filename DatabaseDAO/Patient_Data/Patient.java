package DatabaseDAO.Patient_Data;
class Patient{
    private int patientID;
    private String patientName;
    private String medicalHistory;

    public void setPatientID(int patientID){
        this.patientID = patientID;
    }
    public int getPatientID(){
        return patientID;
    }
    public void setPatientName(String patientName){
        this.patientName = patientName;
    }
    public String getPatientName(){
        return patientName;
    }
    public void setMedicalHistory(String medicalHistory){
        this.medicalHistory = medicalHistory;
    }
    public String getMedicalHistory(){
        return medicalHistory;
    }

}