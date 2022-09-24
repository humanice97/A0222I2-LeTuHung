<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tuhungle
  Date: 21/08/2022
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
            crossorigin="anonymous"></script>
</head>
<body>
<a href="/customer?action=create">Add Customer</a>
<table class="table table-striped">
    <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>EMAIL</th>
        <th>ADDRESS</th>
        <th>UPDATE</th>
        <th>DELETE</th>
    </tr>
    <c:forEach items="${customer}" var="o">
        <tr>
            <td>${o.getId()}</td>
            <td>${o.getName()}</td>
            <td>${o.getEmail()}</td>
            <td>${o.getAddress()}</td>
            <td>
                <button class="btn btn-outline-primary" data-bs-toggle="modal"
                        data-bs-target="#exampleModalUpdate${o.getId()}">
                    Update
                </button>

                <div class="modal fade" id="exampleModalUpdate${o.getId()}" tabindex="-1"
                     aria-labelledby="exampleModalLabelUpdate"
                     aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="exampleModalLabelUpdate">Do you want to update this
                                    customer</h5>
                                <button type="button" class="btn-close" data-bs-dismiss="modal"
                                        aria-label="Close"></button>
                            </div>
                            <form action="customer?action=update" method="post">
                                <div class="modal-body">
                                    <table>
                                        <tr>
                                            <td>Name:</td>
                                            <td><input type="text" name="nameUpdate"
                                                       value="${o.getName()}"></td>
                                        </tr>
                                        <tr>
                                            <td>Email:</td>
                                            <td><input type="text" name="emailUpdate" value="${o.getEmail()}"></td>
                                        </tr>
                                        <tr>
                                            <td>Address:</td>
                                            <td><input type="text" name="addressUpdate" value="${o.getAddress()}"></td>
                                        </tr>
                                    </table>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close
                                    </button>

                                    <input name="id" value="${o.getId()}" type="hidden"/>
                                    <button type="submit" class="btn btn-primary">Yes</button>

                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </td>
            <td>
                <button class="btn btn-outline-primary" data-bs-toggle="modal"
                        data-bs-target="#exampleModal${o.getId()}"
                >Delete
                </button>

                <div class="modal fade" id="exampleModal${o.getId()}" tabindex="-1" aria-labelledby="exampleModalLabel"
                     aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="exampleModalLabel">Do you want to delete this customer</h5>
                                <button type="button" class="btn-close" data-bs-dismiss="modal"
                                        aria-label="Close"></button>
                            </div>
                            <div class="modal-body">

                                Do you want delete customer: ${o.getName()} ?
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                                <form action="customer?action=delete" method="post">
                                    <input name="id" value="${o.getId()}" type="hidden"/>
                                    <button type="submit" class="btn btn-primary">Yes</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </td>
        </tr>
    </c:forEach>
    <!-- Modal -->
</table>

</body>
</html>
