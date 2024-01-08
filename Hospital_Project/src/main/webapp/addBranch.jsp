<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Branch</title>
<%@include file="all_css_Script.jsp"%>
</head>
<body>

	<%@include file="Ceopage.jsp"%>

	<div class="container">
		<form action="addbranch" method="post">
			<div class="mb-3">
				<label for="bid" class="form-label">enter Branch Id
					</label> <input type="number" class="form-control"
					id="hid" aria-describedby="emailHelp" name="bid" required="required">
				
			</div>
			<div class="mb-3">
				<label for="bname" class="form-label">Enter Branch name</label>
				<input type="text" class="form-control"
					id="hname" name ="bname" required="required">
			</div>
			
			
			<input class="btn btn-primary"type="submit">
		</form>
	</div>

</body>
</html>