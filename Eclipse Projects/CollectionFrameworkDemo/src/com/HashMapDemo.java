package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap hm = new HashMap();			// randomly 
		//LinkedHashMap hm = new LinkedHashMap(); // maintain order
		TreeMap hm  = new TreeMap();			//sorting by key
		hm.put(3, "Ravi");
		hm.put(1, "Rajesh");
		hm.put(4,"Ajay");
		hm.put(5, "Vijay");
		System.out.println(hm);
		hm.put(4,"Ramesh");
		hm.put(2,"Ravi");
		System.out.println(hm);
		if(hm.containsKey(3)) {
			System.out.println("Key already present");
		}else {
			hm.put(3, "Balaji");
		}
	}

}
