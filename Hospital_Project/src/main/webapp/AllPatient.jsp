<%@page import="Entity.Diseases"%>
<%@page import="Entity.Patient"%>

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
	
	for (Patient p:b.getPatients()) {
	%>



	<div class = "container text-center m-4  position-retative">



		<div class="card mt-3" style="width: 18rem;">
			<img src="https://source.unsplash.com/800x400/?Patient"
				class="card-img-top" alt="...">
			<div class="card-body">
				<h5 class="card-title">
					Patient Name :
					<%=p.getpName()%>
				</h5>
				<p class="card-text">About the branch</p>
			</div>
			<ul class="list-group list-group-flush">
				<li class="list-group-item">Patient  name:<%=p.getpName()%></li>
				<li class="list-group-item">Age : <%=p.getAge()%></li>
				<li class="list-group-item"> Joining Date  : <%=p.getDateofjoin()%></li>
				   <%for(Diseases d : p.getDiseases()){ %>
				
				<li class="list-group-item"> Diseases Name   : <%=d.getDis_Name()%></li>
				<li class="list-group-item"> Diseases Symptoms  :<%=d.getSymptoms()%> </li>
				
				  <%} %>
			</ul>
			<div class="card-body">
				<a href="#" class="card-link">Add UpDate Patient Health</a>

			</div>
		</div>


</div>
	
	<%
	}
	%>

                    




</body>
</html>