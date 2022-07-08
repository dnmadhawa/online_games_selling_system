<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha256-eZrrJcwDc/3uDhsdt61sL2oOBY362qM3lon1gyExkL0=" crossorigin="anonymous" />
<title>Gaming Site</title>
</head>
<body>
	<%
		String gid = request.getParameter("gid");
		String gname = request.getParameter("gname");
		String cdate = request.getParameter("cdate");
		String genre = request.getParameter("genre");
		String platform = request.getParameter("platform");
		String price = request.getParameter("price");
		String des = request.getParameter("des");
	%>
	<div class="col-lg-12 p-3 bg-secondary">
		<h1 class="text-center text-white">Gaming Site</h1>
	</div>
	
	<nav class="navbar navbar-expand-lg navbar-light bg-light shadow">
		<div class="container">
			<a href="./store" class="nav-link badge-dark"><i class="fa fa-chevron-left" aria-hidden="true"></i> <strong style="font-size:20px;">Store</strong></a>
		</div>
	</nav>
	
	<div class="container">
		<div class="mt-3  d-flex justify-content-center">
			<img src="./img/game.jpg" width= "250" class="rounded mx-auto d-block mb-3">
		</div>
	</div>
	
	<div class="container mt-3  d-flex flex-column">
		<h3 class="text-center">#<%= gid %>  <%= gname %></h3>
		<span class="text-center">(for <%= platform %>) </span>
		<span class="text-center"><%= des %></span>
	</div>
	
	<div class="container mt-3">
		
		<form class="border p-5" method="POST" action="addMyGame">
			  <div class="form-group row m-3">
				    <label for="inputEmail3" class="col-sm-4 col-form-label">Game ID</label>
				    <div class="col-sm-8">
				      	<input type="text" class="form-control" name="gameid" placeholder="Game ID"  value="<%= gid %>" readonly>
				    </div>
			  </div>
			  <div class="form-group row m-3">
				    <label for="inputEmail3" class="col-sm-4 col-form-label">Game Name </label>
				    <div class="col-sm-8">
				      	<input type="text" class="form-control" name="gamename" placeholder="Game Name" value="<%= gname %>" readonly>
				    </div>
			  </div>
			  <div class="form-group row m-3">
				    <label for="inputPassword3" class="col-sm-4 col-form-label">Username for  enter the game</label>
				    <div class="col-sm-8">
				      	<input type="text" class="form-control" name="username" placeholder="Username" required>
				    </div>
			  </div>
			   <div class="form-group row m-3">
				    <label for="inputPassword3" class="col-sm-4 col-form-label">Password for  enter the game</label>
				    <div class="col-sm-8">
				      	<input type="password" class="form-control" name="password" placeholder="Password" required>
				    </div>
			  </div>
			  <div class="form-group row m-3">
				    <label for="inputPassword3" class="col-sm-4 col-form-label">Game Points (maximum point 100)</label>
				    <div class="col-sm-8">
				      	<input type="number" class="form-control" name="points" placeholder="Points" id="points" onkeyup="calc()" required max="100" min="0" value="0">
				    </div>
			  </div>			  
			  <div class="col-sm-12 d-flex  justify-content-center">
				   <p>1 Point = Rs.5.00 </p>
			  </div>
			  <div class="form-group row m-3">
				    <label for="inputPassword3" class="col-sm-4 col-form-label">Game Language</label>
				    <div class="col-sm-8">
				      	<select class="custom-select form-control" name="gamelang">
							  <option value="English">English</option>
							  <option value="French">French</option>
							  <option value="Chinese">Chinese</option>
						</select>
				    </div>
			  </div>
			  <div class="col-sm-12 d-flex  justify-content-center ">
			  	<p>Game Price : Rs.<input type="number" id="price" class="border-0" value="<%= price %>" readonly></p>
			  </div>
			  <div class="col-sm-12 d-flex  justify-content-center ">
			  	<strong>Total : Rs.<input type="number" id="total" class="border-0" value="<%= price %>" readonly></strong>
			  </div>
			  <div class="form-group row m-3 ">			  		
				    <div class="col-sm-12 d-flex justify-content-center">					    	
				      	<button type="submit" class="btn btn-primary">Pay</button>
				    </div>
			  </div>
			</form>
	</div>
<script type="text/javascript">
 
function calc(){
		document.getElementById('total').value = (parseInt(document.getElementById('price').value)+(document.getElementById('points').value *5.0))+".00";
	}
</script>
</body>
</html>