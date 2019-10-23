<%@page import="com.hcl.hib.Department"%>
<%@page import="java.util.List"%>
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
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="3">
<tr>
<th>Deptno</th>
<th>Dname</th>
<th>Loc</th>
<th>Head</th>
<th>Update</th>
<th>Delete</th>

</tr>
<%
DepartmentCrud obj=new DepartmentCrud();
List<Department> lstDept =obj.showDepartment();
for(Department d : lstDept){
%>
<tr>
<td><%=d.getDeptno() %> </td>
<td><%=d.getDname() %> </td>
<td><%=d.getLoc() %> </td>
<td><%=d.getHead() %> </td>

<td><a href=DepartmentUpdate.jsp?deptno=<%=d.getDeptno()%> >Update</a></td>
<td><a href=DepartmentDelete.jsp?deptno=<%=d.getDeptno()%> >Delete</a></td>

</tr>
<%
}
%>

</table>
</body>
</html>