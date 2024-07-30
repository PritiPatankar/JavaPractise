package com.ltimindtree.emsph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltimindtree.emsph.exception.InvalidSalaryException;
import com.ltimindtree.emsph.model.Employee;
import com.ltimindtree.emsph.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees(){
        return new ResponseEntity<List<Employee>>(employeeService.getAllEmployees(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeId(@PathVariable Long id){
        return new ResponseEntity<Employee>(employeeService.getEmployeeById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) throws InvalidSalaryException{
        if(employee.getSalary()<=10000){
            throw new InvalidSalaryException("Salary Not greater than 10,000!");
        }
        else{
            return new ResponseEntity<Employee>(employeeService.addEmployee(employee),HttpStatus.OK);
        }
        
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee) throws InvalidSalaryException{
        if(employee.getSalary()<=10000){
            throw new InvalidSalaryException("Salary Not greater than 10,000!");
        }
        else{
            return new ResponseEntity<Employee>(employeeService.updateEmployee(id, employee),HttpStatus.OK);
        }
        
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id){
        
        if(employeeService.deleteEmployee(id) != false){
            return new ResponseEntity<String>("Employee with ID: "+ id + " deleted successfully.", HttpStatus.OK);
        }
        else{
            return new ResponseEntity<String>("Employee with ID: "+ id + " not found!", HttpStatus.BAD_REQUEST);
        }
    }

    @ExceptionHandler(InvalidSalaryException.class)
    public ResponseEntity<String> handleInvalidSalaryException(InvalidSalaryException e){
        return new ResponseEntity<String>("Invalid Salary: "+e.getMessage(),HttpStatus.BAD_REQUEST);
    }
}




