<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simple Interest</title>
</head>
<style>
	* {
		margin: 0;
		padding: 0;
		box-sizing: border-box;
		font-family: "Poppins", sans-serif;
	}
	body {
		display: flex;
		height: 100vh;
		justify-content: center;
		align-items: center;
		background: linear-gradient(135deg, #ec3a3a, #f0740e);
	}
	.container {
		max-width: 700px;
		width: 100%;
		background: #fff;
		padding: 25px 30px;
		border-radius: 5px;
	}
</style>
<body>
	<div class="container">
		<h1>Simple interest is: ${simpleinterest}</h1>
	</div>

</body>
</html>