<%@page import="Entity.Doctor"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Doctor</title>
<%@include file="all_css_Script.jsp"%>
</head>
<body>
<%@include file="BranchPage.jsp"%>


                    
                    <%

	        
	
	for (Doctor d:b.getDoctors()) {
	%>



	<div class = "container text-center m-4  position-retative">



		<div class="card mt-3" style="width: 18rem;">
			<img src="https://source.unsplash.com/800x400/?Doctor"
				class="card-img-top" alt="...">
			<div class="card-body">
				<h5 class="card-title">
					Doctor Name :
					<%=d.getDoc_name()%>
				</h5>
				<p class="card-text">About the branch</p>
			</div>
			<ul class="list-group list-group-flush">
				<li class="list-group-item">Doctor name:<%=d.getDoc_name()%></li>
				<li class="list-group-item">Specilization : <%=d.getSpecilization()%></li>
				<li class="list-group-item"> Year Of Experience : <%=d.getYearOfExp() %></li>
			</ul>
			<div class="card-body">
				<a href="#" class="card-link">View Patient under Doctor</a>

			</div>
		</div>


</div>
	
	<%
	}
	%>

                    




</body>
</html>