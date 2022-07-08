<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>


body {
	background-color: #C0C0C0;

}


table, th, td {
  border: 1px solid black;
}


.center {
border: 5px solid #FFFF00;
display: flex;
justify-content: center;
font-size: 40px;
}


.center1 {
border: 0px solid #FFFF00;
display: flex;
justify-content: center;
}

.button {
  display: inline-block;
  padding: 15px 25px;
  font-size: 24px;
  cursor: pointer;
  text-align: center;
  text-decoration: none;
  outline: none;
  color: #fff;
  background-color: #4CAF50;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
  
}

.button:hover {background-color: #3e8e41}

.button:active {
  background-color: #3e8e41;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}

</style>
</head>
<body>

	<h1>Admin Account</h1>

	<div class = "center">
	
	<table>
	<c:forEach var="admin" items="${adminDetails}">
	
	<c:set var="id" value="${admin.adminID}"/>
	<c:set var="name" value="${admin.name}"/>
	<c:set var="phone" value="${admin.phone}"/>
	<c:set var="userName" value="${admin.userName}"/>
	<c:set var="password" value="${admin.password}"/>
	
	
	<tr>
		<td>admin ID</td>
		<td>${admin.adminID}</td>
	</tr>
	<br>
	<tr>
		<td>admin Name</td>
		<td>${admin.name }</td>
	</tr>
	<br>
	<tr>
		<td>admin phone</td>
		<td>${admin.phone }</td>
	</tr>
	<br>
	<tr>
		<td>admin user name</td>
		<td>${admin.userName}</td>
	</tr>
	<br>
	<tr>
		<td>admin password</td>
		<td>${admin.password}</td>
	</tr>

	</c:forEach>
	</table>
	
	</div>
	
	
	
	<div class = "center1" >
	<div class ="button">
	<!--- button for display home with auto displyed announcement --->
	
	<form action="homeWithDefultAnnouncement" method="post">
	
	<input type="submit" name="submit" value="Home">
	</form>
	</div>
	</div>
	
</body>
</html>