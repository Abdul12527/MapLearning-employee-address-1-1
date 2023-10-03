package com.Arjunagi.Employeeaddress11.repository;

import com.Arjunagi.Employeeaddress11.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Long> {
}
