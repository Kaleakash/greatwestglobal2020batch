package service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import bean.Product;

public class ProductServiceImp implements ProductService {

	@Override
	public int addProduct(Product prd) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Product> getAllProduct() {
		// TODO Auto-generated method stub
		ArrayList<Product> al = new ArrayList<Product>();
		return al;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		//List<Product> l1 = new ArrayList<Product>();
		//List<Product> l1 = new LinkedList<Product>();
		List<Product> l1 = new Vector<Product>();
		return l1;
	}

	@Override
	public Set<String> getInfo() {
		// TODO Auto-generated method stub
		//Set<String> listOfStd = new HashSet<String>();
		//Set<String> listOfStd = new LinkedHashSet<String>();
		Set<String> listOfStd = new TreeSet<String>();
		return listOfStd;
	}

	
}


