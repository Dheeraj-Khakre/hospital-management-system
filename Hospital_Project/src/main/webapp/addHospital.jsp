<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Hospital Page</title>
<%@include file="all_css_Script.jsp"%>
</head>
<body>

	<%@include file="Ceopage.jsp"%>

	<div class="container">
		<form action="addhospitals" method="post">
			<div class="mb-3">
				<label for="hid" class="form-label">enter Hospital Id
					</label> <input type="number" class="form-control"
					id="hid" aria-describedby="emailHelp" name="hid" required="required">
				
			</div>
			<div class="mb-3">
				<label for="hname" class="form-label">Enter Hospital name</label>
				<input type="text" class="form-control"
					id="hname" name ="hname" required="required">
			</div>
			<div class="mb-3">
				<label for="ceo" class="form-label">Enter Hospital CEO name</label>
				<input type="text" class="form-control"
					id="ceo" name ="ceo" required="required">
			</div>
			
			<input class="btn btn-primary"type="submit">
		</form>
	</div>

</body>
</html>