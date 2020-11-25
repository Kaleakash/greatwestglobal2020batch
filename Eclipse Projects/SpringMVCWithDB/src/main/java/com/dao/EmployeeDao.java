package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository			//DAO layer specific annotation 
public class EmployeeDao {
	@Autowired
	DataSource dataSource;					//DataSource features of JDBC driverName,url,userName,password
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	public List<Employee> getAllEmployeeDetails() {
	List<Employee> listOfRec = new ArrayList<Employee>();
		try {
			con = dataSource.getConnection();				// getting the connection with help of DataSource using application.properties file 
			pstmt = con.prepareStatement("select * from employee");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setEmpId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getFloat(3));
				listOfRec.add(emp);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return listOfRec;
	}
}
