package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
	List<String> listOfStd = new LinkedList<String>();
	listOfStd.add("Ravi"); listOfStd.add("Ajay"); listOfStd.add("Vijay");
	listOfStd.add("Mahesh"); listOfStd.add("Dinesh"); listOfStd.add("Nanda");
	System.out.println("Before sort");
	for(String name:listOfStd) {
		System.out.println(name);
	}
	Collections.sort(listOfStd);
	System.out.println("After Sort - Asc");
	
	for(String name:listOfStd) {
		System.out.println(name);
	}
	Collections.reverse(listOfStd);
	System.out.println("After Sort - Desc");
	
	for(String name:listOfStd) {
		System.out.println(name);
	}
	
	Integer num[]= {2,6,1,5,3,9,8};
	
	List<Integer> list = Arrays.asList(num);		// converting Integer array to List 
	System.out.println(list.size());
	
	System.out.println("All number are ");
	for(int a:list) {
		System.out.println(a);
	}
	Collections.sort(list);						//sort asc 
	System.out.println("All number are in Asc order");
	for(int a:list) {
		System.out.println(a);
	}
	Collections.reverse(list);						// sort desc 
	System.out.println("All number are in Desc oder");
	for(int a:list) {
		System.out.println(a);
	}
	}
}
