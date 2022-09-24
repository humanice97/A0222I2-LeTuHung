<%--
  Created by IntelliJ IDEA.
  User: tuhungle
  Date: 23/09/2022
  Time: 17:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Change money</h1>
<form action="" method="post">
    <input type="text" name="input">

    <select name="select1" id="select1">
        <option value="a">USD</option>
        <option value="b">VND</option>
    </select>
    <select name="select2" id="select2">
        <option value="a">USD</option>
        <option value="b">VND</option>
    </select>
    <button type="submit">Convert</button>
    <p>result: ${result} ${vnd}${usd}</p>
</form>
</body>
</html>
