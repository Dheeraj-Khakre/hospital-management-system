<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Address for Branch </title>
<%@include file="all_css_Script.jsp"%>
</head>
<body>

	<%@include file="Ceopage.jsp"%>
	<H1> Enter Address Details</H1>

	<div class="container">
		<form action="addaddress" method="post">
			<div class="mb-3">
				<label for="did" class="form-label">enter  multi no.
					</label> <input type="number" class="form-control"
					id="did" aria-describedby="emailHelp" name="did" required="required">
				
			</div>
			<div class="mb-3">
				<label for="streat" class="form-label">Enter Streat  name</label>
				<input type="text" class="form-control"
					id="streat" name ="streat" required="required">
			</div>
			<div class="mb-3">
				<label for="lm" class="form-label">Enter LandMark  name</label>
				<input type="text" class="form-control"
					id="lm" name ="lm" required="required">
			</div>
			<div class="mb-3">
				<label for="city" class="form-label">Enter city  name</label>
				<input type="text" class="form-control"
					id="city" name ="city" required="required">
			</div>
			<div class="mb-3">
				<label for="state" class="form-label">Enter State  name</label>
				<input type="text" class="form-control"
					id="state" name ="state" required="required">
			</div>
			<div class="mb-3">
				<label for="pincode" class="form-label">Enter pin code  </label>
				<input type="number" class="form-control"
					id="pincode" name ="pincode" required="required">
			</div>
			 			
			<input class="btn btn-primary"type="submit">
		</form>
	</div>

</body>
</html>