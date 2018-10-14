<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>

		<h1>Register Here</h1>
		
	  <form action="RegistrationController" method="POST">
      User Name : <p><input type="text" name="username" style="width: 100px;" ></p>
      Password : <p><input type="password" name="password" style="width: 100px;"></p>
      <p><input type="submit" value="Register"></p>
    </form>
</body>
</html>