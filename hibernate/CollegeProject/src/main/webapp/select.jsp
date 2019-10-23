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
<body>
<form method="get" action="select.jsp" name="frmFeedback">
      Select Instructor:
      <select name="instructor" onchange="change();">
    <option value="dropdown">Please Select</option>
    <%
List<String> lst=new CollegeCrud().getInstructors();
for(String s : lst){
%>

<option value="<%=s%>"> <%=s%> </option>
<%
}
%>

    </select>
   
        <%
   
    session.setAttribute("instructor",request.getParameter("instructor"));
 
%>
       
       
    Select Subject:
    <select name="subject">
    <option value="dropdown"></option>
    <%
    String ins=request.getParameter("instructor");

session.setAttribute("instructor",ins);



List<String> lst1=new CollegeCrud().subjectList(ins);

for(String s : lst1){
%>

<option value="<%=s%>"> <%=s%> </option>

<%
}
%>
</select>
<%
     session.setAttribute("subject",request.getParameter("subject"));
 
    %>
    </form>
    <form method="get" action="dashboard.jsp">
    <input type="submit" value="Show" />
   
</form>


 <script>
        function change(){
         
           document.frmFeedback.submit();
     
        }
        </script>

      

</body>
</html>