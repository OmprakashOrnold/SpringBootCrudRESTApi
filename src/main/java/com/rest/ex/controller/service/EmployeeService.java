package com.rest.ex.controller.service;

import java.util.List;

import com.rest.ex.model.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee  employee);

	public List<Employee> getAllEmployees();

	public Employee geEmployeeById(Long id);

	public void deleteEmployeeById(Long id);

}
