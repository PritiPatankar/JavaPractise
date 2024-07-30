package com.ltimindtree.emsph.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ltimindtree.emsph.model.Employee;

@Service
public class EmployeeService {
    
    private HashMap<Long,Employee> EmpMap = new HashMap<>();

    //Retrieve All
    public List<Employee> getAllEmployees(){
        ArrayList<Employee> EmpArr = new ArrayList<>(EmpMap.values());
        return EmpArr;
    }

    //Retrieve by Id
    public Employee getEmployeeById(Long id){
        if(EmpMap.containsKey(id)){
            return EmpMap.get(id);
        }
        return null;
    }

    //Create 
    public Employee addEmployee(Employee employee){
        EmpMap.put(employee.getId(), employee);
        return employee;
    }

    //Update
    public Employee updateEmployee(Long id, Employee employee){
        if(EmpMap.containsKey(id)){
            EmpMap.replace(id, employee);
            return employee;
        }
        return null;
    }

    //delete
    public boolean deleteEmployee(Long id){
        if(EmpMap.containsKey(id)){
            EmpMap.remove(id);
            return true;
        }
        return false;
    }

}
