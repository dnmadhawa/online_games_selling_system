<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
       
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>game account</title>

   <style>
table {
  border-collapse: collapse;
  width: 100%;
}

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
  background-color: #04AA6D;
  color: white;
}
</style>
   
</head>
<body>

 <table>
 <tr>
 <th>Game ID</th>
 <th>Game name</th>
 <th>Developer ID</th>
 <th>create_date</th>
 <th>Genre</th>
 <th>platform</th>
 <th>price</th>
 <th>description</th>
 <tr>
 
   <c:forEach var="ga" items="${gamedet}">
	
	<tr>
		<td>${ga.gameID}</td>
		<td>${ga.gname}</td>
		<td>${ga.developerID}</td>
		<td>${ga.create_date}</td>
		<td>${ga.genre}</td>
		<td>${ga.platform}</td>
		<td>${ga.price}</td>
		<td>${ga.description}</td>
		<c:url value="Updategame.jsp" var="gaupdate">
		<c:param name="GameID" value="${ga.gameID}"/>
		<c:param name="Gname" value="${ga.gname}"/>
		<c:param name="DeveloperID" value="${ga.developerID}"/>
		<c:param name="create_date" value="${ga.create_date}"/>
		<c:param name="Genre" value="${ga.genre}"/>
		<c:param name="platform" value="${ga.platform}"/>
		<c:param name="price" value="${ga.price}"/>
		<c:param name="description" value="${ga.description }"/>
	</c:url>
	
	<td><a href="${gaupdate}">update</a></td>
	<c:url value="Deletegame.jsp" var="gadelete">
		<c:param name="GameID" value="${ga.gameID}"/>
		<c:param name="Gname" value="${ga.gname}"/>
		<c:param name="DeveloperID" value="${ga.developerID}"/>
		<c:param name="create_date" value="${ga.create_date}"/>
		<c:param name="Genre" value="${ga.genre}"/>
		<c:param name="platform" value="${ga.platform}"/>
		<c:param name="price" value="${ga.price}"/>
		<c:param name="description" value="${ga.description }"/>
	</c:url>
	
	<td><a href="${gadelete}">Delete</a></td>
	</tr>

	</c:forEach>
	</table>
	
	
</body>
</html>