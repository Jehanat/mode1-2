<%@page import="com.hcl.hib.CollegeCrud"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><%
	CollegeCrud c=new CollegeCrud();
	String fid=c.feedbackId();
	session.setAttribute("fid",fid);
	
%>
<form  method="get" action="AddFeedback.jsp" name="frmfeedback">

FeedBackID:

<input type="text" name="fid" value=<%=fid %>> 
<% List<String> lstinstr=new CollegeCrud().getInstructors();%>

StudentName:
<input type="text" name="studentName" /> </br><br/>
<center>
Instructor

<select name="instructor"  onchange="change()">
<option value="please select">Please select the Instructor</option>

<%

		for(String s : lstinstr){
	%>
	
		<option value=<%=s %>><%=s%> </option>
	
	<%
		}
	
	%>
</center>
</select>
<% session.setAttribute("studentName",request.getParameter("studentName"));
session.setAttribute("instructor",request.getParameter("instructor"));
%>
</form>
<h4>Please give your feedback</h4>
<form method="get" action="FeedbackConfirm.jsp">
Select Subject

<select name="subject" >
<option value="dropdown"></option>
<%
String instr=request.getParameter("instructor");
session.setAttribute("instructor",instr);
		
		List<String> lstinstr1=new CollegeCrud().subjectList(instr);
		for(String s : lstinstr1){

			%>
		<option value=<%=s%> ><%=s%></option>
	
	<%
		}
	
	%>
		
</select>


<input type="radio" id="choice1"
name="fbvalue" value="Excellent">
<label for="choice1">Excellent</label>

<input type="radio" id="choice2"
name="fbvalue" value="Good">
<label for="choice2">Good</label>
<input type="radio" id="choice3"
name="fbvalue" value="Adequate">
<label for="choice3">Adequate</label>
<input type="radio" id="choice4"
name="fbvalue" value="Inadequate">
<label for="choice4">Inadequate</label>
<input type="submit" value="Show"/><br/><br/>

</form>
<script >
function change(){
	document.frmfeedback.submit();
	}
	</script>
</body>
</html>