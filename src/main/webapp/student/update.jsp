<%--
  Created by IntelliJ IDEA.
  User: susu
  Date: 30/11/2021
  Time: 4:05 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
<input type="text" name="name" value="${student.getName()}">
<input type="text" name="mathScore" value="${student.getMathScore()}">
<input type="text" name="physicalScore" value="${student.getPhysicalScore()}">
<input type="text" name="chemicalScore" value="${student.getChemicalScore()}">
<button>Update</button>
</form>
</body>
</html>
