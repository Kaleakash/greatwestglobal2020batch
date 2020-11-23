package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Employee;
import resource.DbConnection;

public class EmployeeDao {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	public List<Employee> getEmployeeFromDb() {
		List<Employee> listOfEmployees = new ArrayList<Employee>();
		try {
			con = DbConnection.getDbConnection();
			pstmt = con.prepareStatement("select * from employee");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee(rs.getInt(1), rs.getString(2), rs.getFloat(3));
				listOfEmployees.add(emp);
			}
		} catch (Exception e) {	}
		return listOfEmployees;
	}
}
