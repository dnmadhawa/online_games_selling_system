<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="ISO-8859-1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha256-eZrrJcwDc/3uDhsdt61sL2oOBY362qM3lon1gyExkL0=" crossorigin="anonymous" />
	<title>Gaming Site</title>

<style>
body {
  background-image: url("images/background.jpg");
  }
  
  .center {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 200px;
  border: 3px solid green; 
}
  .button2 {
  background-color: white; 
  color: black; 
  border: 2px solid #008CBA;
}

.button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 16px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  transition-duration: 0.4s;
  cursor: pointer;
}

.button2:hover {
  background-color: #008CBA;
  color: white;
}
}
</style>
<title>home</title>
</head>
<body>
	<div class="col-lg-12 p-3 bg-secondary">
		<h1 class="text-center text-white">Gaming Site</h1>
	</div>
	

	<nav class="navbar navbar-expand-lg navbar-light bg-light shadow">
		  <div class="collapse navbar-collapse d-flex justify-content-center" id="navbarNav">
			    <ul class="navbar-nav">
					<li class="nav-item">
				    	<a class="nav-link active" href="./home">Home</a>
				   	</li>
				   	<li class="nav-item">
				        <a class="nav-link " href="./store">Store</a>
				    </li>
				    <li class="nav-item">
				        <a class="nav-link" href="./account_player">Account</a>
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
	
	<iframe src="homeslideshow.html" style="width:100%;border:2px solid #f1f1f1;height:500px;"></iframe>
	
	
	<h4 style="text-align:center;color:white;">Gaming has been an exciting and addictive way to relax and have fun since forever. It has been an essential part of every culture, and many countries have their national games as well. Gaming enhances not only our physical capabilities but also our mental capabilities since we have to use our imagination and brain to choose every next move. Games are a form of social bonding; our games have evolved with the rest of things as time has passed. The gaming world for humans started with "Knucklebones" and dice games, and now we have reached the era of video games with various types like action games, car games, arcade games, etc. You can get games from CDs, Apple App Stores, or GooglePlay, or you can download them from various websites. In this article, I’ll share with you the best websites to download games on a PC or Mac computer as well as game download sites for Android devices.</h4>
	
	<br>
	<br>
	<h1 style="text-align:center;font-size:50px;color:green;">Special Announcement</h1>
	
	<div class="center">
	<h1 style="text-align:center;color:white;">
	<c:forEach var="announcement" items ="${announcementDetails}">
	
	${announcement.announcement}
	
	
	
	</c:forEach>
	</h1>
	</div>
	<br>
	
	
  

	
	
	
</body>
</html>