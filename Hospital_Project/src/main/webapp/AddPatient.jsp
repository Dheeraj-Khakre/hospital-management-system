<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Patient Details</title>
<%@include file="all_css_Script.jsp"%>
</head>
<body>
	<%@include file="BranchPage.jsp"%>


	<form action="addpatient" method="post">

		<div class="mb-3">
			<label for="name" class="form-label">Enter Patient Name</label> 
			<input
				type="text" class="form-control" id="name"
				aria-describedby="emailHelp" name="name">
			</div>
		<div class="mb-3">
			<label for="age" class="form-label">Enter Patient Age</label> <input
				type="number" class="form-control" id="age" name="age">
		</div>
		<div class="mb-3">
			<label for="no" class="form-label">Enter mobile Number</label> <input
				type="number" class="form-control" id="no" name="no">
		</div>

		<div class="mb-3">
			<label for="bg" class="form-label">Enter Blood Group</label> <input
				type="text" class="form-control" id="bg" name="bg">
		</div>
		
		<input type="hidden" value="<%=request.getParameter("bid")%>"
			name="bid">

		<button type="submit" class="btn btn-primary">Submit</button>
	</form>

</body>
</html>