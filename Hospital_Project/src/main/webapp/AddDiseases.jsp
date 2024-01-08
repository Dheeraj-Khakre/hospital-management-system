<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Diseases Details</title>
<%@include file="all_css_Script.jsp"%>
</head>
<body>
	<%@include file="BranchPage.jsp"%>


	<form action="adddiseases" method="post">

		<div class="mb-3">
			<label for="name" class="form-label">Enter Diseases Name</label> 
			<input
				type="text" class="form-control" id="name"
				aria-describedby="emailHelp" name="dname">
			</div>
		<div class="mb-3">
			<label for="age" class="form-label">Enter symptoms Age</label> <input
				type="text" class="form-control" id="age" name="symptoms">
		</div>
		
		
		<input type="hidden" value="<%=session.getAttribute("pid")%>"
			name="pid">

		<button type="submit" class="btn btn-primary">Submit</button>
	</form>

</body>
</html>