package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee {
private int id;
private String name;
private float salary;				//primitive property means hold only one value 	
@Autowired
private Address add;				// it is complext property it can hold more property 

		public Address getAdd() {
	return add;
}

public void setAdd(Address add) {
	this.add = add;
}

		public void display() {
			System.out.println("display method");
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public float getSalary() {
			return salary;
		}

		public void setSalary(float salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", add=" + add + "]";
		}
		
}
