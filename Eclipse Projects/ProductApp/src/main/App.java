package main;

import java.util.List;

import bean.Product;
import service.ProductService;

public class App {

	public static void main(String[] args) {
		ProductService ps = new ProductService();
		
		/*List<Product> listOfProducts = ps.getAllProductDetails();
		for(Product pp:listOfProducts) {
			System.out.println(pp);
		}*/
		
		Product p = new Product(4, "Computer", 45000);
		String result = ps.addProduct(p);
		System.out.println(result);
	}

}
