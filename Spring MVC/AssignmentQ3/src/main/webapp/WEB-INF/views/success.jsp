<%--
  Created by IntelliJ IDEA.
  User: 07ayu
  Date: 09-02-2022
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Success Page</title>
</head>
<body>
    <h1 color="green">Welcome ${user.username}</h1>
    <hr>
    <h1 color="green">Email Id is: ${user.email}</h1>
    <hr>
    <h1 color="green">Password is: ${user.password}</h1>
</body>
</html>
