<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	 <form action="logInController" method="post">
	<!--<label for="identificationType">Type of identification</label>
	<input name ="identificationType" type="text"/> -->
	
	<label for="numberIdentificacion">Identification Number</label>
	<input name ="numberIdentificacion" type="text"/>
	
	<label for="username">User or Email</label>
	<input name ="username" type="text"/>
	
	<label for="name">Name</label>
	<input name ="name" type="text"/>
	
	<label for="lastname">Lastname</label>
	<input name ="lastName" type="text"/>
	
	<label for="password">Password</label>
	<input name ="password" type="password"/>
	
	<input name ="action" type="hidden" value="singIn"/>
	<input name ="Enviar" type="submit" value="enviar"/>
	
	
	</form>
	
	<a href="./logIn.jsp"> Do you have already logged in !!</a>

</body>
</html>