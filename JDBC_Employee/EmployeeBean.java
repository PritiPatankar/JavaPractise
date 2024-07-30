class EmployeeBean{
    private String name;
    private String dept;
    private float salary;
    private String emailID;
    private long phoneNo;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setDept(String dept){
        this.dept = dept;
    }
    public String getDept(){
        return dept;
    }
    public void setSalary(float salary){
        this.salary = salary;
    }
    public float getSalary(){
        return salary;
    }
    public void setEmailID(String emailID){
        this.emailID = emailID;
    }
    public String getEmailID(){
        return emailID;
    }
    public void setPhoneNo(long phoneNo){
        this.phoneNo = phoneNo;
    }
    public long getPhoneNo(){
        return phoneNo;
    }
}