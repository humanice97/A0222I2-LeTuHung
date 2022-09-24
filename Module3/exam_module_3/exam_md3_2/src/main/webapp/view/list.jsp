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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
    <%--    jquery--%>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body style="margin: 2em">
<div style="text-align: center;">
    <h1>Product Management</h1>
    <h2>
        <caption><h2>List of Product</h2></caption>
    </h2>
</div>
<div>
    <div class="d-flex justify-content-between">
        <!-- Button trigger modal -->
        <a href="../view/create.jsp">Create</a>
                <form action="/?action=search" method="post">
                    <div class="d-flex flex-row">
                        <input class="form-control" style="width: 20em; margin-right: 1em" name="nameSearch"
                               value="" type="search" placeholder="Search"
                               aria-label="Search">
                        <button class="btn btn-outline-success" type="submit">Search</button>
                    </div>
                </form>
    </div>
</div>
<div align="center">
    <table id="jqueryTable" class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Color</th>
            <th>Category</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="p" items="${productDTOList}">
            <tr>
                <td>${p.id}</td>
                <td>${p.name}</td>
                <td>${p.price}</td>
                <td>${p.quantity}</td>
                <td>${p.color}</td>
                <td>${p.category_name}</td>
                <td>
                    <!-- Button trigger modal delete -->
                    <button type="button" class="btn btn-primary btnInfo" data-id="${p.id}"
                            data-name="${p.name}"
                            data-bs-toggle="modal"
                            data-bs-target="#exampleModalDelete">
                        Delete
                    </button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>


</body>
</html>
