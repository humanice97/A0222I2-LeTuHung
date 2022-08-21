<%--
  Created by IntelliJ IDEA.
  User: tuhungle
  Date: 17/08/2022
  Time: 18:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
            crossorigin="anonymous"></script>
    </body>

</head>
<body>
<h2>Currency Converter</h2>
<form action="/convert" method="post">

    <label for="input1" class="form-label">Rate: </label>
    <input name="rate" type="text" id="input1" placeholder="RATE" value="22000" class="form-control" aria-describedby="p1">
    <div id="p1" class="form-text"></div>
    <label for="input2" class="form-label">USD: </label>
    <input name="usd" type="text" id="input2" placeholder="USD" value="0" class="form-control" aria-describedby="p2">
    <div id="p2" class="form-text"></div>
    <button class="btn btn-light" type="submit">Convert</button>

</form>
</body>
</html>
