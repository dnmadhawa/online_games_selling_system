<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<style>

body {
  background-color:;
  }
  .center1 {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 200px;
  border: 3px solid #4CAF50; 
}
  .center2 {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 200px;
  border: 3px solid #008CBA; 
}

  .center3 {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 200px;
  border: 3px solid #f44336; 
}

  .center4 {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 200px;
  border: 3px solid #e7e7e7; 
}


.container { 
  height: 200px;
  position: relative;
  border: 3px solid green; 
}

.center {
  margin: 0;
  position: absolute;
  top: 50%;
  left: 50%;
  -ms-transform: translate(-50%, -50%);
  transform: translate(-50%, -50%);
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

.button1 {
  background-color: white; 
  color: black; 
  border: 2px solid #4CAF50;
}

.button1:hover {
  background-color: #4CAF50;
  color: white;
}

.button2 {
  background-color: white; 
  color: black; 
  border: 2px solid #008CBA;
}

.button2:hover {
  background-color: #008CBA;
  color: white;
}

.button3 {
  background-color: white; 
  color: black; 
  border: 2px solid #f44336;
}

.button3:hover {
  background-color: #f44336;
  color: white;
}

.button4 {
  background-color: white;
  color: black;
  border: 2px solid #e7e7e7;
}

.button4:hover {background-color: #e7e7e7;}

.button5 {
  background-color: white;
  color: black;
  border: 2px solid #555555;
}

.button5:hover {
  background-color: #555555;
  color: white;
}


.buttonShadow {
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

.button6:hover {
  box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19);
}
</style>

<title>Edit announcement page</title>
</head>
<body>
	
	<br>
	
	
	
	<form action="displayAll" method="post">
	
	<input class="buttonShadow button6" type="submit" name="submit" value="Display all anouncementIDs with announcement heads">
	</form>
	
	
	<br>
	<br>
	
		
	<h1 style="text-align:center;color:black;">
	${displayString}
	</h1>
	
	
	<br>
	<br>
	<br>
	
	<div class="container">
  <div class="center1">
    <button class="button button1" onclick="document.location='InsertAnnouncement.jsp'">Insert New Announcement</button>
  </div>
    </div>
	
	<br>
	<br>
	
		<div class="container">
  <div class="center2">
    <button class="button button2" onclick="document.location='retrieveAnnouncement.jsp'">Publish Announcement</button>
  </div>
    </div>
	<br>
	<br>
			<div class="container">
  <div class="center3">
    <button class="button button3" onclick="document.location='updateIdForm.jsp'">Update Announcement</button>
  </div>
    </div>
	<br>
	<br>
				<div class="container">
  <div class="center4">
    <button class="button button4" onclick="document.location='DeleteIdForm.jsp'">Delete Announcement</button>
  </div>
    </div>
	
	<br>
	
	<form action="homeWithDefultAnnouncement" method="post">
	
	<input class="buttonShadow button6" type="submit" name="submit" value="Home">
	</form>
	
</body>
</html>