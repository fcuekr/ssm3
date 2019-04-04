<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/3
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List</title>
</head>
<body>
wocao<br>
<div style="margin: 200px 500px">
<table>

    <c:forEach items="${users}" var="user">
    <tr>
        <td>${user.id}</td><td>${user.username}</td><td>${user.password}</td>
    </tr>
    </c:forEach>
    <c:forEach items="${products}" var="product">
    <tr>
        <td>${product.id}</td><td>${product.brand}</td><td>${product.price}</td><td><img src="<%=request.getContextPath()%>/img/${product.imageUrl}" alt="" width="40px" height="40px"></td>
    </tr>
    </c:forEach>
</table>
</body>
</div>

</html>
