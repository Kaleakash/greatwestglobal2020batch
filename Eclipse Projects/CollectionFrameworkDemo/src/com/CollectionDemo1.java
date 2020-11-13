package com;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List ll = new ArrayList();
		int a=100;		//primitive 
		Integer b = new Integer(a);	//object 
		ll.add(b);
		ll.add(10);			//auto-boxing : converting primitive to object 
		ll.add(10.10);
		ll.add("Ravi");
		ll.add(true);
		
		Object obj = ll.get(2);
		if(obj instanceof Double) {
			
		}
		if(obj instanceof Boolean) {
			
		}
		Integer ii = (Integer)obj;
		int n = ii.intValue();
		System.out.println(n);*/
		//Collection Framework with generics 
		//ClassName<Type> obj = new ClassName<Type>();
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);		// auto-boxing 
		list.add(200);
		list.add(300);
		
		int n = list.get(0);	//auto-unboxing : object to primitive 
		System.out.println(n);
	}

}
