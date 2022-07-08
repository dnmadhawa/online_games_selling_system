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

<script type="text/javascript">
function validateAdmin(){
	
	var userName = document.getElementById("userName").value;
	var password = document.getElementById("pass").value;
	
	if(userName=="")
	{
		document.getElementById("userNameError").innerHTML = "please enter UserName.";
		return false;
	}
	else
	{
		document.getElementById("userNameError").innerHTML = "";
	}
	
	if(password=="")
	{
		document.getElementById("passError").innerHTML = "Please enter password.";
		return false;
	}
	else
	{
		document.getElementById("passError").innerHTML = "";
	}
	if(password.length<3 || password.length>6)
	{
		document.getElementById("passError").innerHTML = "Password should be in between 3 to 6 characters.";
		return false;
	}
	else
	{
		document.getElementById("passError").innerHTML = "";
	}
	
	
	return true;
}


</script>




</head>
<body>


<div align = "center">

<fieldset>

	<legend><h1>Login</h1></legend>
	
<form onsubmit = "return validateAdmin()" action ="adminIndex" method ="post">
     <table>
    
         <tr>
              <td>UserName :</td>
              <td><input type = "text" id = "userName" name = "userName"></td>
              <td><span style ="color:red" id= "userNameError">*</span></td>
         </tr>
         <tr>
              <td>Password :</td>
              <td><input type = "password" id ="pass" name = "password"></td>
              <td><span style ="color:red" id = "passError">*</span></td>
              
         </tr>
         
          <tr>
          <td><br><input type ="submit" value ="login"></td>
          </tr>
         
              
     </table>




</form>

</fieldset>
</div>

</body>
</html>