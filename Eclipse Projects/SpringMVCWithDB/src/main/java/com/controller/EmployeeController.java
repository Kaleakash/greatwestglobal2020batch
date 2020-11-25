package com.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Employee;
import com.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	
	@GetMapping(value = "allEmployees",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployees() {
		System.out.println("In Controller");
		return employeeService.getAllEmployee();
	}
	@GetMapping(value = "getEmpById/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployeeById(@PathVariable("id") int id) {
		return employeeService.getEmployeeById(id);
	}
	
	@PostMapping(value = "storeEmployee")
	public String storeEmployee(@RequestBody Employee emp) {
		return employeeService.storeEmployeeDetails(emp);
	}
	
	@PutMapping(value = "updateEmployee")
	public String updateEmployee(@RequestBody Employee emp) {
		return employeeService.updateEmployeeDetails(emp);
	}
	
	@DeleteMapping(value = "deleteEmployee/{id}")
	public String storeEmployee(@PathVariable("id") int id) {
		return employeeService.deleteEmployeeById(id);
	}
}
