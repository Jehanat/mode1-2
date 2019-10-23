<%@page import="com.hcl.bank.Accounts"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="bean1" class="com.hcl.bank.SearchAccount"/>
<jsp:setProperty property="*" name="bean1"/>
<%
Accounts obj=bean1.searchAccount();
if(obj!=null){
	
	out.println("First Name" +obj.getFirstName()+"<br/><br/>");
	out.println("Last Name " +obj.getLastName()+"<br/><br/>");
	out.println("City " +obj.getCity()+"<br/><br/>");
	out.println("State " +obj.getState()+"<br/><br/>");
	out.println("Amount" +obj.getAmount()+"<br/><br/>");
	out.println("Cheq Facil " +obj.getCheqfacil()+"<br/><br/>");
	out.println("Account Type " +obj.getAccountType()+"<br/><br/>");

}else{
	out.println("Record not Found!");

}




%>
</body>
</html>