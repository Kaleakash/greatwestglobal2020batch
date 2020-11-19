<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!String name,pass; %>
<%
name = request.getParameter("uname");
pass = request.getParameter("pname");
if(name.equals("Ramesh") && pass.equals("123")){
	out.println("Successfully Login");
}else {
	out.println("Failure try once again");
}
%>
</body>
</html>