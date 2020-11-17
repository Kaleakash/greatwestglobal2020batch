package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import bean.Employee;
import bean.EmployeeSortIdByAsc;
import bean.EmployeeSortNameByAsc;

public class DemoTest {

	public static void main(String[] args) {
	List<String> listOfStd = new ArrayList<String>();
	List<Employee> listOfEmp = new ArrayList<Employee>();
	listOfEmp.add(new Employee(2, "Raj", 15000));
	listOfEmp.add(new Employee(1, "Vijay", 12000));
	listOfEmp.add(new Employee(3, "Mahesh", 14000));
	//Iterator only forward direction ListIterator forward and backward 
	/*ListIterator<Employee> listOfIterator = listOfEmp.listIterator();
	System.out.println("All Employee forward direction");
	while(listOfIterator.hasNext()) {
		Employee emp = listOfIterator.next();
		System.out.println(emp);
	}
	System.out.println("All Employee  backward direction");
	while(listOfIterator.hasPrevious()) {
		Employee emp = listOfIterator.previous();
		System.out.println(emp);
	}
	*/
	System.out.println("Before Sort");
	for(Employee emp:listOfEmp) {
		System.out.println(emp);
	}
	//Collections.sort(listOfEmp);		// This line only compare to method called...
	
	//Collections.sort(listOfEmp, new EmployeeSortIdByAsc());		// Asc order by Id
	Collections.sort(listOfEmp, new EmployeeSortNameByAsc());
	System.out.println("After sort");
	for(Employee emp:listOfEmp) {
		System.out.println(emp);
	}
	}

}
