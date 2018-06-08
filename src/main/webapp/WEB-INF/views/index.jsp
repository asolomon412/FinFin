<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>
	<h1>Search By Name</h1>

	<form action="search">
		<input type="text" name="person"> 
		<input type="submit" value="Submit">
	</form>
	
		<h1>Search By Favorite Color</h1>

	<form action="colorresults">
		<select name="color">
			<option value="purple">Purple</option>
			<option value="blue">Blue</option>
			<option value="orange">Orange</option>
		</select> 
		
		<input type="submit" value="Submit">
	</form>
</body>
</html>