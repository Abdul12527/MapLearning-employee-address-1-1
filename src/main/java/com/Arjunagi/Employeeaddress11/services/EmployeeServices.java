package com.Arjunagi.Employeeaddress11.services;

import com.Arjunagi.Employeeaddress11.models.Address;
import com.Arjunagi.Employeeaddress11.models.Employee;
import com.Arjunagi.Employeeaddress11.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServices {
    @Autowired
    IEmployeeRepo employeeRepo;

    public List<Employee> getAllEmp() {
        return employeeRepo.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepo.findById(id).orElseThrow();
    }

    public String addEmployee(Employee employee) {
        employeeRepo.save(employee);
        return "added sucessfully";
    }

    public String updateEmployee(Long id, String firstName, String lastName, String designation, Address newAddress) {
        Employee employee = employeeRepo.findById(id).orElseThrow();

        if (firstName != null && !firstName.isEmpty()) {
            employee.setFirstName(firstName);
        }
        if (lastName != null && !lastName.isEmpty()) {
            employee.setLastName(lastName);
        }
        if (designation != null && !designation.isEmpty()) {
            employee.setDesignation(designation);
        }
        if (newAddress != null) {
            Address currentAddress = employee.getAddress();
            if (currentAddress != null) {
                // Update the existing address fields
                if(newAddress.getStreet()!=null)
                    currentAddress.setStreet(newAddress.getStreet());
                if(newAddress.getCity()!=null)
                    currentAddress.setCity(newAddress.getCity());
                if(newAddress.getState()!=null)
                    currentAddress.setState(newAddress.getState());
                if(newAddress.getZipCode()!=null)
                    currentAddress.setZipCode(newAddress.getZipCode());
            } else {
                // If the employee does not have an address, set the new address directly
                employee.setAddress(newAddress);
            }
        }

        employeeRepo.save(employee);
        return "ok";
    }


    public String deleteEmployeeById(Long id) {
        employeeRepo.deleteById(id);
        return "deleted";
    }

    public Address getTheAddressByEmpId(Long id) {
        if(!employeeRepo.existsById(id))
            throw new RuntimeException("employee doesn't exist");

        return employeeRepo.findById(id).get().getAddress();
    }
}
