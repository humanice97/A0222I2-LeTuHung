<%--
  Created by IntelliJ IDEA.
  User: tuhungle
  Date: 05/09/2022
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Product Management Application</title>
    <%-- CDN Bootstrap CSS--%>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
    <%--    jquery--%>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <%--    table data--%>

    <link rel="stylesheet" type="text/css" href="../DataTables/datatables.min.css"/>

    <script type="text/javascript" src="../DataTables/datatables.min.js"></script>
<%--    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.12.1/css/jquery.dataTables.css">--%>

<%--    <script type="text/javascript" charset="utf8"--%>
<%--            src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.js"></script>--%>


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
        <button type="button" class="btn btn-primary" data-bs-toggle="modal"
                data-bs-target="#exampleModalCreate">
            Create product
        </button>
        <form action="product?action=search" method="post">
            <div class="d-flex flex-row">
                <input class="form-control" style="width: 20em; margin-right: 1em" name="nameSearch"
                       value="${searchName}" type="search" placeholder="Search"
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
            <th>Description</th>
            <th>Category</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="p" items="${productList}">
            <tr>
                <td>${p.id}</td>
                <td>${p.name}</td>
                <td>${p.price}</td>
                <td>${p.quantity}</td>
                <td>${p.color}</td>
                <td>${p.description}</td>
                <c:forEach var="c" items="${categoryList}">
                    <c:if test="${c.id == p.category_id}">
                        <td>${c.name}</td>
                    </c:if>
                </c:forEach>
                <td>
                    <!-- Button trigger modal update-->
                    <button type="button" class="btn btn-primary btnInfo" data-id="${p.id}"
                            data-name="${p.name}"
                            data-price="${p.price}" data-quantity="${p.quantity}" data-color="${p.color}"
                            data-description="${p.description}" data-category="${p.category_id}" data-bs-toggle="modal"
                            data-bs-target="#exampleModalUpdate">
                        Update
                    </button>
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

<!-- Modal create -->
<div class="modal fade" id="exampleModalCreate" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <form action="product?action=create" method="post">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Create Product: </h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <label for="productNameCreate">Product Name :</label>
                        <input type="text" name="productNameCreate" id="productNameCreate" class="form-control"
                               placeholder="Input name" value="${productErr.name}">
                        <c:if test="${not empty isError}">
                            <span style="color:red;">${name_blank}</span>
                        </c:if>


                    </div>
                    <div class="form-group">
                        <label for="productPriceCreate">Product Price: </label>
                        <input type="text" name="productPriceCreate" id="productPriceCreate" class="form-control"
                               placeholder="Input Price" value="${productErr.price}">
                        <c:if test="${not empty isError}">
                            <span style="color:red;">${price_err}</span>
                        </c:if>

                    </div>
                    <div class="form-group">
                        <label for="productQuantityCreate">Product Quantity :</label>
                        <input type="text" name="productQuantityCreate" id="productQuantityCreate" class="form-control"
                               placeholder="Input Quantity" value="${productErr.quantity}">
                        <c:if test="${not empty isError}">
                            <span style="color:red;">${quantity_err}</span>
                        </c:if>
                    </div>
                    <div class="form-group">
                        <label for="productColorCreate">Product Color :</label>
                        <input type="text" name="productColorCreate" id="productColorCreate" class="form-control"
                               placeholder="Input Color" value="${productErr.color}">
                        <c:if test="${not empty isError}">
                            <span style="color:red;">${color_blank}</span>
                        </c:if>
                    </div>
                    <div class="form-group">
                        <label for="productDescriptionCreate">Product Description :</label>
                        <input type="text" name="productDescriptionCreate" id="productDescriptionCreate"
                               class="form-control"
                               placeholder="Input Description" value="${productErr.description}">
                        <c:if test="${not empty isError}">
                            <span style="color:red;">${description_blank}</span>
                        </c:if>
                    </div>
                    <div class="form-group">
                        <label for="productCategoryCreate">Product Category :</label>
                        <select id="productCategoryCreate" name="productCategoryCreate"
                                class="form-select form-select-sm" aria-label=".form-select-sm example">
                            <option value="0">Select category</option>
                            <c:forEach items="${categoryList}" var="c">
                                    <option value="${c.id}">${c.name}</option>
                            </c:forEach>
                        </select>
                        <c:if test="${not empty isError}">
                            <span style="color:red;">${category_err}</span>
                        </c:if>
                    </div>


                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Create</button>
                </div>
            </div>
        </div>
    </form>
</div>

<!-- Modal update -->
<div class="modal fade" id="exampleModalUpdate" tabindex="-1" aria-labelledby="exampleModalLabelUpdate"
     aria-hidden="true">
    <form action="product?action=update" method="post">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabelUpdate">Update Product: </h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <label for="productNameUpdate">Product Name :</label>
                        <input type="text" name="productNameUpdate" id="productNameUpdate" class="form-control"
                               placeholder="Input name">
                    </div>
                    <div class="form-group">
                        <label for="productPriceUpdate">Product Price: </label>
                        <input type="text" name="productPriceUpdate" id="productPriceUpdate" class="form-control"
                               placeholder="Input Price">
                    </div>
                    <div class="form-group">
                        <label for="productQuantityUpdate">Product Quantity :</label>
                        <input type="text" name="productQuantityUpdate" id="productQuantityUpdate" class="form-control"
                               placeholder="Input Quantity">
                    </div>
                    <div class="form-group">
                        <label for="productColorUpdate">Product Color :</label>
                        <input type="text" name="productColorUpdate" id="productColorUpdate" class="form-control"
                               placeholder="Input Color">
                    </div>
                    <div class="form-group">
                        <label for="productDescriptionUpdate">Product Description :</label>
                        <input type="text" name="productDescriptionUpdate" id="productDescriptionUpdate"
                               class="form-control"
                               placeholder="Input Description">
                    </div>
                    <div class="form-group">
                        <label for="productCategoryUpdate">Product Category :</label>
                        <select id="productCategoryUpdate" name="productCategoryUpdate"
                                class="form-select form-select-sm" aria-label=".form-select-sm example">
                            <option value="1">Television</option>
                            <option value="2">Phone</option>
                            <option value="3">Computer</option>
                        </select>
                    </div>
                    <input type="hidden" name="productIdUpdate" id="productIdUpdate">
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
                    <button type="submit" class="btn btn-primary">Update</button>
                </div>
            </div>
        </div>
    </form>
</div>


<!-- Modal delete -->
<div class="modal fade" id="exampleModalDelete" tabindex="-1" aria-labelledby="exampleModalLabelDelete"
     aria-hidden="true">
    <form action="product?action=delete" method="post">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabelDelete">Update Product: </h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <input type="hidden" name="productIdDelete" id="productIdDelete">
                    <span>Do you want delete product:  <span id="productNameDelete"></span> ?</span>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
                    <button type="submit" class="btn btn-primary">Delete</button>
                </div>
            </div>
        </div>
    </form>
</div>

<c:if test="${isError}">
    <script>
        // var myModal = new bootstrap.Modal(document.getElementById("exampleModalCreate"), {});
        // document.onreadystatechange = function () {
        //     myModal.show();
        // };
        $(document).ready(function () {
            // Show the Modal on load
            $("#exampleModalCreate").modal("show")
        })

    </script>
</c:if>

<script>
    $(document).ready(function () {
        $('#jqueryTable').DataTable({
            "pageLength": 5,
            "searching": false,
            lengthMenu: [
                [5, 10, 25, 50, -1],
                ['5 rows', '10 rows', '25 rows', '50 rows', 'Show all']
            ],
        });
    });


    $(".btnInfo").click(function () {
        let id = $(this).attr("data-id");
        let name = $(this).attr("data-name");
        let price = $(this).attr("data-price");
        let quantity = $(this).attr("data-quantity");
        let color = $(this).attr("data-color");
        let description = $(this).attr("data-description");
        let category = $(this).attr("data-category");

        $("#productIdUpdate").val(id);
        $("#productIdDelete").val(id);
        $("#productNameUpdate").val(name);
        $("#productPriceUpdate").val(price);
        $("#productQuantityUpdate").val(quantity);
        $("#productColorUpdate").val(color);
        $("#productDescriptionUpdate").val(description);
        $("#productCategoryUpdate").val(category);
        document.getElementById("productNameDelete").innerHTML = name;
    })
</script>
</body>
</html>
