package Railway_Registration;

public class RailwayReservation {
    private String name;
    private String gender;
    private int age;
    private long mobileNo;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setMobileNo(long mobileNo){
        this.mobileNo = mobileNo;
    }

    public long getMobileNo(){
        return mobileNo;
    }

    public void berthAllocation(){
        if(age>60){
            System.out.println("Upper Berth");
        }
        else{
            if(gender == "M" || gender =="m"){
                System.out.println("Upper Berth");
            }
            else{
                System.out.println("Middle Berth");
            }
        }
    }


}
