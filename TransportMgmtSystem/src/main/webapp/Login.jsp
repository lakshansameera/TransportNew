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
<script>
function check_login()
{
	if(this.document.frm_login.login_user.value=="")
	{
		alert("Please enter the user name.");
		return false;
	}
	if(this.document.frm_login.login_password.value=="")
	{
		alert("Please enter the password.");
		return false;
	}
	return true;
}

</script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="jumbotron col-sm-6" style="margin-top:150px; margin-right: auto; margin-left: auto;" onSubmit="return check_login()" >
<form action="Login" method="Post" class="col-sm-6" style="margin:auto" onSubmit="return check_login()" name="frm_login" >
  <div class="form-group row">
    <label for="staticEmail" class="col-sm-4 col-form-label">Email</label>
    <div class="col-sm-8">
      <input type="text" class="form-control" id="staticEmail" value="" name="login_user">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword" class="col-sm-4 col-form-label">Password</label>
    <div class="col-sm-8">
      <input type="password" class="form-control" id="inputPassword" name ="login_password">
    </div>
  </div>
  
  <div class="form-group row">
  	<div class="col-sm-4">
  			<a class="clickable" href="">Rest</a>
  	</div>
  	<div class ="col-sm-4">
  		<input class="btn btn-primary pull-right" type="submit" value="Log In">
  	</div>
  </div>
</form>
</div>
</body>
</html>