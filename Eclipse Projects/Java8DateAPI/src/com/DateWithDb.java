package com;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;

public class DateWithDb {

	public static void main(String[] args) {
		try {
			LocalDate ld = LocalDate.now();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "scott", "tiger");
			Statement stmt = con.createStatement();
			ResultSet rs	 = stmt.executeQuery("select count(*) from product");
			rs.next();
			int seqCount = rs.getInt(1);
			PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?,?)");
			pstmt.setInt(1, (seqCount+1));
			pstmt.setString(2, "Bike");
			pstmt.setFloat(3, 200000);
			pstmt.setDate(4, Date.valueOf(ld));		// converting LocalDate into Sql Date format 
			int res = pstmt.executeUpdate();
			System.out.println(res);
		} catch (Exception e) {
		System.out.println(e);
		}
	}

}
