package com.ltimindtree.ols.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltimindtree.ols.entity.Address;
import com.ltimindtree.ols.entity.Employee;
import com.ltimindtree.ols.repository.AddressRepository;
import com.ltimindtree.ols.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private AddressRepository addressReposiotry;

    //Implement a RESTful endpoint (/employees) with a @PostMapping annotation to allow users to
    //register new employees. The registration request should include the employee's details and
    //address information.

    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    
    public Address createAddress(Long addressId, Employee employee){
        Address add = addressReposiotry.findById(addressId).get();
        if(employee != null){
            employee.setAddress(add);
            employeeRepository.save(employee);
            return add;
        }
        else{
            return null;
        }

    }
    //Implement a RESTful endpoint (/employees/{employeeId}) with a @GetMapping annotation to
    //retrieve details of a specific employee, including their address
    public Employee getEmployeeById(Long employeeId){
        return employeeRepository.findById(employeeId).get();
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
}
