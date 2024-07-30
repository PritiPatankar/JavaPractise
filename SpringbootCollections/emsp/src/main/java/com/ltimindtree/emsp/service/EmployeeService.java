package com.ltimindtree.emsp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ltimindtree.emsp.model.Employee;

@Service
public class EmployeeService {
    
    private ArrayList<Employee> EmpArr = new ArrayList<>();

    //Retrieve All
    public List<Employee> getAllEmployees(){
        return EmpArr;
    }

    //Retrieve by Id
    public Employee getEmployeeById(Long id){
        for(Employee emp : EmpArr){
            if(emp.getId() == id){
                return emp;
            }
        }
        return null;
    }

    //Create 
    public Employee addEmployee(Employee employee){
        EmpArr.add(employee);
        return employee;
    }

    //Update
    public Employee updateEmployee(Long id, Employee employee){
        for(Employee emp : EmpArr){
            if(emp.getId() == id){
                //EmpArr.set(EmpArr.indexOf(emp), employee);
                emp.setName(employee.getName());
                emp.setSalary(employee.getSalary());
                return employee;
            }
        }
        return null;
    }

    //delete
    public Employee deleteEmployee(Long id){
        for(Employee emp : EmpArr){
            if(emp.getId() == id){
                EmpArr.remove(EmpArr.indexOf(emp));
                return emp;
            }
        }
        return null;   
    }
}
