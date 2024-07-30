package Collections.Hashmap.Comparable_Comparator_Hashmap;

import java.util.*;

public class EmployeeManagement {
    private HashMap<Integer, Employee> employeeMap;

    public EmployeeManagement() {
        //Write a missing code here
        employeeMap = new HashMap<Integer, Employee>();
    }

    public void addEmployee(Employee employee) {
         //Write a missing code here
         employeeMap.put(employee.getEmployeeId(), employee);
    }
    
    public Employee getEmployee(int employeeID) throws EmployeeRecordNotFound{
        //Write a missing code here
        if(employeeMap.containsKey(employeeID)){
            return employeeMap.get(employeeID);
        }
        else{
            throw new EmployeeRecordNotFound("Employee with ID "+employeeID+" not found.");
        }
        
    }

    public List<Employee> getAllEmployeesSortedByName() {
         //Write a missing code here
         List<Employee> emp = new ArrayList<>(employeeMap.values());
         Collections.sort(emp);
         return emp;
    }

    public List<Employee> getAllEmployeesSortedBySalary() {
        //Write a missing code here
        List<Employee> emp = new ArrayList<>(employeeMap.values());
        Employee e = new Employee();
        Collections.sort(emp, e);
        
        return emp;
   }

    public boolean removeEmployee(int employeeID) throws EmployeeRecordNotFound{
        //Write a missing code here
        if(employeeMap.containsKey(employeeID)){
            return employeeMap.remove(employeeID) != null;
        }
        else{
            throw new EmployeeRecordNotFound("Employee with ID "+employeeID+" not found.");
        }
    }
}

