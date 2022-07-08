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
				    	<a class="nav-link" href="./home">Home</a>
				   	</li>
				   	<li class="nav-item">
				        <a class="nav-link active" href="./store">Store</a>
				    </li>
				    <li class="nav-item">
				        <a class="nav-link"  href="./account_player">Account</a>
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
	
	<div class="container mt-5 d-flex flex-wrap">
		<c:forEach var="game" items="${gamelist}">
			<c:set var="gid" value="${game.gameID}"/>	
			<c:set var="gname" value="${game.gname}"/>			
			<c:set var="cdate" value="${game.create_date}"/>
			<c:set var="genre" value="${game.genre}"/>
			<c:set var="platform" value="${game.platform}"/>
			<c:set var="price" value="${game.price}"/>
			<c:set var="des" value="${game.description}"/>
			
			
			<c:url value="./view_game.jsp" var="showgame">				      
		      	<c:param name="gid" value="${gid}"/>
		      	<c:param name="gname" value="${gname}"/>
		      	<c:param name="cdate" value="${cdate}"/>
		      	<c:param name="genre" value="${genre}"/>
		      	<c:param name="platform" value="${platform}"/>
		      	<c:param name="price" value="${price}"/>
		      	<c:param name="des" value="${des}"/>
		   	</c:url>
			
			<div class="card m-4 shadow-lg  bg-white rounded " style=" width: 28%;">
			  	<img class="card-img-top" height="250px;" src="./img/game.jpg" alt="Card image cap">
			  	<div class="card-body p-4">
			    	<h5 class="card-title">#${gid} ${gname}</h5>
			    	<p>(for ${platform}) - ${genre} </p>
			    	<hr>
			    	<p class="card-text">${des}</p>
			    	<a href="${showgame}" class="btn btn-primary">Rs.${price}</a>
			  	</div>
			</div>
			
		</c:forEach>
	</div>
</body>
</html>