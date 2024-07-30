package Question02;

public class Main{
    public static void main(String[] args) {
        EmployeeDirectory<Employee> directory = new EmployeeDirectory<>();
    
        Employee emp1 = new Employee(1, "John Doe", "Manager");
        Employee emp2 = new Employee(2, "Jane Smith", "Developer");
        Employee emp3 = new Employee(3, "Alice Brown", "Designer");
    
        directory.addEmployee(emp1);
        directory.addEmployee(emp2);
        directory.addEmployee(emp3);
    
        System.out.println("Employees in the directory:");
        directory.displayEmployees();
    
        directory.removeEmployee(emp2);
    
        System.out.println("\nEmployees after removal:");
        directory.displayEmployees();
    }
    
    
}
