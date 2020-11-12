package service;

import bean.Product;

public class ProductService {
	Product prod[]=new Product[10];
	static int flag =0;
	public int addProduct(Product pp) {
		prod[flag]=pp;
		flag++;
		return 1;
	}
	
	public int addMoreProducts(Product pp[]) {
			for(int i=0;i<pp.length;i++) {
				prod[flag]=pp[i];
				flag++;
			}
		return 1;
	}
	public Product[] getAllProducts() {
		return prod;
	}
}
