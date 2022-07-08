<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
       
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>game account</title>

   <style type="text/css">
		body{
			font-family: Hind SemiBold;
		}
	
		table, th, td {
  			border: 1px solid black;
		}
	</style>
   
</head>
<body>

 <table>
   <c:forEach var="ga" items="${gaDetails}">
	
	
	<c:set var="GameID" value="${ga.GameID}"/>
	<c:set var="Gname" value="${ga.Gname}"/>
	<c:set var="DeveloperID" value="${ga.DeveloperID}"/>
	<c:set var="create_date" value="${ga.create_date}"/>
	<c:set var="Genre" value="${ga.Genre}"/>
	<c:set var="platform" value="${ga.platform}"/>
	<c:set var="price" value="${ga.price}"/>
	<c:set var="description" value="${ga.description}"/>
	<tr>
		<td>Game ID</td>
		<td>${ga.GameID}</td>
	</tr>
	<tr>
		<td>Game name</td>
		<td>${ga.Gname}</td>
	</tr>
	<tr>
		<td>Developer ID</td>
		<td>${ga.DeveloperID}</td>
	</tr>
	<tr>
		<td>create-date</td>
		<td>${ga.create_date}</td>
	</tr>
	<tr>
		<td>Genre</td>
		<td>${ga.Genre}</td>
	</tr>
	<tr>
		<td>platform</td>
		<td>${ga.platform}</td>
	</tr>
	<tr>
		<td>price</td>
		<td>${ga.price}</td>
	</tr>
	<tr>
		<td>description</td>
		<td>${ga.description}</td>
	</tr>

	</c:forEach>
	</table>
	
	<c:url value="Updategame.jsp" var="gaupdate">
		<c:param name="GameID" value="${GameID}"/>
		<c:param name="Gname" value="${Gname}"/>
		<c:param name="DeveloperID" value="${DeveloperID}"/>
		<c:param name="create_date" value="${create_date}"/>
		<c:param name="Genre" value="${Genre}"/>
		<c:param name="platform" value="${platform}"/>
		<c:param name="price" value="${price}"/>
		<c:param name="description" value="${description }"/>
	</c:url>
	
	<a href="${gaupdate}">
	<input type="button" name="update" value="Update game">
	</a>
	<br>
	<br>
	<c:url value="Deletegame.jsp" var="gadelete">
		<c:param name="GameID" value="${GameID}"/>
		<c:param name="Gname" value="${Gname}"/>
		<c:param name="DeveloperID" value="${DeveloperID}"/>
		<c:param name="create_date" value="${create_date}"/>
		<c:param name="Genre" value="${Genre}"/>
		<c:param name="platform" value="${platform}"/>
		<c:param name="price" value="${price}"/>
		<c:param name="description" value="${description }"/>
	</c:url>
	
	<a href="${gadelete}">
    <input type="button" name="delete" value="Delete data">
    </a>
</body>
</html>