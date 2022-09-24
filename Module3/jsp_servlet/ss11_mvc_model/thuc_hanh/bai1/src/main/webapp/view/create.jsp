<%--
  Created by IntelliJ IDEA.
  User: tuhungle
  Date: 21/08/2022
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create new Customer</h1>
<p><a href="/customer">Back to customer list</a></p>
<p>
    <c:if test="${message !=null}">
        <span style="color: red">${message}</span>
    </c:if>
</p>
<form method="post">
    <table>
        <tr>
            <td>Name:</td>
            <td><input type="text" name="name" id="name"></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><input type="text" name="email" id="email"></td>
        </tr>
        <tr>
            <td>Address:</td>
            <td><input type="text" name="address" id="address"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Create customer"></td>
        </tr>
    </table>
</form>
</body>
</html>
