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

	<% 
	
	    String announcementID = request.getParameter("announcementID");
	    String announc = request.getParameter("announc");
	    String description = request.getParameter("desp");
	    String section = request.getParameter("sec");
	    String announcementHead = request.getParameter("announHead");
		
	    
	    
	%>
	
	<div align = "center">
	<fieldset>
	
	<form action="updateAnnouncement" method="post">

	Announcement ID <input type="text" name="announcementID" value="<%= announcementID %>" readonly> <br>
	Announcement <input type="text" name="announcement" value="<%= announc %>"> <br>
	Description <input type="text" name="description" value="<%= description %>"> <br>
	Section <input type="text" name="section" value="<%= section %>"> <br>
	announcement Head<input type="text" name="announcementHead" value="<%= announcementHead %>"> <br>
	
	<input type="submit" name="submit" value="Update Announcement">
	
	</form>
	
	</fieldset>
	</div>
	
	
</body>
</html>