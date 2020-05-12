<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/4/2020
  Time: 3:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit product</title>
</head>
<body>
<h1>Edit product</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/products">Back to products list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>Tên sản phẩm: </td>
                <td><input type="text" name="tenSanPham" id="tenSanPham" value="${requestScope["product"].getTenSanPham()}"></td>
            </tr>
            <tr>
                <td>Giá sản phẩm: </td>
                <td><input type="text" name="giaSanPham" id="giaSanPham" value="${requestScope["product"].getGiaSanPham()}"></td>
            </tr>
            <tr>
                <td>Mô tả sản phẩm: </td>
                <td><input type="text" name="moTaSanPham" id="moTaSanPham" value="${requestScope["product"].getMoTaSanPham()}"></td>
            </tr>
            <tr>
                <td>Nhà sản xuất: </td>
                <td><input type="text" name="nhaSanXuat" id="nhaSanXuat" value="${requestScope["product"].getNhaSanXuat()}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
