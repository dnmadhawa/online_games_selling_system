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
	
	<form action="insertAnnouncement" method="post">
	
	Announcement <input type="text" name="announcement"> <br>
	Description <input type="text" name="description"> <br>
	Section <input type="text" name="section"> <br>
	announcement Head <input type="text" name="announcementHead"> <br>
	
	<input type="submit" name="submit" value ="create Announcement">
	
	</form>
	
	</fieldset>
	
	</div>
	
</body>
</html>