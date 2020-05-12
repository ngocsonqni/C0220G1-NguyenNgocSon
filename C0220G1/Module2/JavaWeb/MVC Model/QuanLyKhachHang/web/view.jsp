<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/4/2020
  Time: 4:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View product</title>
</head>
<body>
<h1>Product details</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<table>
    <tr>
        <td>Tên sản phẩm: </td>
        <td>${requestScope["product"].getTenSanPham()}</td>
    </tr>
    <tr>
        <td>Giá sản phẩm: </td>
        <td>${requestScope["product"].getGiaSanPham()}</td>
    </tr>
    <tr>
        <td>Mô tả sản phẩm: </td>
        <td>${requestScope["product"].getMoTaSanPham()}</td>
    </tr>
    <tr>
        <td>Nhà sản xuất:: </td>
        <td>${requestScope["product"].getNhaSanXuat()}</td>
    </tr>
</table>
</body>
</html>
