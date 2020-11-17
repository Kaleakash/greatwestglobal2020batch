package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.net.aso.p;

public class EmployeeDao {
	String url="jdbc:oracle:thin:@localhost:1521/orcl";
	String username="scott";
	String password="tiger";		
	public void retrieveEmployeeInfo() {
		try {

	Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded successfully...");
Connection con = DriverManager.getConnection(url, username, password);
System.out.println("Established the connection successfully....");
Statement stmt = con.createStatement();
System.out.println("Statement created...");
ResultSet rs = stmt.executeQuery("select * from employees");
while(rs.next()) {
	System.out.println("id is "+rs.getInt(1));
	System.out.println("first name is "+rs.getString("first_name"));
	System.out.println("last name is "+rs.getString(3));
	System.out.println("salary is "+rs.getFloat("salary"));
}
rs.close();
stmt.close();
con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	public void storeEmployee() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate("insert into employee values(2,'Ramesh',14000)");
			if(result>0) {
				System.out.println("record inserted successfull...");
			}
		} catch (Exception e) {
		System.out.println(e);
		}
	}
	
	
	public void deleteEmployeeById() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate("delete from employee where empid=1");
			if(result>0) {
				System.out.println("record deleted successfully");
			}else {
				System.out.println("Record is not present");
			}
		} catch (Exception e) {
		System.out.println(e);
		}	
	}
	public void updateEmployeeSalary() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate("update employee set salary = 25000 where empid=1");
			if(result>0) {
				System.out.println("Record updated successfully");
			}else {
				System.out.println("Record is not present");
			}
		} catch (Exception e) {
		System.out.println(e);
		}
	
	}
	
	public void storeEmployee(int empId, String name, float salary) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			Connection con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate("insert into employee values("+empId+",'"+name+"',"+salary+")");
			if(result>0) {
				System.out.println("record inserted successfull...");
			}
		} catch (Exception e) {
		System.out.println(e);
		}
	}
	
	public void storeEmpInfoUsingPrepared(int empId, String name, float salary) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
			pstmt.setInt(1, empId);
			pstmt.setString(2, name);
			pstmt.setFloat(3, salary);
			
			int result = pstmt.executeUpdate();
			if(result>0) {
				System.out.println("record inserted successfull...");
			}
		} catch (Exception e) {
		System.out.println(e);
		}
	}
	
	public void retrieveEmpInfoBySalaryCondition(float salary) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pstmt = con.prepareStatement("select * from employees where salary > ?");
			pstmt.setFloat(1, salary);
		ResultSet rs = pstmt.executeQuery();
		/*rs.next();
		System.out.println("Name is "+rs.getString("first_name"));
		rs.next();
		System.out.println("Name is "+rs.getString("first_name"));*/
		while(rs.next()) {
			System.out.println("Name is "+rs.getString("first_name"));
		}
		} catch (Exception e) {
		System.out.println(e);
		}
	}
	
	public void updateRecordUsingPrepared(int id, float salary) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			Connection con = DriverManager.getConnection(url, username, password);
PreparedStatement pstmt = con.prepareStatement("update employee set salary = ? where empid=?");
		pstmt.setFloat(1, salary);
		pstmt.setInt(2, id);
		int result = pstmt.executeUpdate();
		if(result>0) {
			System.out.println("Record updated successfully...");
		}else {
			System.out.println("Record not present");
		}
		} catch (Exception e) {
		System.out.println(e);
		}
	}
}


