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
<% 
int deptno=Integer.parseInt(request.getParameter("deptno"));
DepartmentCrud crud=new DepartmentCrud();
Department d=crud.searchDepartment(deptno);
%>
<form method="get" action="DepartmentUpdate.jsp">

Department No:
<input type="text" name="deptno" readonly="readonly" value=<%=d.getDeptno() %> /><bt/><br/>
Department name:
<input type="text" name="dname" value=<%=d.getDname()%> /> <br/><br/>
Location:
<input type="text" name="loc" value=<%=d.getLoc()%> /> <br/><br/>
Head:
<input type="text" name="head" value=<%=d.getHead()%> /> <br/><br/>

<input type="submit" value="Update" />
</form>
<%
if(request.getParameter("deptno")!=null &&
request.getParameter("dname")!=null &&
request.getParameter("loc")!=null &&
request.getParameter("head")!=null ){
	 d=new Department();
	d.setDeptno(Integer.parseInt(request.getParameter("deptno")));
	d.setDname(request.getParameter("dname"));
	d.setLoc(request.getParameter("loc"));
	d.setHead(request.getParameter("head"));
	
     crud=new DepartmentCrud();
	out.println(crud.updateDepartment(d));
	%>
<jsp:forward page="DepartmentShow.jsp"/>
<%
}

%>

</body>
</html>