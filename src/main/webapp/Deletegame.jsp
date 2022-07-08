<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>delete game</title>
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: #3cb371;
}

* {
  box-sizing: border-box;
}

/* Add padding to containers */
.container {
  padding: 60px;
  background-color:#d0f0c0;
}

/* Full-width input fields */
input[type=text]{
  width: 200%;
  padding: 15px;
  margin: 2px 0 10px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}
input[type=number]{
  width: 200%;
  padding: 15px;
  margin: 2px 0 10px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}
input[type=submit]{
  width:30%;
  padding: 15px;
  margin: 8px 0 22px 0;
  display: inline-block;
  border: none;
  background: #00a86b;
  font-family:font-family: "Times New Roman", Times, serif; 
  font-size:15px;
}

input[type=text]:focus{
  background-color: #ddd;
  outline: none;
}
input[type=number]:focus{
  background-color: #ddd;
  outline: none;
}
input[type=submit]:focus{
  background-color: #ddd;
  outline: none;
}


/* Set a style for the submit button */
.submit{
  background-color: #04AA6D;
  color: #8fbc8f;
  padding: 15px 22px;
  margin: 8px 0px;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

</style>
</head>
<body>
  
 <% 
        String GameID = request.getParameter("GameID");	
		String Gname = request.getParameter("Gname");
		String DeveloperID = request.getParameter("DeveloperID");
		String create_date = request.getParameter("create_date");
		String Genre = request.getParameter("Genre");
		String platform = request.getParameter("platform");
		String price = request.getParameter("price");
		String description = request.getParameter("description");
%>
    
	<a href="./games">Games</a>
	<h2>Game Details Delete</h2>
	
	<form action="ddelete" method="post">
	<div class="container">
	<table>
	<tr>
		<td>GameID </td>
		<td><input type="text" name="Gid" value="<%= GameID %>"></td>
        </tr>
        <tr>
		<td>Game name</td>
		<td><input type="text" name="name" value="<%= Gname %>"></td>
	    </tr>
	    <tr>
		<td>DeveloperID</td>
		<td><input type="number" name="Did" value="<%= DeveloperID %>"></td>
		</tr>
		<tr>
		<td>create_date</td>
		<td><input type="text" name="date" value="<%= create_date %>"></td>
		</tr>
		<tr>
		<td>Genre</td>
		<td><input type="text" name="genre" value="<%= Genre %>"></td>
		</tr>
		<tr>
		<td>platform</td>
		<td><input type="text" name="platform" value="<%= platform %>"></td>
		</tr>
		<tr>
		<td>price</td>
		<td><input type="number" name="price" value="<%= price %>"></td>
		</tr>
		<tr>
		<td>description</td>
		<td><input type="text" name="description" value="<%= description %>"></td>
		</tr>
        </table>
        <br>
		
		<input type="submit" name="submit" value="Delete game data">
		</div>
	</form>   
    

</body>
</html>