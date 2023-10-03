package com.Arjunagi.Employeeaddress11.controller;

import com.Arjunagi.Employeeaddress11.models.Address;
import com.Arjunagi.Employeeaddress11.models.Employee;
import com.Arjunagi.Employeeaddress11.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeServices employeeServices;
    @GetMapping("/employee")
    public List<Employee> getAllEmp(){
        return employeeServices.getAllEmp();
    }
    @GetMapping("/employee/id/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeServices.getEmployeeById(id);
    }
    @PostMapping("/employee")
    public String addEmployee(@RequestBody Employee employee){
        return employeeServices.addEmployee(employee);
    }
    @PutMapping("/employee/id/{id}")
    public String updateEmployee(@PathVariable Long id, @RequestParam(required = false) String firstName, @RequestParam(required = false)String lastName, @RequestParam(required = false)String designation, @RequestBody(required = false)Address address){
        return employeeServices.updateEmployee(id,firstName,lastName,designation,address);
    }
    @DeleteMapping("/employee/id/{id}")
    public String deleteEmployeeById(@PathVariable Long id){
        return employeeServices.deleteEmployeeById(id);
    }
    @GetMapping("/address/employee/id/{id}")
    public Address getTheAddressByEmpId(@PathVariable Long id){
        return employeeServices.getTheAddressByEmpId(id);
    }
}
