package service;

import bean.Product;
import dao.ProductDao;

public class ProductService {
	ProductDao pd = new ProductDao();
	public int addProduct(Product pp) {
						if(pp.getSalary()>500) {	
						int res = pd.addProduct(pp);
						return res;
						}else {
							return 0;
						}
	}
	
	
}
