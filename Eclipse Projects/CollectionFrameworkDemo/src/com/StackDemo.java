package com;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack ss = new Stack();
		System.out.println(ss.size());
		System.out.println(ss.isEmpty());
		ss.push(100);
		ss.push(101);
		ss.push(102);
		ss.push(103);
		System.out.println(ss.size());
		System.out.println(ss.isEmpty());
				System.out.println(ss);	//display as a string only one time 
		System.out.println(ss.pop());	// display and remove 
		System.out.println(ss);
		System.out.println(ss.peek());	// display top most 
		System.out.println(ss);
		System.out.println(ss.search(102));
		System.out.println(ss.search(1000));
	}

}
