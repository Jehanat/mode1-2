<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="springForm" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<springForm:form method="post" commandName="Student" 
action="addStudent.jsp" >
Roll number:
<springForm input path="rollNum"/><br/><br/>

Student Name:
<springForm input path="sName"/><br/><br/>

Age:
<springForm input path="age"/><br/><br/>

Gender:
<springform:select>
<form:radiobutton path="gender" value="male"/> 
<form:radiobutton path="gender" value="female"/> 

</springform:select>



Country:
<springForm:select path="Country" id="dropdown" >
<springForm:option value="dropdown">Please select the country</springForm:option>
<springForm:option value="India">India</springForm:option>
<springForm:option value="UK">UK</springForm:option>
<springForm:option value="USA">USA</springForm:option>
<springForm:option value="Australia">Australia</springForm:option>
</springForm:select>
<br/><br/>

DateOfJoin:
<springForm input path="dateOfJoin"/><br/><br/>

Final Score:
<springForm input path="finalScore"/><br/><br/>

<center>
<input type="submit" value="Add Student"/><br/><br/>
</center>


</springForm:form>

</body>
</html>