package com.Arjunagi.Employeeaddress11.controller;

import com.Arjunagi.Employeeaddress11.models.Address;
import com.Arjunagi.Employeeaddress11.models.Employee;
import com.Arjunagi.Employeeaddress11.services.AddressServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressServices addressServices;

    @GetMapping("/address")
    public List<Address> getAllAddress(){
        return addressServices.getAllAddress();
    }
    @GetMapping("/address/id/{id}")
    public Address getAddressById(@PathVariable Long id){
        return addressServices.getAddressById(id);
    }
    @PostMapping("/address")
    public String addAddress(@RequestBody Address address){
        return addressServices.addAddress(address);
    }
    @PutMapping("/address/id/{id}")
    public String updateAddress(@PathVariable Long id, @RequestParam(required = false) String street, @RequestParam(required = false)String City, @RequestParam(required = false)String state, @RequestParam(required = false) String zipCode){
        return addressServices.updateAddress(id,street,City,state,zipCode);
    }
    @DeleteMapping("/address/id/{id}")
    public String deleteAddressById(@PathVariable Long id){
        return addressServices.deleteAddressById(id);
    }


}
