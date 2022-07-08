<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha256-eZrrJcwDc/3uDhsdt61sL2oOBY362qM3lon1gyExkL0=" crossorigin="anonymous" />
<script src=
"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
    </script>
<title>Gaming Site</title>
</head>
<body>
	<%
		String mygID = request.getParameter("mygID");
		String gID = request.getParameter("gID");
		String gname = request.getParameter("gname");
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		String points = request.getParameter("points");
		String lang = request.getParameter("lang");
	%>
	
	<!-- header -->
	<div class="col-lg-12 p-3 bg-secondary">
		<h1 class="text-center text-white">Gaming Site</h1>
	</div>
	
	<nav class="navbar navbar-expand-lg navbar-light bg-light shadow">
		<div class="container">
			<a href="./my_game" class="nav-link badge-dark"><i class="fa fa-chevron-left" aria-hidden="true"></i> <strong style="font-size:20px;"> My Games</strong></a>
		</div>
	</nav>
	
	<div class="container">
		<div class="container mt-3  d-flex justify-content-center">
			<img src="./img/game.jpg" width= "250" class="rounded mx-auto d-block mb-3">
		</div>
	</div>
	
	<div class="container mt-3  d-flex flex-column">
		<h3 class="text-center">#<%= gID %>  <%= gname %> </h3>
	</div>
	
	<div class="container mt-3">
		
		<form class="border p-5" method="POST" action="editMyGame">
		<input type="hidden" value="<%= mygID %>" name="mygID">
			  <div class="form-group row m-3">
				    <label for="inputEmail3" class="col-sm-4 col-form-label">Game ID</label>
				    <div class="col-sm-8">
				      	<input type="text" class="form-control" name="gameid" placeholder="Game ID" readonly required value="<%= gID %>">
				    </div>
			  </div>
			  <div class="form-group row m-3">
				    <label for="inputEmail3" class="col-sm-4 col-form-label">Game Name </label>
				    <div class="col-sm-8">
				      	<input type="text" class="form-control" name="gamename" placeholder="Game Name" readonly required value="<%= gname %>">
				    </div>
			  </div>
			  <div class="form-group row m-3">
				    <label for="inputPassword3" class="col-sm-4 col-form-label">Username for  enter the game</label>
				    <div class="col-sm-8">
				      	<input type="text" class="form-control" name="username" placeholder="Username" required value="<%= uname %>">
				    </div>
			  </div>
			   <div class="form-group row m-3">
				    <label for="inputPassword3" class="col-sm-4 col-form-label">Password for  enter the game</label>
				    <div class="col-sm-8">
				      	<input type="password" class="form-control" name="password" placeholder="Password" required value="<%= pass %>">
				    </div>
			  </div>
			  <div class="form-group row m-3">
				    <label for="inputPassword3" class="col-sm-4 col-form-label">Game Points (Maximum point 100)</label>
				    <div class="col-sm-8">
				      	<input type="number" class="form-control" id="ponit" name="points" placeholder="Points" max="100" min="<%= points %>" required value="<%= points %>" >
				    </div>
			  </div>
			  <div class="form-group row m-3">
				    <label for="inputPassword3" class="col-sm-4 col-form-label">Game Language</label>
				    <div class="col-sm-8">
				      	<select class="custom-select form-control" name="gamelang" id="gamelang">
							  <option value="English">English</option>
							  <option value="French">French</option>
							  <option value="Chinese">Chinese</option>
						</select>
				    </div>
			  </div>
			  <div class="form-group row m-3 ">
				    <div class="col-sm-12 d-flex justify-content-center">
				      	<button type="submit" class="btn btn-primary">Update</button>
				    </div>
			  </div>
			</form>
	</div>
<script type="text/javascript">
$('#gamelang').val('<%= lang %>').change();


</script>
</body>
</html>