package com.ltimindtree.ems.service;
import org.springframework.stereotype.Service;
import com.ltimindtree.ems.model.Employee;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private final List<Employee> employees = new ArrayList<>();
    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee getEmployeeById(int id) {
     for(Employee emp : employees){
        if(emp.getId() == id){
            return emp;
        }
     }
     return null;
    }

    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }
}


