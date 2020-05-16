<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>

<style> 
.carouselsize
{
	width:1100px;
	hight:700px;
	margin: 20px;
	padding:10px;
}
.NewsMargin{
    margin:30px;
    padding:10px;
    
}

.center {
  margin: auto;
}
</style> 


<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div id="carouselExampleIndicators" class="carousel slide center carouselsize" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="./images/pg43-SLIIT.jpg" class="d-block w-100" alt="Image 1">
        <div class="carousel-caption d-none d-md-block">
        	<h5>Travel Safe</h5>
        	<p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
      	</div>
    </div>
    <div class="carousel-item">
      <img src="./images/Sliit-Student-Transport-1.jpg" class="d-block w-100" alt="...">
        <div class="carousel-caption d-none d-md-block">
        	<h5>From Your Home to University</h5>
        	<p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
      	</div>
    </div>
    <div class="carousel-item">
      <img src="./images/Sliit-Student-Transport.jpg" class="d-block w-100" alt="...">
        <div class="carousel-caption d-none d-md-block">
        	<h5>For a Considarable Fare</h5>
        	<p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
      	</div>
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
<div class="NewsMargin">
<div class="row">
  <div class="col-sm-6">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">News 1</h5>
        <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
        <a href="#" class="btn btn-primary">Go somewhere</a>
      </div>
    </div>
  </div>
  <div class="col-sm-6">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">News 2</h5>
        <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
        <a href="#" class="btn btn-primary">Go somewhere</a>
      </div>
    </div>
  </div>
</div>
</div>
</body>
</html>