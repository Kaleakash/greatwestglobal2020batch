package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import bean.Product;

public interface ProductService {	// Specification 

	public int addProduct(Product prd);
	public ArrayList<Product> getAllProduct();
	public List<Product> getAllProducts();
	public Set<String> getInfo();
}
