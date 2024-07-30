package Railway_Registration;
import java.util.Scanner;
public class MainRailwayRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RailwayReservation person1 = new RailwayReservation();
        System.out.println("Enter your Name: ");
        person1.setName(sc.nextLine());
        System.out.println("Enter your Gender: ");
        person1.setGender(sc.nextLine());
        System.out.println("Enter your Age: ");
        person1.setAge(sc.nextInt());
        System.out.println("Enter your Mobile Number: ");
        person1.setMobileNo(sc.nextLong());
        System.out.println("Name: "+ person1.getName());
        System.out.println("Gender: " + person1.getGender());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Mobile Number: " + person1.getMobileNo());
        person1.berthAllocation();
        sc.close();
    }
    
}
