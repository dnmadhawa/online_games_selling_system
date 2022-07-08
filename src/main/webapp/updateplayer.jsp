<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
body{

  position: absolute;
  left: 500px;
  top: 50px;
  background-color:lightgray;
  
}

input[type=text],input[type=password] {
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
bottom: 270px;

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
String passw = request.getParameter("pass");



%>

<h2>Update My Details</h2>
<hr>
<form action = "update" method = "post">
<table>

<tr>
<td>Player ID</td>
<td><input type = "text" name = "playid" value = "<%= id%>" readonly></td>

</tr>

<tr>
<td>Player Name</td>
<td><input type = "text" name = "playname" value = "<%= nm%>"></td>

</tr>

<tr>
<td>Player Email</td>
<td><input type = "text" name = "playmail" value = "<%= mail%>"></td>

</tr>

<tr>
<td>Player Password</td>
<td><input type = "password" name = "playpass" value = "<%= passw%>"></td>

</tr>

</table>

<br>

<input type = "submit" name = "submit" value = "Update My Details">

</form>

</body>
</html>