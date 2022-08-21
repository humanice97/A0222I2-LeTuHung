<%--
  Created by IntelliJ IDEA.
  User: tuhungle
  Date: 19/08/2022
  Time: 18:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>
<table class="table table-striped">
    <tr>
        <th>ID</th>
        <th>Ten</th>
        <th>Ngay Sinh</th>
        <th>Dia chi</th>
        <th>Anh</th>
    </tr>
    <c:forEach items="${listCustomer}" var="o">
        <tr>
            <td>${o.id}</td>
            <td>${o.name}</td>
            <td>${o.birthday}</td>
            <td>${o.address}</td>
            <td><img src="${o.image}" alt="c" width="70px"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
