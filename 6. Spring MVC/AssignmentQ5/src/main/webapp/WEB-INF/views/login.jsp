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
    <title>Registration Successful</title>
</head>
<style>
    @import url('https://fonts.googleapis.com/css?family=Montserrat|Open+Sans|Roboto');
    *{
        margin:0;
        padding: 0;
        outline: 0;
    }
    .filter{
        position: absolute;
        left: 0;
        top: 0;
        bottom: 0;
        right: 0;
        z-index: 1;
        background: rgb(233,76,161);
        background: -moz-linear-gradient(90deg, rgba(233,76,161,1) 0%, rgba(199,74,233,1) 100%);
        background: -webkit-linear-gradient(90deg, rgba(233,76,161,1) 0%, rgba(199,74,233,1) 100%);
        background: linear-gradient(90deg, rgba(233,76,161,1) 0%, rgba(199,74,233,1) 100%);
        filter: progid:DXImageTransform.Microsoft.gradient(startColorstr="#e94ca1",endColorstr="#c74ae9",GradientType=1);
        opacity: .7;
    }
    table{
        position: absolute;
        z-index: 2;
        left: 50%;
        top: 50%;
        transform: translate(-50%,-50%);
        width: 60%;
        border-collapse: collapse;
        border-spacing: 0;
        box-shadow: 0 2px 15px rgba(64,64,64,.7);
        border-radius: 12px 12px 0 0;
        overflow: hidden;

    }
    td , th{
        padding: 15px 20px;
        text-align: center;


    }
    th{
        background-color: #ba68c8;
        color: #fafafa;
        font-family: 'Open Sans',Sans-serif;
        font-weight: 200;
        text-transform: uppercase;

    }
    tr{
        width: 100%;
        background-color: #fafafa;
        font-family: 'Montserrat', sans-serif;
    }
    tr:nth-child(even){
        background-color: #eeeeee;
    }
</style>
<body>
  <div class="filter">

  </div>
    <table>
        <tr>
            <th>Id</th>
            <th>Employee Name</th>
            <th>Employee Department</th>
            <th>Employee Designation</th>
            <th>Employee Salary</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        <c:forEach var="listValue" items="${Employeelist}">
            <tr>
                <td>${listValue.id}</td>
                <td>${listValue.name}</td>
                <td>${listValue.department}</td>
                <td>${listValue.designation}</td>
                <td>${listValue.salary}</td>
                <td><a href="update/${listValue.id}">Update</a></td>
                <td><a href="${listValue.id}">Delete</a></td>

            </tr>
        </c:forEach>

    </table>

</body>
</html>
