<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
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

<script type="text/javascript">
function validate(){
	
	var email = document.getElementById("email").value;
	var password = document.getElementById("pass").value;
	
	if(email=="")
	{
		document.getElementById("emailerror").innerHTML = "please enter email.";
		return false;
	}
	else
	{
		document.getElementById("emailerror").innerHTML = "";
	}
	
	if(password=="")
	{
		document.getElementById("passerror").innerHTML = "Please enter password.";
		return false;
	}
	else
	{
		document.getElementById("passerror").innerHTML = "";
	}
	if(password.length<5 || password.length>8)
	{
		document.getElementById("passerror").innerHTML = "Password should be in between 5 to 8 characters.";
		return false;
	}
	else
	{
		document.getElementById("passerror").innerHTML = "";
	}
	
	
	return true;
}


</script>
</head>
<body>
<div align = "center">
<fieldset>



<legend><h1>Login</h1></legend>
<form onsubmit = "return validate() " action ="log" method ="POST">
     <table>
    
         <tr>
              <td>Email :</td>
              <td><input type = "email" id = "email"name = "email"></td>
              <td><span style ="color:red" id= "emailerror">*</span></td>
         </tr>
         <tr>
              <td>Password :</td>
              <td><input type = "password" id ="pass" name = "pass"></td>
              <td><span style ="color:red" id = "passerror">*</span></td>
              
         </tr>
         
          <tr>
          <td><br><input type ="submit" value ="login"></td>
          </tr>
         
              
     </table>




</form>
<br>
<hr>

Are you new user?<a href= "Signup.jsp">Sign up</a>
</fieldset>
</div>

</body>
</html>