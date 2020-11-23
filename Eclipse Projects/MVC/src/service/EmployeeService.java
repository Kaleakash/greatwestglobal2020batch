package service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Employee;
import dao.EmployeeDao;

public class EmployeeService {
	EmployeeDao ed;
	public EmployeeService() {
		ed = new EmployeeDao();
	}
	public List<Employee> getAllEmployeeDetails() {
		
		// business methods......
		
		return ed.getEmployeeFromDb();
		
		//return ed.getEmployeeFromDb().stream().filter(emp->emp.getSalary()>20000).collect(Collectors.toList());
		//ed.getEmployeeFromDb().stream().flatMap(emp->emp.setSalary(4.forEach(e->System.out.println(e));
		//return null;
		//return ed.getEmployeeFromDb().stream().mapToDouble(emp->emp.setSalary(5000)).collect(Collectors.toList());
	}
}
