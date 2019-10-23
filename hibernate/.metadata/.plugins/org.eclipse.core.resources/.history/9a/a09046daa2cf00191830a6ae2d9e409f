<%@page import="com.hcl.hib.CollegeCrud"%>
<%@page import="com.hcl.hib.Subject"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="AddSubject.jsp" name="selectForm">
<select name="subject" id="dropdown" onchange="change()">
<option value="dropdown">Please select the option</option>
<option value="DBMS">DBMS</option>
<option value="C Language">C Language</option>
<option value="C++">C++</option>
<option value="Data Structure">Data Structure</option>
<option value="Mobile Computing">Mobile Computing</option>
<option value="Pattern Recognition">Pattern Recognition</option>
<option value="IT infrastructure">IT infrastructure</option>
</select>
</br></br>
Theory:
<input type="text" name="theory" readonly="readonly" /> <br/><br/>
Practical:
<input type="text" name="practical"  readonly="readonly" /> <br/><br/>
Year:
<input type="text" name="year"/></br></br>
Instructor:
<input type="text" name="instructor"/></br></br>
<input type="submit" name="Click"/>

<script >
function change(){
	var x=document.getElementById("dropdown").value;
	if(x=="DBMS"){
		selectForm.theory.value="35";
		selectForm.practical.value="20";
		
	}
	
	if(x=="C Language"){
		selectForm.theory.value="38";
		selectForm.practical.value="32";
		
	}
	if(x=="C++"){
		selectForm.theory.value="39";
		selectForm.practical.value="20";
		
	}
	if(x=="Data Structure"){
		selectForm.theory.value="40";
		selectForm.practical.value="9";
		
	}
	if(x=="Mobile Computing"){
		selectForm.theory.value="41";
		selectForm.practical.value="8";
		
	}
	if(x=="Pattern Recognition"){
		selectForm.theory.value="42";
		selectForm.practical.value="0";
		
	}
	if(x=="IT infrastructure"){
		selectForm.theory.value="43";
		selectForm.practical.value="0";
	}
	
}

</script>
<%if(request.getParameter("year")!=null &&
request.getParameter("instructor")!=null &&
request.getParameter("subject")!=null &&
request.getParameter("theory")!=null &&
request.getParameter("practical")!=null)
{
	Subject s=new Subject();
	
	s.setYear(Integer.parseInt(request.getParameter("year")));
	s.setInstructor(request.getParameter("instructor"));
	s.setSubject(request.getParameter("subject"));
	s.setPractical(Integer.parseInt(request.getParameter("practical")));
	s.setTheory(Integer.parseInt(request.getParameter("theory")));
	 CollegeCrud crud=new  CollegeCrud ();
	out.println(crud.insertSubject(s));


}


%>
</form>
</body>
</html>