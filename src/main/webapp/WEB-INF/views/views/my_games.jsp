<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha256-eZrrJcwDc/3uDhsdt61sL2oOBY362qM3lon1gyExkL0=" crossorigin="anonymous" />
	<title>Gaming Site</title>
</head>
<body>
	
	<!-- header -->
	<div class="col-lg-12 p-3 bg-secondary">
		<h1 class="text-center text-white">Gaming Site</h1>
	</div>
	
	<!-- navbar -->
	<nav class="navbar navbar-expand-lg navbar-light bg-light shadow">
		  <div class="collapse navbar-collapse d-flex justify-content-center" id="navbarNav">
			    <ul class="navbar-nav">
					<li class="nav-item">
				    	<a class="nav-link" href="#">Home</a>
				   	</li>
				   	<li class="nav-item">
				        <a class="nav-link" href="./store">Store</a>
				    </li>
				    <li class="nav-item">
				        <a class="nav-link"  href="./account_player">Account</a>
				    </li>
				    <li class="nav-item">
				        <a class="nav-link active" href="./my_game">My Games</a>
				    </li>
				    <li class="nav-item vr">
				    </li>
				    <li class="nav-item ">						    			    
				    	<a class="nav-link" href="./Logout"> <i class="fa fa-sign-out" aria-hidden="true"></i> Logout</a>
				   	</li>
			    </ul>
		  </div>
	</nav>
	
	<div class="container mt-4">
		<table class="table table-striped table-hover">
			 <thead>
				   <tr style="line-height: 50px;min-height: 25px;height: 25px;">
				     	<th scope="col">#</th>
				      	<th scope="col">Game Name</th>
				      	<th scope="col">Game Username</th>
				      	<th scope="col">Game Password</th>
				      	<th scope="col">Game Points</th>
				      	<th scope="col">Game language</th>
				    </tr>
			  </thead>
			  <tbody>
			  		<% int id = 1; %>
			  	<c:forEach var="mygame" items="${mygamelist}">
			  		<c:set var="mygid" value="${mygame.myg_id}"/>
			  		<c:set var="gid" value="${mygame.game_id}"/>
			  		<c:set var="gname" value="${mygame.game_name}"/>
			  		<c:set var="uname" value="${mygame.game_username}"/>
			  		<c:set var="pass" value="${mygame.game_pass}"/>
			  		<c:set var="points" value="${mygame.game_points}"/>
			  		<c:set var="lang" value="${mygame.language}"/>
				   	<tr class="p-5" style="line-height: 50px;min-height: 25px;height: 25px;">
				      	<td scope="row"><%= id++ %></td>
				      	<td>${mygame.game_name}</td>
				      	<td>${mygame.game_username}</td>
				      	<td>********</td>
				      	<td>${mygame.game_points}</td>
				      	<td>${mygame.language}</td>
				      	
				  	<c:url value="./edit_mygame.jsp" var="editgame">				      
				      	<c:param name="mygID" value="${mygid}"/>
				      	<c:param name="gID" value="${gid}"/>
				      	<c:param name="gname" value="${gname}"/>
				      	<c:param name="uname" value="${uname}"/>
				      	<c:param name="pass" value="${pass}"/>
				      	<c:param name="points" value="${points}"/>
				      	<c:param name="lang" value="${lang}"/>
				   	</c:url>
				   	<c:url value="/delete_mygame" var="deletegame">				      
				      	<c:param name="myID" value="${mygid}"/>
				   	</c:url>
				      	<td><a href="${editgame}"><i class="fa fa-pencil-square-o fa-lg" aria-hidden="true"></i></a></td>
				      	<td><a href="${deletegame}" onclick="return confirm('Are you sure you want to remove this game?');"><i class="fa fa-trash fa-lg" aria-hidden="true"></i></a></td>
				    	<td><a href="#"><i class="fa fa-download fa-lg" aria-hidden="true"></i></a></td>
				    </tr>
				</c:forEach>
			  </tbody>
		</table>
	</div>
	
</body>
</html>