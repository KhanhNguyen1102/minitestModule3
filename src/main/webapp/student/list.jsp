<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: susu
  Date: 30/11/2021
  Time: 3:44 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href=""></a>
<c:forEach items='${students}' var="student">
    <h2>${student.getId()},${student.getName()},${student.getMathScore()},${student.getPhysicalScore()},${student.getChemicalScore()}</h2>
    <a href="/student?action=update&id=${student.getId()}">Sửa</a>|
    <a onclick="return confirm('Bạn chắc muốn xóa chưa?')" href="/student?action=delete&id=${student.getId()}">Xóa</a>
</c:forEach>
</body>
</html>
