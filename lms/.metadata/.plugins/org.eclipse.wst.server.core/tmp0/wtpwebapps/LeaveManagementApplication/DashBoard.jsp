<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<table border="3" cellspacing="10" cellpadding="10">
	<tr>
		<th>
			<jsp:include page="MyDetails.jsp" />
		</th>
		<th>
			<jsp:include page="MyManagerDetails.jsp" />
		</th>
	</tr>
	<tr>
		<th colspan="2">
			My Leave Application Section
		</th>
	</tr>
	<tr>
		<th colspan="2">
			My Reporting Employee's Pending Leave Applications Section
		</th>
	</tr>
</table>



</center>
</body>
</html>