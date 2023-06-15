package com.swagger2.service;

import java.util.List;

import com.swagger2.entity.Employee;

public interface EmployeeService {

	List<Employee> retrieveEmployees();

	Employee getEmployee(Long employeeId);

	void saveEmployee(Employee employee);

	void deleteEmployee(Long employeeId);

	void updateEmployee(Employee employee);
	

}
