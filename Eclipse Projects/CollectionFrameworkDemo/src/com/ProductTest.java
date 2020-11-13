package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bean.Product;

public class ProductTest {

	public static void main(String[] args) {
		List<Product> listOfProduct = new ArrayList<Product>();
		Product p1 = new Product();
		p1.setPid(100);
		p1.setPname("Tv");
		p1.setPrice(110000);
		Product p2 = new Product(101, "Laptop", 85000);
		listOfProduct.add(p1);
		listOfProduct.add(p2);
		listOfProduct.add(new Product(102, "PC", 55000));
		System.out.println("Size is "+listOfProduct.size());
		listOfProduct.add(new Product(103, "Mobile", 35000));
		System.out.println("Size is "+listOfProduct.size());
		
		//listOfProduct.remove(0);		//using index position 
		System.out.println("Size is "+listOfProduct.size());
		//listOfProduct.remove(p2);		// using object 
		//System.out.println("Size is "+listOfProduct.size());
		
		System.out.println(listOfProduct);		//[10,20,30,40......................]
		
		Iterator<Product> productIterator = listOfProduct.iterator();
		while(productIterator.hasNext()) {
			Product p = productIterator.next();
			//System.out.println(p);
			//System.out.println(p.getPname()+" "+p.getPrice());
			//if(p.getPrice()>50000) {
			//	System.out.println(p.getPname());
			//}
			if(p.getPid()==1000) {
				productIterator.remove();
			}
		}
		System.out.println("Size is "+listOfProduct.size());
		
		//Product pp[]=new Product[10];
		//	pp[0]=new Product();
		//	pp[0].read();
	}

}
