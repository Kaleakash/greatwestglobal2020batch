package service;

import bean.Product;

public class ProductService {

	public void addProduct(int pid,String pname,float price) {
		System.out.println("Pid is "+pid);
		System.out.println("PName "+pname);
		System.out.println("Price "+price);
	}
	
	
	public void addProduct(Product pp) {
		System.out.println(pp.getPid()+" "+pp.getPname()+" "+pp.getPrice());
	}
	
	public float getProductPrice(int pid) {
		
		return 0;
	}
	
	public Product getProduct() {
		
		Product p = new Product();
		p.setPid(104);
		p.setPname("Computer");
		p.setPrice(55000);

		return p;
	}
	
	public void addAllProduct(Product pp[]) {
		
	}
	
	
	public Product[] getAllProductDetails() {
		Product pp[]=new Product[2];
		
		pp[0]=new Product();
		pp[0].setPid(100);
		pp[0].setPname("bike");
		pp[0].setPrice(130000);
		
		pp[1]=new Product();
		pp[1].setPid(101);
		pp[1].setPname("TV");
		pp[1].setPrice(100000);
		
		
		return pp;
	}
}


