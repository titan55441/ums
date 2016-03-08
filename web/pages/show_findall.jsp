<%--
  Created by IntelliJ IDEA.
  User: batcave
  Date: 16/2/20
  Time: 上午8:07
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
    <table border="1">
        <tr>
            <td>编号</td>
            <td>员工号</td>
            <td>用户名</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${requestScope.allUser}" var="user" varStatus="vs">
            <tr>
                <td>${vs.getCount()}</td>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td><a href="${pageContext.request.contextPath}/FindUserByIdServlet?id=${user.id}">查询详情 </a> 修改 删除</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
