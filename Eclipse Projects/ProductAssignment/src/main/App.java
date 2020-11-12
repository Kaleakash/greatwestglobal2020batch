package main;

import java.util.Scanner;

import bean.Product;
import service.ProductService;

public class App {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String con;
	int ch=0;
	int pid;
	String pname;
	float price;
	int n=0;
	Product ppArray[];
	ProductService ps = new ProductService();	// this class be outside loop 
	do {
			System.out.println("1:Add");
			System.err.println("2:Add More Products");
			System.out.println("5:Display");
			System.out.println("Plz enter your choice?");
			ch = sc.nextInt();
			switch (ch) {
			case	 1:	System.out.println("Enter the pid");
						pid = sc.nextInt();
						System.out.println("Enter the pname");
						pname = sc.next();
						System.out.println("Enter the price");
						price = sc.nextFloat();
						Product p = new Product(pid,pname,price);
						
						int result = ps.addProduct(p);
						if(result>0) {
							System.out.println("Product added successfully");
						}else {
							System.out.println("Product Id must be unique");
						}
						break;
			case 2:		System.out.println("How many product do you want to store?");
							n = sc.nextInt();
							ppArray=new Product[n];
							System.out.println("Enter all records one by one ");
							for(int i=0;i<ppArray.length;i++) {
								System.out.println("Enter the pid");
								pid = sc.nextInt();
								System.out.println("Enter the pname");
								pname = sc.next();
								System.out.println("Enter the price");
								price = sc.nextFloat();
								Product p1 = new Product(pid,pname,price);
								//ppArray[i]=p1;
								ps.addProduct(p1);
							}
								//ps.addMoreProducts(ppArray);
								
			case 5:			Product pp[]=ps.getAllProducts();	
							for(Product p1:pp) {
								if(p1!=null) {
								System.out.println(p1);
								}
							}
				
						break;	
			default:
				break;
			}
			System.out.println("Do you want to continue?(y/n)");
			con = sc.next();
	} while (con.equalsIgnoreCase("y"));
	System.out.println("Thank You!");
	}
}
