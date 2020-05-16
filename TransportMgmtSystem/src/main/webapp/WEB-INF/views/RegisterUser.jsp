<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
function check()
{
	if(this.document.frm_Reg.nic.value=="")
	{
		alert("Please enter the user nic.");
		return false;
	}
	if(this.document.frm_Reg.email.value=="")
	{
		alert("Please enter the user email.");
		return false;
	}
	if(this.document.frm_Reg.Name.value=="")
	{
		alert("Please enter the user Name.");
		return false;
	}
	if(this.document.frm_Reg.address.value=="")
	{
		alert("Please enter the user address.");
		return false;
	}
	if(this.document.frm_Reg.city.value=="")
	{
		alert("Please enter the user city.");
		return false;
	}
	if(this.document.frm_Reg.contactNumber.value=="")
	{
		alert("Please enter the user Contact Number.");
		return false;
	}
	
	if(this.document.frm_Reg.regNumber.value=="")
	{
		alert("Please enter the user Registration Number.");
		return false;
	}
	if(this.document.frm_Reg.userType.value=="")
	{
		alert("Please enter the user user type.");
		return false;
	}

	return true;
}

</script>

</head>
<body>
<form action="Register" method="post" class="col-sm-8" onSubmit="return check()" name="frm_Reg" >
 <div class="form-group" >
    <label for="exampleFormControlInput1">NIC No</label>
    <input type="email" class="form-control" id="exampleFormControlInput1" name="nic" placeholder="">
  </div>	

  <div class="form-group" >
    <label for="exampleFormControlInput1">Email address</label>
    <input type="email" class="form-control" id="exampleFormControlInput1" name="email" placeholder="name@example.com">
  </div>
    <div class="form-group">
    <label for="formGroupExampleInput">Name</label>
    <input type="text" class="form-control" id="formGroupExampleInput" name="Name" placeholder="">
  </div>
  <div class="form-group">
    <label for="formGroupExampleInput">Address</label>
    <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="address"></textarea>
  </div>
 <div class="form-group">
    <label for="formGroupExampleInput">City</label>
    <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="city"></textarea>
  </div>
   <div class="form-group">
    <label for="formGroupExampleInput">Contact Number</label>
    <input type="text" class="form-control" id="formGroupExampleInput" name="contactNumber" placeholder="Example input placeholder">
  </div>
  <div class="form-group">
    <label for="formGroupExampleInput">Registration Number</label>
    <input type="text" class="form-control" id="formGroupExampleInput" name="rejNumber" placeholder="Example input placeholder">
  </div>
  
  <div class="form-group">
    <label for="exampleFormControlSelect1">Select User Type</label>
    <select class="form-control" id="exampleFormControlSelect1" name="userType">
      <option>Driver</option>
      <option>Student</option>
      <option>Employee</option>
    </select>
  </div>
<div class="form-group">
<button class="btn btn-primary col-sm-4 align-left" type="submit"> Submit</button>
<button class="btn btn-primary col-sm-4 align-right" > Reset</button>

</div>
  
</form>

</body>
</html>