<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employ List</title>
</head>
<body>

	<div align="center">
		<h1>Employee List</h1>
		
		
		
		<table border="1">
            <th>Employee_No</th>
			<th>Name</th>
			<th>Department</th>
			<th>Designation</th>
		    <th>Salary</th>
			
			
			<c:forEach var="employ" items="${employList}">
				
				<tr>

					<td>${employ.empno}</td>
					<td>${employ.name}</td>
					<td>${employ.dept}</td>
					<td>${employ.desig}</td>
					<td>${employ.basic}</td>
					
					
				</tr>
			</c:forEach>
		</table>
		
	
		<c:set var="num" value="${pages }"/>
<div class="dropdown">
  <button onclick="myFunction()" class="dropbtn">Drop-down</button>
  <div id="myDropdown" class="dropdown-content">
<%
int n=((Integer)pageContext.getAttribute("num")).intValue();
for(int i=0;i<n;i++){
%>


   <a href="/displayAll/Page/<%=i%>"><%=i+1 %></a>&nbsp;&nbsp;
 
               
<%
}
%>
</div>




<script type="text/javascript">
/* When the user clicks on the button,
toggle between hiding and showing the dropdown content */
function myFunction() {
  document.getElementById("myDropdown").classList.toggle("show");
}

// Close the dropdown if the user clicks outside of it
window.onclick = function(event) {
  if (!event.target.matches('.dropbtn')) {
    var dropdowns = document.getElementsByClassName("dropdown-content");
    var i;
    for (i = 0; i < dropdowns.length; i++) {
      var openDropdown = dropdowns[i];
      if (openDropdown.classList.contains('show')) {
        openDropdown.classList.remove('show');
      }
    }
  }
}
</script>



		
		<a href="/">Home</a><br><br>
		
		
		
		<!--  <h4>
		 <a href="/displayAll/Page/0">Page1</a></br>
		  <a href="/displayAll/Page/1">Page2</a></br>
		  <a href="/displayAll/Page/2">Page3</a></br>
		   <a href="/displayAll/Page/3">Page4</a>
		</h4>
		-->
<!-- 	<h4>
			 Java_Engineers <a href="/displayjavaengineers">here</a></br>
			 Java_Programmers whose salary is more than 40k <a href="/salaryjava">here</a><br/>
			 Java_Employees with salary less than 40k<a href="/salaryemploy">here</a>
			All_Employees_Sortedby_Desig <a href="/displayAllSortByDesig">here</a></br>
			All_Employees_Sortedbydesc_Desig <a href="/displayAllSortDescByDesig">here</a></br>
			All_Employees_Sortedbydesc <a href="/displayAllSortDesc">here</a></br>
			All_Java_Programmer_SortedbySalary <a href="/JavaProgrammerBySalary">here</a></br>
			All_Java_Programmer_SortedbySalaryAndName <a href="/JavaProgrammerBySalaryAndName">here</a>
		
		</h4> -->
		
		
		
		
	</div>
</body>
</html>