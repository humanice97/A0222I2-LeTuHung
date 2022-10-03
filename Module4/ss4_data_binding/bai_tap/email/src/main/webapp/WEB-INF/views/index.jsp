<%--
  Created by IntelliJ IDEA.
  User: tuhungle
  Date: 30/09/2022
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<head>
    <title>$Title$</title>
</head>
<body>
<h1>Email Register</h1>
<form:form method="post" modelAttribute="email" action="/update">
<table>
    <tr>
        <th>
            <form:label path="language">Language:</form:label></th>
        <td>

            <form:select path="language">
                <form:options items="${language}"/>
            </form:select>
        </td>
    </tr>
    <tr>
        <th><form:label path="pageSize">Page size:</form:label></th>
        <td>
            Show
            <form:select path="pageSize">
                <form:options items="${pageSize}"/>
            </form:select>
            emails per page
        </td>
    </tr>
    <tr>
        <th><form:label path="filter">Spam filter:</form:label></th>
        <td>
            <form:checkbox path="filter"/>
        </td>
    </tr>
    <tr>
        <th><form:label path="signature">Signature:</form:label></th>
        <td>
            <form:textarea path="signature"/>
        </td>
    </tr>
    <tr>
        <td></td>
        <td>
            <button type="submit">Update</button>
            <button>Cancel</button>
        </td>
    </tr>

</table>
</form:form>
</body>
</html>
