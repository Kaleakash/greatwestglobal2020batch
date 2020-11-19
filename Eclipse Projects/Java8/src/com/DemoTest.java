package com;

import java.util.ArrayList;
import java.util.List;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(10); list.add(20); list.add(30);
		
		list.stream().forEach(v->System.out.println(v));
	}

}
