<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/4/2020
  Time: 3:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Deleting product</title>
</head>
<body>
<h1>Delete product</h1>
<p>
    <a href="/customers">Back to product list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Product information</legend>
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
                <td>Nhà sản xuất: </td>
                <td>${requestScope["product"].getNhaSanXuat()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete product"></td>
                <td><a href="/products">Back to products list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
