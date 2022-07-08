<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<style>

body {
  background-color:white;
  
}
fieldset {
	border:1px red;
	border-radius:8px;
	box-shadow:0 0 10px red;
	width:500px;
	height:300px;
	background-color:lightgray;
}

</style>


</head>
<body>


	<div align = "center">
	<fieldset>
	
	<form action="viewAnnouncementToUpdate" method="post">
	
	Enter Announcement ID To View Details <input type="text" name="announcementID"> <br>
	 
	 
	
	<input type="submit" name="submit" value="View Announcement Details">
	
	</form>
	
	</fieldset>
	</div>
</body>
</html>