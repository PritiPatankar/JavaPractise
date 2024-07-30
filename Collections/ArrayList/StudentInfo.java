package Collections.ArrayList;
public class StudentInfo implements Comparable<StudentInfo>{
    private int SID;
    private String name;
    private long phoneNo;

    StudentInfo(int SID, String name, long phoneNo){
        this.SID = SID;
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public void setSID(int SID){
        this.SID = SID;
    }
    public int getSID(){
        return SID;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPhoneNo(long phoneNo){
        this.phoneNo = phoneNo;
    }
    public long getPhoneNo(){
        return phoneNo;
    }

    public int compareTo(StudentInfo studetnInfo) {
		if(SID==studetnInfo.SID)
		{
			return 0;
		}
		else if(SID>studetnInfo.SID)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}