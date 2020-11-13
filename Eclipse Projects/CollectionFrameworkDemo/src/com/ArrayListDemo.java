package com;

import java.util.ArrayList;
class Employee {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee object";
	}
}

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		//Normal array store type values but ArrayList different types of values 
		//Normal array fixed memory size. ArrayList dynamic memory size. 
		//Normal array add and remove element complexicity 
		//ArrayList we can add as well as we can remove very easily. 
		System.out.println("size "+al.size());
		System.out.println("Empty "+al.isEmpty());
		al.add(10);
		al.add("Raj");
		al.add(10.20);
		al.add(true);
		Employee emp = new Employee();
		al.add(emp);
		System.out.println(al);
		System.out.println("size "+al.size());
		System.out.println("Empty "+al.isEmpty());
		System.out.println("1 position "+al.get(1));
			al.add(1, 200);						// move to next index position value 
		System.out.println("1 position "+al.get(1));
		System.out.println("2 position "+al.get(2));
				al.set(1, "Seeta");					//replace 1 index position value. 
		System.out.println("1 position "+al.get(1));
		System.out.println("2 position "+al.get(2));
		al.remove(0);		//remove using Index position 
		//al.remove(new Integer(10));	// remove using value of 10
		System.out.println(al);
		al.remove(true);
		System.out.println(al);
	}

}



