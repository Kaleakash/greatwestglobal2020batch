package com;

import bean.Product;
import service.ProductService;

//import user-define class part of different package 
public class DemoTest {

	public static void main(String[] args) {
		
		ProductService ps = new ProductService();
		ps.addProduct(100, "Tv", 55000);
		
		Product p1 = new Product(101, "Mobile", 45000);
		
	
		
		p1.setDesg("Good Product");
	
		ps.addProduct(p1);
		
		
		float priceInfo = ps.getProductPrice(100);
		System.out.println(priceInfo);
		
		Product pp = ps.getProduct();
		System.out.println("In Main product info");
		System.out.println(pp);
		
		Product prod[] =new Product[10];
		prod[0]=new Product(1, "Abc", 10);
		prod[1]=new Product(2, "Abcd", 101);
		prod[2]=new Product(3, "Abcde", 102);
		prod[3]=new Product(4, "Abcdef", 103);
		prod[4]=new Product(5, "Abcdefg", 104);
				
		
		ps.addAllProduct(prod);
		
		Product p1p1[] =ps.getAllProductDetails();
		
		System.out.println("Add Product are ");
		
		for(Product prod1 :p1p1) {
			//if(prod1!=null) {
			System.out.println(prod1);
			//}
		}
		
		
		/*System.out.println("Welcome to Java...");
		Product p = new Product();
		p.setPid(100);
		p.setPname("Tv");
		p.setPrice(155000);
		
		System.out.println("id is "+p.getPid());
		System.out.println("name is "+p.getPname());
		System.out.println("price is "+p.getPrice());
		
		Product p1 = new Product(101, "Mobile", 45000);
		
		System.out.println("id is "+p1.getPid());
		System.out.println("name is "+p1.getPname());
		System.out.println("price is "+p1.getPrice());
		
		Product p3 = new Product(102, "PC", 35000);
		
		System.out.println(p3);		// toString() part of Object class. 
		*/
	}

}
