package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionRetrieve {
public static void main(String[] args) {
	List ll1 = new ArrayList();
	ll1.add(10);	ll1.add("Ravi");	ll1.add("Ramesh");	ll1.add(10.10);
	System.out.println("Using for each loop");
	for(Object obj:ll1) {
		System.out.println(obj);
	}
	System.out.println("using Iterator");
	 Iterator ii = ll1.iterator();
	 while(ii.hasNext()) {
		 //System.out.println(ii.next());
		 Object obj = ii.next();
		 if(obj.equals("Ramesh")) {
			 ii.remove();
		 }else {
			 System.out.println(obj);
		 }
	 }
	 System.out.println("Using for each loop");
	 List<String> ll2 = new ArrayList<String>();
	 ll2.add("Ravi"); ll2.add("Ramesh"); ll2.add("Rajesh"); ll2.add("Ramu");//auto-boxing 
	 for(String obj:ll2) {			//auto-unboxing 
		 System.out.println(obj);
	 }
	 
	 Iterator<String> ii1 = ll2.iterator();
	 while(ii1.hasNext()) {
		 String name = ii1.next();		//auto-unboxing 
		 System.out.println(name);
	 }
}
}
