<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
    <style>
        .message{
            color:green;
        }
    </style>
</head>
<body>
<h1>Products</h1>
<p>
    <a href="/products?action=create">Create new product</a>
</p>
<table border="1">
    <tr>
        <td>TenSanPham</td>
        <td>GiaSanPham</td>
        <td>MoTaSanPham</td>
        <td>NhaSanXuat</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
     <c:forEach items='${requestScope["products"]}' var="product">
        <tr>
            <td><a href="/products?action=view&id=${product.getId()}">${product.getTenSanPham()}</a></td>
            <td>${product.getGiaSanPham()}</td>
            <td>${product.getMoTaSanPham()}</td>
            <td>${product.getNhaSanXuat()}</td>
            <td><a href="/products?action=edit&id=${product.getId()}">edit</a></td>
            <td><a href="/products?action=delete&id=${product.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table><br>
<form action="/products" >
    <label for="tenSanPham">
        <input type="text" id="tenSanPham" name="tenSanPham">
        <input type="hidden" value="viewName" name="action">
    </label>
    <input type="submit" value="Find">
</form>
    <c:choose>
        <c:when test='${requestScope["message"] != null}'>
            <span class="message">${requestScope["message"]}</span>
        </c:when>
        <c:otherwise>
            <table border="1">
                <c:if test='${requestScope["productSearch"] != null}'>
                    <tr>
                        <td>TenSanPham</td>
                        <td>GiaSanPham</td>
                        <td>MoTaSanPham</td>
                        <td>NhaSanXuat</td>
                        <td>Edit</td>
                        <td>Delete</td>
                    </tr>
                </c:if>
                <c:forEach items='${requestScope["productSearch"]}' var="productSearch">
                    <tr>
                        <td><a href="/products?action=view&id=${productSearch.getId()}">${productSearch.getTenSanPham()}</a></td>
                        <td>${productSearch.getGiaSanPham()}</td>
                        <td>${productSearch.getMoTaSanPham()}</td>
                        <td>${productSearch.getNhaSanXuat()}</td>
                        <td><a href="/products?action=edit&id=${productSearch.getId()}">edit</a></td>
                        <td><a href="/products?action=delete&id=${productSearch.getId()}">delete</a></td>
                    </tr>
                </c:forEach>
            </table>
        </c:otherwise>
    </c:choose>




</body>
</html>