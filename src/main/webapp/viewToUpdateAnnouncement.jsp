<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
		body{
			font-family: Hind SemiBold;
			background-color:#C0C0C0 ;
		}
	
		table, th, td {
  			border: 1px solid black;
  			font-size: 30px;
		}
		
		
				.button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
  -webkit-transition-duration: 0.4s; /* Safari */
  transition-duration: 0.4s;
}
	
	.button2:hover {
  box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19);
}	
		.center {
  text-align: center;
  border: 3px solid green;
}
		
		
	</style>
</head>
<body>
	<c:forEach var="announcement" items ="${announcementDetails}">
	
	<c:set var="announcementID" value="${announcement.announcementID }"/>
	<c:set var="announc" value="${announcement.announcement}"/>
	
	
	
	
	
	
	
	</c:forEach>
	
	
	
	
	
	<table>
	<c:forEach var="announcement" items="${announcementDetails}">
	
	
	
		<c:set var="desp" value="${announcement.description}"/>
	
		
		<c:set var="sec" value="${announcement.section }"/>
	
		<c:set var="announHead" value="${announcement.announcementHead }"/>
	
	
	</c:forEach>
	</table>
	
	
	
	
	<div align= "center">
	
	
	<table>
	<c:forEach var="announcement" items="${announcementDetails}">
	
	
	
	<tr>
		<td>Announcement ID</td>
		<td>${announcement.announcementID}</td>
	</tr>
	<tr>
		<td>Announcement</td>
		<td>${announcement.announcement}</td>
	</tr>
	<tr>
		<td>Description</td>
		<td>${announcement.description}</td>
	</tr>
	<tr>
		<td>Section</td>
		<td>${announcement.section}</td>
	</tr>
	<tr>
		<td>Announcement Head</td>
		<td>${announcement.announcementHead}</td>
	</tr>
	
	</c:forEach>
	</table>
	
	
	</div>
	
	<c:url value="updateAnnouncement.jsp" var="announcementUpdate" >
		<c:param name="announcementID" value="${announcementID}"/>
		<c:param name="announc" value="${announc}"/>
		<c:param name="desp" value="${desp}"/>
		<c:param name="sec" value="${sec}"/>
		<c:param name="announHead" value="${announHead}"/>
		
	</c:url>
	
	<br>
	
	<div class="center">
	
	<div class="button button2" align="center">
	
	<a href="${announcementUpdate}">
	<input type="button" name="update" value="Update Data ">
	</a>
	
	</div>
	</div>
	<br>
	<br>
	
	
	
</body>
</html>