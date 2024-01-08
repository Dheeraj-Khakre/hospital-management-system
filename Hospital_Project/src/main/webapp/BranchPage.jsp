<%@page import="Entity.Branch"%>
<%@page import="Entity.Factory"%>
<%@page import="javax.persistence.EntityManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Branch PAge</title>
<%@include file="all_css_Script.jsp"%>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="BranchPage.jsp">Hospital Branch</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="#">About</a></li>
					
			      <%
			      EntityManager em = Factory.factory().createEntityManager();
				  
				   Branch b = (Branch) em.find(Branch.class,Integer.parseInt(request.getParameter("bid")) );
				   
				  if(b.getManager()==null)
				  {
			      %>		
					
					
					<li class="nav-item"><a class="nav-link"
						href="AddManager.jsp?bid=<%=request.getParameter("bid")%>">Add
							Manager</a></li>
					<%} %>		
							
							
							
							
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">
							Doctor </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item"
								href="AddDocter.jsp?bid=<%=request.getParameter("bid")%>">Add
									Doctor</a></li>
							<li><a class="dropdown-item" href="AllDoctor.jsp?bid=<%=request.getParameter("bid")%>">All Doctor</a></li>
							<li><hr class="dropdown-divider"></li>
							<li><a class="dropdown-item" href="#">Delete Doctor</a></li>
							<li><a class="dropdown-item" href="#">update Doctor</a></li>

						</ul></li>
						
						
							<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">
							Patient </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item"
								href="AddPatient.jsp?bid=<%=request.getParameter("bid")%>">Add
									Patient</a></li>
							<li><a class="dropdown-item" href="AllPatient.jsp?bid=<%=request.getParameter("bid")%>">All Patient</a></li>
							<li><hr class="dropdown-divider"></li>
							<li><a class="dropdown-item" href="#">Delete Patient</a></li>
							<li><a class="dropdown-item" href="#">update Patient</a></li>

						</ul></li>
						
						



				</ul>
				<form class="d-flex">
					<input class="form-control me-2" type="search" placeholder="Search"
						aria-label="Search">
					<button class="btn btn-outline-success" type="submit">Search</button>
				</form>
			</div>
		</div>
	</nav>
</body>
</html>