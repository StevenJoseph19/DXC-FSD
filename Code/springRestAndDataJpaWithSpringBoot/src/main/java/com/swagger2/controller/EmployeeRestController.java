package com.swagger2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swagger2.entity.Employee;
import com.swagger2.service.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;



@RestController
@Api(value = "Employee Management Services")
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/api/employees")
	@ApiOperation(value = "Get a list of Employees")
	public List<Employee> getEmployees() {
		List<Employee> employees = employeeService.retrieveEmployees();
		return employees;
	}

	@GetMapping("/api/employees/{employeeId}")
	@ApiOperation(value = "Returns an Employee by Id")
	@ApiResponses({@ApiResponse(code = 400, message = "Invalid request parameters supplied" ),
		           @ApiResponse(code = 404, message = "Requested data not found")})
	public Employee getEmployee(@ApiParam(value = "Input a whole number as Employee Id", example="1") @PathVariable(name = "employeeId") Long employeeId) {
		return employeeService.getEmployee(employeeId);
	}

	@PostMapping("/api/employees")
	@ApiOperation(value = "Add a new Employee")
	public void saveEmployee(@ApiParam(value = "A New Employee") Employee employee) {
		employeeService.saveEmployee(employee);
		System.out.println("Employee saved successfully");
	}

	@DeleteMapping("/api/employees/{employeeId}")
	@ApiOperation(value = "Delete an Employee")
	public void deleteEmployee(@ApiParam(value = "Employee Id to delete", example="1") @PathVariable(name = "employeeId") Long employeeId) {
		employeeService.deleteEmployee(employeeId);
		System.out.println(("Employee deleted successfully"));
	}

	@PutMapping("/api/employees/{employeeId}")
	@ApiOperation(value = "Update an Employee's Details")
	public void updateEmployee(@RequestBody Employee employee, @ApiParam(value = "Employee Id to update", example="1") @PathVariable(name = "employeeId") Long employeeId) {
		Employee emp = employeeService.getEmployee(employeeId);

		if (emp != null)
			employeeService.updateEmployee(employee);
	}
}
