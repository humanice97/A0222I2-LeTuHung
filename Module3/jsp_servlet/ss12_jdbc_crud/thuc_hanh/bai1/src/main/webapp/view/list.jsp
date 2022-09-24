<%--
  Created by IntelliJ IDEA.
  User: tuhungle
  Date: 31/08/2022
  Time: 18:11
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User Management Application</title>
    <%--    Bootstrap CSS--%>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
    <%--    jquery--%>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
<div style="text-align: center;">
    <h1>User Management</h1>
    <h2>
        <!-- Button trigger modal create-->
        <button type="button" class="btn btn-outline-primary btn-update"
                data-bs-toggle="modal"
                data-bs-target="#exampleModalCreate">
            Create user
        </button>
        <form action="users?action=search" method="post">
            <div class="form-group"
                 style=";display: flex;align-items: center;justify-content: center;flex-direction: row">
                <input class="form-control me-2" style="width: 200px;margin: 1em" type="search" name="nameSearch"
                       value="${nameSearch}" placeholder="Input name search " aria-label="Search">
                <input class="form-control me-2" style="width: 200px;margin: 1em" type="search" name="emailSearch"
                       value="${emailSearch}" placeholder="Input email search" aria-label="Search">
                <input class="form-control me-2" style="width: 200px;margin: 1em" type="search" name="countrySearch"
                       value="${countrySearch}" placeholder="Input country search" aria-label="Search">
                <button class="btn btn-outline-primary" type="submit">Search</button>
            </div>


        </form>

        <caption><h2>List of Users</h2></caption>
    </h2>
</div>
<div align="center">
    <table class="table table-striped">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Country</th>
            <th style="text-align: center">Edit</th>
        </tr>
        <c:forEach var="o" items="${userList}">
            <tr>
                <td><c:out value="${o.id}"/></td>
                <td><c:out value="${o.name}"/></td>
                <td><c:out value="${o.email}"/></td>
                <td><c:out value="${o.country}"/></td>
                <td style="text-align: center">
                    <!-- Button trigger modal update-->
                    <button type="button" class="btn btn-outline-primary btn-update" onclick="onUpdate(this)"
                            data-id="${o.id}" data-name="${o.name}" data-email="${o.email}" data-country="${o.country}"
                            data-bs-toggle="modal"
                            data-bs-target="#exampleModalUpdate">
                        Update
                    </button>

                    <!-- Button trigger modal delete-->
                    <button type="button" onclick="deleteInfo('${o.id}','${o.name}')" class="btn btn-outline-primary"
                            data-bs-toggle="modal" data-bs-target="#exampleModalDelete">
                        Delete
                    </button>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>


<!-- Modal Delete-->
<form action="users?action=delete" method="post">
    <div class="modal fade" id="exampleModalDelete" tabindex="-1"
         aria-labelledby="exampleModalLabelDelete"
         aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabelDelete">Delete User</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal"
                            aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <input type="hidden" name="deleteId" id="deleteId">
                    <span>Do you want delete  <span id="deleteName"></span> ?</span>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">No
                    </button>
                    <button type="submit" class="btn btn-primary">Yes</button>
                </div>
            </div>
        </div>
    </div>
</form>

<!-- Modal Update-->
<div class="modal fade" id="exampleModalUpdate" tabindex="-1"
     aria-labelledby="exampleModalLabelUpdate"
     aria-hidden="true">
    <form action="users?action=edit" method="post">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabelUpdate">Edit User</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal"
                            aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <p>Do you want update user</p>
                    <div class="form-group">
                        <label for="userNameUpdate">User Name</label>
                        <input type="text" name="userName" id="userNameUpdate" class="form-control"
                               placeholder="Input name">
                    </div>
                    <div class="form-group">
                        <label for="userEmailUpdate">User Email</label>
                        <input type="text" name="userEmail" id="userEmailUpdate" class="form-control"
                               placeholder="Input email">
                    </div>
                    <div class="form-group">
                        <label for="userCountryUpdate">User Country</label>
                        <input type="text" name="userCountry" id="userCountryUpdate" class="form-control"
                               placeholder="Input country">
                    </div>
                    <div>
                        <input type="hidden" name="userId" id="userIdUpdate">
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close
                    </button>
                    <button type="submit" class="btn btn-primary">Save changes</button>
                </div>
            </div>
        </div>
    </form>
</div>


<!-- Modal Create-->
<div class="modal fade" id="exampleModalCreate" tabindex="-1"
     aria-labelledby="exampleModalLabelCreate"
     aria-hidden="true">
    <form action="users?action=create" method="post">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabelCreate">Create User</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal"
                            aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <p>Do you want create user ?</p>
                    <div class="form-group">
                        <label for="userNameCreate">User Name</label>
                        <input type="text" name="userNameCreate" id="userNameCreate" class="form-control"
                               placeholder="Input name">
                    </div>
                    <div class="form-group">
                        <label for="userEmailCreate">User Email</label>
                        <input type="text" name="userEmailCreate" id="userEmailCreate" class="form-control"
                               placeholder="Input email">
                    </div>
                    <div class="form-group">
                        <label for="userCountryCreate">User Country</label>
                        <input type="text" name="userCountryCreate" id="userCountryCreate" class="form-control"
                               placeholder="Input country">
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close
                    </button>
                    <button type="submit" class="btn btn-primary">Create</button>
                </div>
            </div>
        </div>
    </form>
</div>

<%--javascript--%>

<script>
    function deleteInfo(id, name) {
        document.getElementById("deleteId").value = id;
        document.getElementById("deleteName").innerHTML = name;
    }


    $(".btn-update").click(function () {
        let id = $(this).attr("data-id");
        let name = $(this).attr("data-name");
        let email = $(this).attr("data-email");
        let country = $(this).attr("data-country");
        $("#userNameUpdate").val(name)
        $("#userEmailUpdate").val(email)
        $("#userCountryUpdate").val(country)
        $("#userIdUpdate").val(id)
        // $('#exampleModalUpdate').modal('show');
    })

</script>
</body>
</html>
