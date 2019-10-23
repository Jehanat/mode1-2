<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="conn"
driver="com.mysql.jdbc.Driver"
url="jdbc:mysql://localhost:3306/bank"
user="root"
password="root"
/>
<sql:query var="accQuery" dataSource="${conn}">
select * from Accounts WHERE AccountNo=?
<sql:param value="${param.accno }"/>
</sql:query>
<c:set var="flag" value="0"/>
<c:forEach var="e" items="${accQuery.rows }">
Account No:
<c:out value="${e.accountNo}"/><br/>
First Name:
<c:out value="${e.firstName }"/><br/>
Last Name:
<c:out value="${e.lastName }"/><br/>
City:
<c:out value="${e.city }"/><br/>
State:
<c:out value="${e.state }"/><br/>
CheqFacility:
<c:out value="${e.cheqFacil }"/><br/>
Account Type:
<c:out value="${e.accountType }"/><br/>
<c:set var="flag" value="1"/>
</c:forEach>
<c:if test="${flag==0 }">
<c:out value="Account No Not Found..."/>
</c:if>

</body>
</html>