package com.Arjunagi.Employeeaddress11.services;

import com.Arjunagi.Employeeaddress11.models.Address;
import com.Arjunagi.Employeeaddress11.models.Employee;
import com.Arjunagi.Employeeaddress11.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServices {
    @Autowired
    IAddressRepo addressRepo;

    public List<Address> getAllAddress() {
        return addressRepo.findAll();
    }

    public Address getAddressById(Long id) {
        return addressRepo.findById(id).orElseThrow();
    }

    public String addAddress(Address address) {
        addressRepo.save(address);
        return "added sucessfully";
    }

    public String updateAddress(Long id, String street, String city, String state, String zipCode) {
        Address address = addressRepo.findById(id).orElseThrow();
        if(street!=null&&!street.isEmpty())address.setStreet(street);
        if(city!=null&&!city.isEmpty())address.setCity(city);
        if(state!=null&&!state.isEmpty())address.setState(state);
        if(zipCode!=null&&!zipCode.isEmpty())address.setZipCode(zipCode);

        addressRepo.save(address);
        return "updated sucessfully";

    }

    public String deleteAddressById(Long id) {
        addressRepo.deleteById(id);
        return "deleted";
    }
}
