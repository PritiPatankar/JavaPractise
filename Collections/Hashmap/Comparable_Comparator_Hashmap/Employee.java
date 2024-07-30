package Collections.Hashmap.Comparable_Comparator_Hashmap;

import java.util.Comparator;

public class Employee implements Comparable<Employee>, Comparator<Employee>{
    private int EmployeeId;
    private String EmpName;
    private double salary;

    public Employee(int EmployeeId, String EmpName, double salary){
        this.EmployeeId = EmployeeId;
        this.EmpName = EmpName;
        this.salary = salary;
    }
    public Employee(){

    }
    public int getEmployeeId() {
        return EmployeeId;
    }
    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }
    public String getEmpName() {
        return EmpName;
    }
    public void setEmpName(String empName) {
        EmpName = empName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int compareTo(Employee e){
        return this.getEmpName().compareTo(e.getEmpName());
    }
    public int compare(Employee e1, Employee e2){
        return Double.compare(e1.getSalary(),e2.getSalary());
    }
    

    
}
