<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert game details</title>
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
input[type=date]{
  width: 200%;
  padding: 15px;
  margin: 2px 0 10px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
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
input[type=date]:focus{
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
	<a href="./games">Games</a>
    <h2>ADD Game Details</h2>
    <form action="insert" method="post">
    <div class="container">
    <table>
    
        <tr>
		<td>Game name</td>
		<td><input type="text" placeholder="Enter Game name" name="Gname"></td>
		</tr>
		<tr>
		<td>DeveloperID</td>
		<td><input type="number" placeholder="Enter Developer id" name="DeveloperID"></td>
		</tr>
		<tr>
		<td>create_date</td>
		<td><input type="date" placeholder="Enter create_date" name="create_date"></td>
		</tr>
		<tr>
		<td>Genre</td>
		<td><input type="text" placeholder="Enter Game type"name="Genre"></td>
		</tr>
		<tr>
		<td>platform</td>
		<td><input type="text" placeholder="Enter plafform" name="platform"></td>
		</tr>
		<tr>
		<td>price</td>
		<td><input type="number" placeholder="Enter price of game" name="price"></td>
		</tr>
		<tr>
		<td>description</td>
		<td><input type="text" placeholder="Description for the game"name="description"></td>
		</tr>
		</table>

		
		<input type="submit" name="submit" value="Create the game">
		</div>
    </form>

</body>
</html>