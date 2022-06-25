package com.rest.ex.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.ex.model.Employee;

public interface EmployeeRepositary extends JpaRepository<Employee, Long> {

}
