<%@page import="com.hcl.ems.Employee"%>
<%@page import="com.hcl.ems.EmployeeDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int empId=Integer.parseInt((String)session.getAttribute("user"));
		EmployeeDAO dao=new EmployeeDAO();
		Employee employee=dao.myDetails(empId); 
		
		int mgrId=employee.getEmp_mgr_id();
		Employee manager=dao.myDetails(mgrId);
		out.println("Employee Id  " +manager.getEmp_id()); 
		out.println("Full Name  " +manager.getEmp_name());
		out.println("Email " +manager.getEmp_email());
		
	%>

</body>
</html>