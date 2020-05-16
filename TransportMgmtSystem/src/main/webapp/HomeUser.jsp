<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
mar {
  margin-top: 50px;
  margin-right: 50px;
  margin-left:50px;
  margin-right:50px;
}
</style>

<meta charset="ISO-8859-1">
<title>Home User Page</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Home</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
  <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Student
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="?page=register">Add Student</a>
          <a class="dropdown-item" href="#">Modify Student</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">View Students</a>
        </div>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Driver
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="?page=register">Add Driver</a>
          <a class="dropdown-item" href="#">Modify Driver</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">View Drivers</a>
        </div>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Routes
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="?page=addRoute">Add Routes</a>
          <a class="dropdown-item" href="#">Modify Routes</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">View Special Bookings</a>
          <a class="dropdown-item" href="#">View All Routes</a>
        </div>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Vehicles
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="?page=addvehicle">Add Vehicle</a>
          <a class="dropdown-item" href="#">Modify Vehicle</a>
          <a class="dropdown-item" href="#">Notify Break Down</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">View All Vehicles</a>
        </div>
      </li>
    </ul>
    <span class="navbar-text">
     <a href="./Login.jsp"> Log in </a> 
    </span>
    <pre>   </pre>    
    <span class="navbar-text">
     <a href="./LogOut.jsp"> Log Out</a> 
    </span>
  </div>
</nav>
<div class="mar" style="martin-top: 15px">
<%if(request.getParameter("page") != null){ %>
<% if(request.getParameter("page").equals("register")){ %>
	    <jsp:include page="/WEB-INF/views/RegisterUser.jsp"></jsp:include>
    
 <% } else if  (request.getParameter("page").equals("addvehicle")){ %>
 	 	<jsp:include page="/WEB-INF/views/Addvehicle.jsp"></jsp:include>
	
 <% } else if  (request.getParameter("page").equals("addRoute")){ %>
 
 <jsp:include page="/WEB-INF/views/addRoute.jsp"></jsp:include>
 
<% }} %>
</div>
</body>
<script
  src="https://code.jquery.com/jquery-3.5.1.min.js"
  integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0="
  crossorigin="anonymous">
  
  </script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>

</html>