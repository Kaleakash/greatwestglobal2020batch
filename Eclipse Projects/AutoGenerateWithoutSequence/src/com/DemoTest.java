package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoTest {

	public static void main(String[] args) throws Exception{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "scott", "tiger");
	Statement stmt = con.createStatement();
	ResultSet rs	 = stmt.executeQuery("select count(*) from product");
	rs.next();
	int count = rs.getInt(1);
	System.out.println("Number of Records are "+count);
	PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?)");
	pstmt.setInt(1, (count+1));
	}

}
