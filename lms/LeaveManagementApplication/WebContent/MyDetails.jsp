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
	int emp_Id=Integer.parseInt((String)session.getAttribute("user"));
	EmployeeDAO dao=new EmployeeDAO();
	Employee employee=dao.myDetails(emp_Id);
	out.println("Employee Id  " +employee.getEmp_id()); 
	out.println("Full Name  " +employee.getEmp_name());
	out.println("Email " + employee.getEmp_email());
	out.println("Mobile No " +employee.getEmp_mob_no());
	out.println("Date joined " +employee.getEmp_date_joined());
	out.println("Department " +employee.getEmp_dept_name());
	out.println("Available leave balance" +employee.getEmp_leave_balance());
%>
	
	
</body>
</html>