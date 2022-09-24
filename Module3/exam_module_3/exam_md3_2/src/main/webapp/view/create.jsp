<%--
  Created by IntelliJ IDEA.
  User: tuhungle
  Date: 16/09/2022
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2 style="color: red">Chào mừng,</h2>
<form action="/product?action=create" method="post">
<%--    <p style="color: red">${errors.get('codeStudent')}</p>--%>
    <label>Name product</label>
    <input type="text" name="name"><br>
<%--    <p style="color: red">${errors.get('nameStudent')}</p>--%>
    <label>Price</label>
    <input type="text" name="price"><br>
    <label>Quantity</label>
    <input type="text" name="quantity"><br>
    <label>Color</label>
    <input type="text" name="color"><br>
    <label>Description</label>
    <input type="text" name="description"><br>
    <select name="category">
            <option value="0">Select category</option>
            <option value="1">Television</option>
            <option value="2">Phone</option>
    </select>
    <button type="submit">Create</button>
</form>
</body>
</html>
