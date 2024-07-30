package Question02;

import java.util.HashSet;
import java.util.Set;

public class EmployeeDirectory<T extends Employee> {
    private Set<T> employeeSet;

    public EmployeeDirectory() {
        employeeSet = new HashSet<>();
    }

    public void addEmployee(T employee) {
        employeeSet.add(employee);
    }

    public void removeEmployee(T employee) {
        employeeSet.remove(employee);
    }

    public void displayEmployees() {
        for (T employee : employeeSet) {
            System.out.println(employee);
        }
    }

    // Other methods as needed
}

