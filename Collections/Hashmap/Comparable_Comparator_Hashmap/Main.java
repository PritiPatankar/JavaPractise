package Collections.Hashmap.Comparable_Comparator_Hashmap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Employees data to be added: ");
        int n = sc.nextInt();
        EmployeeManagement EM = new EmployeeManagement();
        
        for(int i=0; i<n; i++){
            System.out.print("Enter ID, Name, Salary of Employee "+(i+1)+": ");
            Employee e = new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
            EM.addEmployee(e);

        }
        // Employee e1 = new Employee(1, "Priti", 38005);
        // Employee e2 = new Employee(2, "Shivani", 38000);
        // Employee e3 = new Employee(3,"Aishwarya",38010);
        System.out.print("Enter ID of employee whose data you want to see: ");
        n = sc.nextInt();
        try{
            Employee e = new Employee();
            e = EM.getEmployee(n);
            System.out.println("Employee Name: " + e.getEmpName());
            System.out.println("Employee salary: "+e.getSalary());
        }
        catch(EmployeeRecordNotFound ernf){
            ernf.printStackTrace();
        }
        

        System.out.print("Enter ID of Employee which you want to remove: ");
        n = sc.nextInt();
        try{
            EM.removeEmployee(n);
        }
        catch(EmployeeRecordNotFound ernf){
            ernf.printStackTrace();
        }

        System.out.println("Employees sorted by Name: ");
        List<Employee> e1 = EM.getAllEmployeesSortedByName();
        for(Employee emp: e1){
            System.out.println(emp.getEmployeeId());
            System.out.println(emp.getEmpName());
            System.out.println(emp.getSalary());
            System.out.println("-----------------------------");
        }

        System.out.println("Employees sorted by Salary: ");
        List<Employee> e2 = EM.getAllEmployeesSortedBySalary();
        for(Employee emp: e2){
            System.out.println(emp.getEmployeeId());
            System.out.println(emp.getEmpName());
            System.out.println(emp.getSalary());
            System.out.println("-----------------------------");
        }




        

    }
    
}
