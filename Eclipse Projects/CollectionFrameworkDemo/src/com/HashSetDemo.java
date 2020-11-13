package com;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {

	public static void main(String[] args) {
	//HashSet hs = new HashSet();			// Display the elements randomly
		LinkedHashSet hs = new LinkedHashSet();
	System.out.println(hs.size());
	System.out.println(hs.isEmpty());
	hs.add(10);
	hs.add(10.10);
	hs.add("Ravi");
	hs.add(true);
	System.out.println(hs.size());
	System.out.println(hs.isEmpty());
	hs.add(10);
	System.out.println(hs);
	System.out.println(hs.contains(10.1));
	System.out.println(hs.contains(10.45));
	hs.remove(10.10);
	System.out.println(hs);
	hs.clear();
	System.out.println(hs);
	}

}
