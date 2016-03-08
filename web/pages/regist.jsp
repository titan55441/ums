<%--
  Created by IntelliJ IDEA.
  User: batcave
  Date: 16/2/20
  Time: 上午10:32
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
<%@include file="/pages/regist.jsp"%>
<form action="${pageContext.request.contextPath}/RegistUserServlet" method="post">
    <table border="1">
        <tr>
            <td>用户号</td>
            <td><input type="text" name="id"></td>
        </tr>
        <tr>
            <td>用户名</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="text" name="password"></td>
        </tr>
        <tr>
            <td>确认密码</td>
            <td><input type="text" name="repassword"></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><input type="radio" name="gender" value="男" checked="checked">男"
            <input type="radio" name="gender" value="女">女</td>
        </tr>
        <tr>
            <td>年龄</td>
            <td><input type="text" name="age"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="注册"></td>
        </tr>
    </table>
</form>
</body>
</html>
