package com.Arjunagi.Employeeaddress11.repository;

import com.Arjunagi.Employeeaddress11.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepo extends JpaRepository<Employee,Long> {
}
