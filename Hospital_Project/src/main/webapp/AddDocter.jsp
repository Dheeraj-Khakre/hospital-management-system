<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Doctor </title>
<%@include file="all_css_Script.jsp"%>
</head>
<body>
<%@include file="BranchPage.jsp"%>

      <form action="adddoctor" method="post">   
  
  <div class="mb-3">
    <label for="Email" class="form-label">Email address</label>
    <input type="email" class="form-control" id="Email" aria-describedby="emailHelp" name="email">
    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
  </div>
  <div class="mb-3">
    <label for="Password" class="form-label">Password</label>
    <input type="password" class="form-control" id="Password" name="psw">
  </div>
   <div class="mb-3">
    <label for="name" class="form-label">Enter  Doctor Name</label>
    <input type="text" class="form-control" id="name" name="name" >
  </div>
  
 <div class="mb-3">
    <label for="graduation" class="form-label">Enter graduation</label>
    <input type="text" class="form-control" id="Password" name="graduation">
  </div>
   <div class="mb-3">
    <label for="yoe" class="form-label">Enter Year Of Experience</label>
    <input type="number" class="form-control" id="yoe" name="yoe" >
  </div>
  <input type="hidden" value="<%= request.getParameter("bid")%>"  name="bid">
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>