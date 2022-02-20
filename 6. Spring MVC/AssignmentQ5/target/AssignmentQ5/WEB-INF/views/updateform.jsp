<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="org.example.entity.Employee" %><%--
  Created by IntelliJ IDEA.
  User: 07ayu
  Date: 10-02-2022
  Time: 23:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Employee Updated</title>
</head>
<body>
    <h1>Employee Updated Successfully</h1>
    <hr>
    <h1>***************Updated Employee***************</h1>
    <h3>Employee id = ${Employee.id}</h3>
    <h3>Employee Name = ${Employee.name}</h3>
    <h3>Employee Department = ${Employee.department}</h3>
    <h3>Employee Designation = ${Employee.designation}</h3>
    <h3>Employee Salary = ${Employee.salary}</h3>
</body>
</html>
