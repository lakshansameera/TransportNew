<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link href="/css/login.css" rel="stylesheet" type="text/css">

<style>
mar {
  margin-top: 50px;
  margin-right: 50px;
  margin-left:50px;
  margin-right:50px;
}
</style>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="jumbotron col-sm-6" style="margin-top:150px; margin-right: auto; margin-left: auto;">
<form action="Login" method="Post" class="col-sm-6" style="margin:auto"" >
  <div class="form-group row">
    <label for="staticEmail" class="col-sm-4 col-form-label">Email</label>
    <div class="col-sm-8">
      <input type="text" class="form-control" id="staticEmail" value="email@example.com">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword" class="col-sm-4 col-form-label">Password</label>
    <div class="col-sm-8">
      <input type="password" class="form-control" id="inputPassword">
    </div>
  </div>
  
  <div class="form-group row">
  	<div class="col-sm-4">
  			<a class="clickable" href="">Rest</a>
  	</div>
  	<div class ="col-sm-4">
  		<input class="btn btn-primary pull-right" type="submit" value="Sign in">
  	</div>
  </div>
</form>
</div>
</body>
</html>