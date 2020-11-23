package service;

import java.util.ArrayList;
import java.util.List;

import bean.Employee;
import dao.EmployeeDao;

public class EmployeeService {
	
	public int addEmployee(Employee emp) {
		EmployeeDao ed = new EmployeeDao();
		return ed.storeEmployee(emp);				//no condition in service layer
	}
	public float changeSalary(Employee emp) {
		emp.setSalary(emp.getSalary()+2000);
		return emp.getSalary();
	}
	public Employee getEmployee() {
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Ravi");
		emp.setSalary(14000);
		return emp;
	}
	public List<Employee> getEmployees() {
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(new Employee(100, "Ravi", 14000));
		listOfEmp.add(new Employee(101, "Ramesh", 16000));
		listOfEmp.add(new Employee(102, "Rakesh", 18000));
		return listOfEmp;
	}
}
