package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoTest {

	public static void main(String[] args) {
		//Employee emp = new Employee();
		//emp.display();
		ApplicationContext ac = SpringApplication.run(DemoTest.class, args);
		Object obj = ac.getBean("employee");//pull the object 
		Employee emp = (Employee)obj;
		emp.display();
		emp.setId(100);
		emp.setName("Ravi");
		emp.setSalary(14000);
		
		Address add1	 = emp.getAdd();
		add1.setCity("Mumbia");
		add1.setState("Mh");
		emp.setAdd(add1);
		System.out.println(emp.getAdd());
		/*
		System.out.println("id is "+emp.getId());
		System.out.println("name is "+emp.getName());
		System.out.println("salary is "+emp.getSalary());
		Employee emp1 = (Employee)ac.getBean("employee");
		System.out.println(emp1.getName());
		System.out.println("City is "+add1.getCity());
		System.out.println("State is "+add1.getState());
	System.out.println(emp);
		/*
		Address add = (Address)ac.getBean("add");
		add.setCity("Bangalore");
		add.setState("Kar");
		System.out.println("City s "+add.getCity());
		System.out.println("State is "+add.getState());*/
	}

}
