<%--
  Created by IntelliJ IDEA.
  User: tuhungle
  Date: 13/09/2022
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>

    <%-- CDN Bootstrap CSS--%>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
    <%--    jquery--%>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<%--Link Data table--%>
    <link rel="stylesheet" type="text/css" href="../DataTables/datatables.min.css"/>
    <script type="text/javascript" src="../DataTables/datatables.min.js"></script>
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
            Tao Mat Bang
        </button>
<%--        <form action="product?action=search" method="post">--%>
<%--            <div class="d-flex flex-row">--%>
<%--                <input class="form-control" style="width: 20em; margin-right: 1em" name="nameSearch"--%>
<%--                       value="" type="search" placeholder="Search"--%>
<%--                       aria-label="Search">--%>
<%--                <button class="btn btn-outline-success" type="submit">Tim kiem</button>--%>
<%--            </div>--%>
<%--        </form>--%>
    </div>
</div>
<div align="center">
    <table id="jqueryTable" class="table table-striped">
        <thead>
        <tr>
            <th>Ma MB</th>
            <th>Dien Tich</th>
            <th>Trang Thai</th>
            <th>Tang</th>
            <th>Loai Van Phong</th>
            <th>Gia Cho Thue</th>
            <th>Ngay Bat Dau</th>
            <th>Ngay Ket Thuc</th>
            <th>Hanh Dong</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="mb" items="${matBangList}">
            <tr>
                <td>${mb.maMatBang}</td>
                <td>${mb.dienTich}</td>
                                    <c:forEach var="tt" items="${trangThaiList}">
                                        <c:if test="${tt.id == mb.trangThai}">
                                            <td>${tt.tenTrangThai}</td>
                                        </c:if>
                                    </c:forEach>
                <td>${mb.tang}</td>
                <c:forEach var="lmb" items="${loaiMatBangList}">
                    <c:if test="${lmb.id == mb.loaiVanPhong}">
                        <td>${lmb.tenLoaiMatBang}</td>
                    </c:if>
                </c:forEach>
                <td>${mb.giaChoThue}</td>
                <td>${mb.ngayBatDau}</td>
                <td>${mb.ngayKetThuc}</td>

                <td>
                    <!-- Button trigger modal delete -->
                    <button type="button" class="btn btn-primary btnInfo" data-id="${mb.maMatBang}"
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
                    <h5 class="modal-title" id="exampleModalLabel">Tao Mat Bang: </h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <label for="maMatBang"> Ma Mat Bang :</label>
                        <input type="text" name="maMatBang" id="maMatBang" class="form-control"
                               placeholder="Input ma mat bang">


                    </div>
                    <div class="form-group">
                        <label for="dienTich">Dien tich: </label>
                        <input type="text" name="dienTich" id="dienTich" class="form-control"
                               placeholder="Input Dien tich" >

                    </div>

                    <div class="form-group">
                        <label for="trangThai">Trang thai :</label>
                        <select id="trangThai" name="trangThai"
                                class="form-select form-select-sm" aria-label=".form-select-sm example">
                            <option value="0">Select trang thai</option>
                            <c:forEach items="${trangThaiList}" var="tt">
                                <option value="${tt.id}">${tt.tenTrangThai}</option>
                            </c:forEach>
                        </select>
                    </div>

                    <div class="form-group">
                        <label for="tang">Tang :</label>
                        <select id="tang" name="tang"
                                class="form-select form-select-sm" aria-label=".form-select-sm example">
                            <option value="1">Tang 1</option>
                            <option value="2">Tang 2</option>
                            <option value="3">Tang 3</option>
                            <option value="4">Tang 4</option>
                            <option value="5">Tang 5</option>
                            <option value="6">Tang 6</option>
                            <option value="7">Tang 7</option>
                            <option value="8">Tang 8</option>
                            <option value="9">Tang 9</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="loaiVanPhong"> Loai van phong :</label>
                        <select id="loaiVanPhong" name="loaiVanPhong"
                                class="form-select form-select-sm" aria-label=".form-select-sm example">
                            <option value="0">Select loai Van Phong </option>
                            <c:forEach items="${loaiMatBangList}" var="lmb">
                                <option value="${lmb.id}">${lmb.tenLoaiMatBang}</option>
                            </c:forEach>
                        </select>
                    </div>


                    <div class="form-group">
                        <label for="giaChoThue">Gia cho thue:</label>
                        <input type="text" name="giaChoThue" id="giaChoThue"
                               class="form-control"
                               placeholder="Input gia cho thue">

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



<!-- Modal delete -->
<div class="modal fade" id="exampleModalDelete" tabindex="-1" aria-labelledby="exampleModalLabelDelete"
     aria-hidden="true">
    <form action="matbang?action=delete" method="post">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabelDelete">Update Product: </h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <input type="hidden" name="productIdDelete" id="productIdDelete">
                    <span>Do you want delete mat bang ?</span>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
                    <button type="submit" class="btn btn-primary">Delete</button>
                </div>
            </div>
        </div>
    </form>
</div>

<%--<c:if test="${isError}">--%>
<%--    <script>--%>
<%--        // var myModal = new bootstrap.Modal(document.getElementById("exampleModalCreate"), {});--%>
<%--        // document.onreadystatechange = function () {--%>
<%--        //     myModal.show();--%>
<%--        // };--%>
<%--        $(document).ready(function () {--%>
<%--            // Show the Modal on load--%>
<%--            $("#exampleModalCreate").modal("show")--%>
<%--        })--%>

<%--    </script>--%>
<%--</c:if>--%>

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
        $("#productIdDelete").val(id);
    })
</script>
</body>
</html>
