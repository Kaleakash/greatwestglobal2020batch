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
	
	public Employee getEmployeeById(int id) {
		try {
			con = dataSource.getConnection();				// getting the connection with help of DataSource using application.properties file 
			pstmt = con.prepareStatement("select * from employee where empid=?");
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				Employee emp = new Employee();
				emp.setEmpId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getFloat(3));
				return emp;
			}
		}catch (Exception e) {
			
		}
		return null;
	}
	
	public int storeEmployeeRecord(Employee emp) {
		try {
			con = dataSource.getConnection();				// getting the connection with help of DataSource using application.properties file 
			pstmt = con.prepareStatement("insert into employee values(?,?,?)");
			pstmt.setInt(1, emp.getEmpId());
			pstmt.setString(2, emp.getName());
			pstmt.setFloat(3, emp.getSalary());
			return pstmt.executeUpdate();			//if success
		}catch (Exception e) {
			return 0;											//failure 
		}
	}
	
	public int updateEmployeeDetails(Employee emp) {
		try {
			con = dataSource.getConnection();				// getting the connection with help of DataSource using application.properties file 
			pstmt = con.prepareStatement("update employee set salary = salary + ? where empId=?");
			pstmt.setFloat(1, emp.getSalary());
			pstmt.setInt(2, emp.getEmpId());
			return pstmt.executeUpdate();			//if success
		}catch (Exception e) {
			return 0;											//failure 
		}
	}
	
	
	
	public int deleteEmployeeById(int empId) {
		try {
			con = dataSource.getConnection();				// getting the connection with help of DataSource using application.properties file 
			pstmt = con.prepareStatement("delete from employee where empId=?");
			pstmt.setInt(1, empId);
			return pstmt.executeUpdate();			//if success
		}catch (Exception e) {
			return 0;											//failure 
		}
	}
	
	
	public int getCount(String tableName) {
		try {
			con = dataSource.getConnection();				// getting the connection with help of DataSource using application.properties file 
			pstmt = con.prepareStatement("select count(*) from "+tableName);
			rs = pstmt.executeQuery();
			rs.next();
			return rs.getInt(1);
		}catch (Exception e) {
			return 0;											//failure 
		}
	}
}
