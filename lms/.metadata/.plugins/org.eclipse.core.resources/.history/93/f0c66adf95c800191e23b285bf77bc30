<%@page import="com.hcl.ems.EMSLogin"%>
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
	String user=request.getParameter("empId");
	String pwd=request.getParameter("secretCode");
	boolean result=EMSLogin.authenticate(Integer.parseInt(user), pwd);
	if(result==true) {
		session.setAttribute("user", user);
%>

<jsp:forward page="DashBoard.jsp" />
<%
	} else {
%>
<p>Invalid Credentials</p>
<jsp:include page="Login.html" />
<%
	}
%>

</body>
</html>