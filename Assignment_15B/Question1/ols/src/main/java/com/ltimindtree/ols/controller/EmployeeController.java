package com.ltimindtree.ols.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltimindtree.ols.entity.Address;
import com.ltimindtree.ols.entity.Employee;
import com.ltimindtree.ols.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;

    //Implement a RESTful endpoint (/employees) with a @PostMapping annotation to allow users to
    //register new employees. The registration request should include the employee's details and
    //address information.

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        return new ResponseEntity<>(employeeService.createEmployee(employee),HttpStatus.CREATED);
    }

    @PostMapping("/{addressId}/address")
    public ResponseEntity<Address> createAddress(@PathVariable Long addressId,@RequestBody Employee employee){
        return new ResponseEntity<>(employeeService.createAddress(addressId, employee), HttpStatus.CREATED);
    }

    //Implement a RESTful endpoint (/employees/{employeeId}) with a @GetMapping annotation to
    //retrieve details of a specific employee, including their address.
    @GetMapping("/{employeeId}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long employeeId){
        return new ResponseEntity<>(employeeService.getEmployeeById(employeeId),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees(){
        return new ResponseEntity<>(employeeService.getAllEmployees(), HttpStatus.OK);
    }

    
}
