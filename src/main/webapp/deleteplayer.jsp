<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete player</title>
<!-- CSS only -->

<style>
body{

  position: absolute;
  left: 500px;
  top: 50px;
  background-color:lightgray;
  
}

input[type=text] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 20px;
  
}

 input[type=submit] {
  background-color: black;
  border: none;
  color: white;
  padding: 16px 32px;
  text-decoration: none;
  margin: 4px 2px;
  cursor: pointer;
  position: absolute;
  left: 90px;
  
}
h2{
position: absolute;
left: 90px;
bottom: 200px;

}
hr{

  border-top: 2px solid black;

}





</style>
</head>
<body>
<%
String id = request.getParameter("id");
String nm = request.getParameter("name");
String mail = request.getParameter("email");
String passw = request.getParameter("password");



%>
<h2>Delete My Account</h2>
<hr>
<form action = "delete" method = "post">
<table>

<tr>
<td>Player ID</td>
<td><input type = "text" name = "playid" value = "<%= id%>" readonly></td>

</tr>

<tr>
<td>Player Name</td>
<td><input type = "text" name = "playname" value = "<%= nm%>"readonly></td>

</tr>

<tr>
<td>Player Email</td>
<td><input type = "text" name = "playmail" value = "<%= mail%>" readonly></td>

</tr>


</table>

<br>

<input type = "submit" name = "submit" value = "Delete My Details">

</form>



</body>
</html>