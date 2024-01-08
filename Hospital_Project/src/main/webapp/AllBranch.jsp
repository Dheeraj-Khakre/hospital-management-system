<%@page import="java.util.List"%>
<%@page import="Entity.Branch"%>
<%@page import="Entity.Factory"%>
<%@page import="javax.persistence.EntityManager"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Branch</title>
<%@include file="all_css_Script.jsp"%>
</head>
<body>
	<%@include file="Ceopage.jsp"%>


	<%
	EntityManager em = Factory.factory().createEntityManager();
	@SuppressWarnings("unchecked")
	List<Branch> branchs = em.createQuery("from Branch").getResultList();

	for (Branch b : branchs) {
	%>



	<div class = "container text-center m-4  position-retative">



		<div class="card mt-3" style="width: 18rem;">
			<img src="https://source.unsplash.com/800x400/?hospital"
				class="card-img-top" alt="...">
			<div class="card-body">
				<h5 class="card-title">
					branch name :
					<%=b.getBname()%>
				</h5>
				<p class="card-text">About the branch</p>
			</div>
			<ul class="list-group list-group-flush">
				<li class="list-group-item">branch name :<%=b.getBname()%> </li>
				<li class="list-group-item">Branch Manager : <%=b.getManager().getmName()%></li>
				<li class="list-group-item">Address : <%=b.getAddress().getDid()%> <%= b.getAddress().getLandMark()%> <%= b.getAddress().getCity()%><%= b.getAddress().getState()%>
		<%=b.getAddress().getPincode()%></li>
			</ul>
			<div class="card-body">
				<a href="BranchPage.jsp?bid=<%=b.getBid() %>" class="card-link">View Branch</a>

			</div>
		</div>


</div>
	
	<%
	}
	%>



</body>
</html>