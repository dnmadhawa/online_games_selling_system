<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha256-eZrrJcwDc/3uDhsdt61sL2oOBY362qM3lon1gyExkL0=" crossorigin="anonymous" />
<title>Gaming Site</title>
<style>

input[type=button] {
  background-color: black;
  border: none;
  color: white;
  padding: 16px 32px;
  text-decoration: none;
  margin: 4px 2px;
  cursor: pointer;
  
  
  
}




</style>
</head>
<body>
	
	
	<div class="col-lg-12 p-3 bg-secondary">
		<h1 class="text-center text-white">Gaming Site</h1>
	</div>
	

	<nav class="navbar navbar-expand-lg navbar-light bg-light shadow">
		  <div class="collapse navbar-collapse d-flex justify-content-center" id="navbarNav">
			    <ul class="navbar-nav">
					<li class="nav-item">
				    	<a class="nav-link" href="home">Home</a>
				   	</li>
				   	<li class="nav-item">
				        <a class="nav-link" href="./store">Store</a>
				    </li>
				    <li class="nav-item">
				        <a class="nav-link active" href="./account_player">Account</a>
				    </li>
				    <li class="nav-item">
				        <a class="nav-link " href="./my_game">My Games</a>
				    </li>
				    <li class="nav-item vr">
				    </li>
				    <li class="nav-item ">						    			    
				    	<a class="nav-link" href="./Logout"> <i class="fa fa-sign-out" aria-hidden="true"></i> Logout</a>
				   	</li>
			    </ul>
		  </div>
	</nav>
<div class="container">
<table class="table table-bordered mt-4">
  <c:forEach var = "play" items= "${playerdetails}">
  
  <c:set var = "id" value = "${play.id }"/>
  <c:set var = "name" value = "${play.name }"/>
  <c:set var = "email" value = "${play.email }"/>
  <c:set var = "password" value = "${play.password }"/>
  
  
  <tr>
  <th>Player ID</th>
  <td>${play.id}</td>
  
  </tr>
  
  <tr>
  <th>Player Name</th>
  <td>${play.name}</td>
  
  </tr>
  
  <tr>
  <th>Player Email</th>
  <td>${play.email}</td>
  
  </tr>
  
  <tr>
  <th>Player Password</th>
  <td>${play.password}</td>
  
  </tr>
  
  </c:forEach>
  
  </table>
  
  
  <c:url value = "updateplayer.jsp" var = "playerupdate">
  
  <c:param name="id" value = "${id }"/>
  <c:param name="name" value = "${name}"/>
  <c:param name="email" value = "${email}"/>
  <c:param name="pass" value = "${password}"/>
  
  
  </c:url> 
  <a href = "${playerupdate}">
  
  <center><input type = "button" name= "update" value ="Update My data"></center>
  </a>
  <br>
  
  <c:url value ="deleteplayer.jsp" var = "playdelete">
  
  <c:param name="id" value = "${id }"/>
  <c:param name="name" value = "${name}"/>
  <c:param name="email" value = "${email}"/>
  <c:param name="pass" value = "${password}"/>
  
  
  
  </c:url>
  <a href = "${playdelete}">
  <center><input type = "button" name = "delete" value = "Delet My Account"></center>
  </a>
  </div>
</body>
</html>