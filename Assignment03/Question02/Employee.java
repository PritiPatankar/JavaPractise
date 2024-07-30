package Question02;

public class Employee {
    private int employeeID;
    private String name;
    private String role;

    public Employee(int employeeID, String name, String role) {
        this.employeeID = employeeID;
        this.name = name;
        this.role = role;
    }

    // Getters and setters (if needed)

    @Override
    public String toString() {
        return "Employee ID: " + employeeID + ", Name: " + name + ", Role: " + role;
    }
}
