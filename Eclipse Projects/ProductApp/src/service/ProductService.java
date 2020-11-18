package service;

import java.util.Iterator;
import java.util.List;

import bean.Product;
import dao.ProductDao;

public class ProductService {
	ProductDao pd;
	
	public ProductService() {
		pd = new ProductDao();
	}
	public List<Product> getAllProductDetails() {
			
		List<Product> allProduct = pd.retrieveAllProduct();
		Iterator<Product> ii = allProduct.iterator();
		
		while(ii.hasNext()) {
			Product pp = ii.next();
			pp.setPrice(pp.getPrice()-pp.getPrice()*0.10f);
		}
		
		return allProduct;
	}
	
	public String addProduct(Product pp) {
	
		if(pp.getPrice()<10000) {
			return "Product price must be > 10000";
		}else {
			if(pd.addProduct(pp)>0) {
				return "Product Added Successfully";
			}else {
				return "Product Id must be unique";
			}
		}
	}
}
