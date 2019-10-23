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
url="jdbc:mysql://localhost:3306/sqlpractice"
user="root"
password="root"
/>
<sql:query var="depQuery" dataSource="${conn}">
select * from Department
</sql:query>
<c:forEach var="d" items="${depQuery.rows }">
Department No:
<c:out value="${d.deptno }"/><br/>
Department Name:
<c:out value="${d.dname }"/><br/>
Location:
<c:out value="${d.loc }"/><br/>
Head:
<c:out value="${d.head }"/><br/>

</c:forEach>

</body>
</html>