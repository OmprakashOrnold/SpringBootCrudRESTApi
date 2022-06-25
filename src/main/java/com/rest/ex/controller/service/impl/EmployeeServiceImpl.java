package com.rest.ex.controller.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.ex.controller.service.EmployeeService;
import com.rest.ex.model.Employee;
import com.rest.ex.repos.EmployeeRepositary;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepositary employeeRepo;
	
	@Override
	public Employee addEmployee(Employee  employee) {		
		return employeeRepo.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}

	@Override
	public Employee geEmployeeById(Long id) {
		return  employeeRepo.findById(id).get();
	}

	@Override
	public void deleteEmployeeById(Long id) {
		employeeRepo.deleteById(id);		
	}

}
