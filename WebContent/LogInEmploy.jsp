<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="LogInController" method="post">
	<label for="username">UserName or Email</label>
	<input name ="username" type="text"/>
	
	<label for="password">Password</label>
	<input name ="password" type="text"/>
	
	<input name ="action" type="hidden" value="logInEmploy"/>
	
	</form>

</body>
</html>