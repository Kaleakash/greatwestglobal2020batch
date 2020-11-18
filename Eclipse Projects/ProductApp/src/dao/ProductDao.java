package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Product;
import resource.DbConnection;



public class ProductDao {
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	Connection con;
	
	public List<Product> retrieveAllProduct() {
	
		List<Product> listOfProduct = new ArrayList<Product>();
					try {
					con = DbConnection.getDbConnection();
					pstmt = con.prepareStatement("select * from product");
					rs = pstmt.executeQuery();
					while(rs.next()) {
						//we have to convert all sql query to objects(product)
						Product pp = new Product();
						pp.setPid(rs.getInt(1));
						pp.setPname(rs.getString(2));
						pp.setPrice(rs.getFloat(3));
						listOfProduct.add(pp);
					}
					} catch (Exception e) {
						System.out.println("retrieveAll product "+e);
					}					
					return listOfProduct;
					
	}
	
	
	public int addProduct(Product pp) {
		try {
			con = DbConnection.getDbConnection();
			pstmt = con.prepareStatement("insert into product values(?,?,?)");
			pstmt.setInt(1, pp.getPid());
			pstmt.setString(2, pp.getPname());
			pstmt.setFloat(3, pp.getPrice());
			return pstmt.executeUpdate();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Add Product "+e);
			return 0;
		}
	}
}
