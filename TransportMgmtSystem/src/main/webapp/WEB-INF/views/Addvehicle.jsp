<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>


<meta charset="ISO-8859-1">
<title>In</title>
</head>
<body>
<h3 class="col-sm-4">Add Vehicle</h3>
	
<form action="./AddVehicle" method="post" class="col-sm-6">
  <div class="form-group" >
    <label for="formGroupExampleInput">Registration Number</label>
    <input type="text" class="form-control" id="formGroupExampleInput" placeholder="Input Vehicle Registration No" name="rejNo">
  </div>
  <div class="form-group">
    <label for="formGroupExampleInput2">Vehicle Type</label>
  	<select class="custom-select" name="vehicleType">
  		<option selected>Open this select menu</option>
  		<option value="Motor Car">Motor Car</option>
  		<option value="Motor Van">Motor Van</option>
  		<option value="Motor Coach">Motor Coach</option>
	</select>
  </div>
   <div class="form-group">
    <label for="formGroupExampleInput">Number of Pessengers</label>
     <input class="form-control" type="number" value="42" id="example-number-input" name="noOfPessengers">  
  </div>
   <div class="form-group">
    <label for="exampleFormControlSelect1">Select Status</label>
    <select class="form-control" id="exampleFormControlSelect1" name="VehicleStatus">
      <option>Available</option>
      <option>Not Available</option>
    </select>
  </div>
     <div class="form-group">
     <input class="btn btn-primary col-sm-4" type="submit" value="Submit" onclick="check()"> 
     <input class="btn btn-primary col-sm-4" type="Reset" value="Reset">
     </div>
</form>

</body>
</html>