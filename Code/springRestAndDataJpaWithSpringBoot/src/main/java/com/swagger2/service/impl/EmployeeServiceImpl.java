package com.swagger2.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swagger2.entity.Employee;
import com.swagger2.repository.EmployeeRepository;
import com.swagger2.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> retrieveEmployees() {
		List<Employee> employees = employeeRepository.findAll();

		return employees;
	}

	@Override
	public Employee getEmployee(Long employeeId) {

		Optional<Employee> optEmp = employeeRepository.findById(employeeId);
		return optEmp.get();
	}

	@Override
	public void saveEmployee(Employee employee) {

		employeeRepository.save(employee);

	}

	@Override
	public void deleteEmployee(Long employeeId) {
		employeeRepository.deleteById(employeeId);
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);

	}

}
