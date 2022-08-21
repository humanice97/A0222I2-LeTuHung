<%--
  Created by IntelliJ IDEA.
  User: tuhungle
  Date: 19/08/2022
  Time: 18:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="/discount" method="post">
    <table align="center">
        <tr>
            <td>Product Description</td>
            <td><input type="text" name="description"></td>
        </tr>
        <tr>
            <td>List Price</td>
            <td><input type="text" name="price"></td>
        </tr>
        <tr>
            <td>Discount Percent</td>
            <td><input type="text" name="discount_per"></td>
        </tr>
        <tr>
            <td><button type="submit">Calculator</button></td>
        </tr>
    </table>
</form>
</body>
</html>
