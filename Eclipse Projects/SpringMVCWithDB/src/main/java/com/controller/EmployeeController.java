package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
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
	
}
