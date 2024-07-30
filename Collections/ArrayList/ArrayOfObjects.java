package Collections.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Iterator;


public class ArrayOfObjects {
    Scanner sc = new Scanner(System.in);
    ArrayList<StudentInfo> studentArrayList = new ArrayList<StudentInfo>();
    ArrayList<Integer> SID = new ArrayList<Integer>();
    ArrayList<String> name = new ArrayList<String>();
    ArrayList<Long> phoneNo = new ArrayList<Long>();

    void getData(){
        System.out.println("Enter Number of Objects: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Enter Student ID: ");
            SID.add(sc.nextInt());
            System.out.println("Enter Student Name: ");
            name.add(sc.next());
            System.out.println("Enter Student Phone Number: ");
            phoneNo.add(sc.nextLong());
            studentArrayList.add(new StudentInfo(SID.get(i), name.get(i), phoneNo.get(i)));
        }
        //Collections.sort(studentArrayList);
        Collections.sort(studentArrayList, new SIDComparator());
    
    }

    void printData(){
        Iterator<StudentInfo> i = studentArrayList.iterator();
        while(i.hasNext()){
            StudentInfo si = (StudentInfo)i.next();
            System.out.println("Student ID: "+si.getSID());
            System.out.println("Student Name: "+si.getName());
            System.out.println("Student Phone Number: "+ si.getPhoneNo());
        }
    }
    public static void main(String[] args) {
        ArrayOfObjects obj = new ArrayOfObjects();
        obj.getData();
        obj.printData();
    }



}
