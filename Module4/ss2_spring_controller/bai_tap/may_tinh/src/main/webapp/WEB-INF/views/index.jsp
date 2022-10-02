<%--
  Created by IntelliJ IDEA.
  User: tuhungle
  Date: 02/10/2022
  Time: 18:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="/save" method="post">
    <h1>Calculator</h1>
    <input type="text" name="input1">
    <input type="text" name="input2">
    <br>
    <br>
    <button type="submit" name="button" value="add">Addition</button>
    <button type="submit" name="button" value="sub">Subtraction</button>
    <button type="submit" name="button" value="multi">Multiplication</button>
    <button type="submit" name="button" value="div">Division</button>

    <p>Result : ${result}</p>
</form>
</body>
</html>
