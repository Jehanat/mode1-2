<%@page import="com.hcl.hib.Department"%>
<%@page import="com.hcl.hib.DepartmentCrud"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% int deptno=Integer.parseInt(request.getParameter("deptno"));
DepartmentCrud crud=new DepartmentCrud();
Department d=crud.searchDepartment(deptno);
if(d!=null){
	
	out.println("Name of Department...."+d.getDname());
    out.println("Department Location........"+d.getLoc());
	out.println("Head......."+d.getHead());
	
}else{
	out.println("Record not found");

}
%>

	
</body>
</html>