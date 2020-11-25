package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Service																// @Service layer annotation 
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public List<Employee> getAllEmployee() {
		return employeeDao.getAllEmployeeDetails();
	}
	
	public Employee getEmployeeById(int id) {
		return employeeDao.getEmployeeById(id);
	}
	
	public String storeEmployeeDetails(Employee emp) {
		if(employeeDao.storeEmployeeRecord(emp)>0) {
			return "Record stored successfully";
		}else {
			return "Record didn't store";
		}
	}
	
	public String updateEmployeeDetails(Employee emp) {
		if(employeeDao.updateEmployeeDetails(emp)>0) {
			return "Record updated successfully";
		}else {
			return "Record didn't update";
		}
	}
	
	public String deleteEmployeeById(int empId) {
		if(employeeDao.deleteEmployeeById(empId)>0) {
			return "Record deleted successfully";
		}else {
			return "Record didn't delete";
		}
	}
}
