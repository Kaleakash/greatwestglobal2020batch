<%@page import="java.util.Iterator"%>
<%@page import="bean.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="EmployeeController">Load the Data</a>


<table border="1">
	<tr>
		<th>EmpId</th>
		<th>Name</th>
		<th>Salary</th>
	</tr>

<%
Object obj = session.getAttribute("empDetails");
if(obj!=null){
	List<Employee> listOfEmp = (List<Employee>)obj;
	
	Iterator<Employee> ii = listOfEmp.iterator();
	while(ii.hasNext()){
		Employee emp = ii.next();
		%>
		<tr>
		<td><%=emp.getEmpId() %></td>
		<td><%=emp.getName() %></td>
		<td><%=emp.getSalary() %></td>
		</tr>
		<%
	}
}
%>
</table>
</body>
</html>