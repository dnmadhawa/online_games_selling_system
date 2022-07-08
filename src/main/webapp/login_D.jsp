<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login to the system</title>

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
  width: 40%;
  padding: 15px;
  margin: 2px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}
input[type=password]{
  width: 40%;
  padding: 15px;
  margin: 2px 0 22px 0;
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
  box-shadow: 0 9px #999;
}


input[type=text]:focus{
  background-color: #ddd;
  outline: none;
}
input[type=password]:focus{
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
  color: #d0f0c0;
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

<h1>Login Page</h1>
	<form action="login" method="post">
		User Name <input type="text" name="Dusername" placeholder="Enter your username"><br>
		Password <input type="password" name="password" placeholder="Enter your password"><br>
		<input type="submit" name="submit" value="Login">
	</form>   

</body>
</html>