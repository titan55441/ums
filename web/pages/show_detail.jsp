<%--
  Created by IntelliJ IDEA.
  User: batcave
  Date: 16/2/20
  Time: 上午10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
</head>
<body>
<%@include file="/pages/header.jsp"%>
<table border="1">
    <tr>
        <td>用户号</td>
        <td>${user.id}</td>
    </tr>
    <tr>
        <td></td>
        <td>${user.username}</td>
    </tr>
    <tr>
        <td>性别</td>
        <td>${user.gender}</td>
    </tr>
    <tr>
        <td>年龄</td>
        <td>${user.age}</td>
    </tr>

</table>
</body>
</html>
