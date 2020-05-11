<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/5/2020
  Time: 9:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table, th, td {
            border: 0px solid black;
        }
        th{
            text-align: right;
        }
        td{
            text-align: left;
        }
    </style>
</head>
<body>
<script>
    <%
        String productDescription =request.getParameter("Product Description");
        double listPrice = Double.parseDouble(request.getParameter("List Price"));
        double discountPercent= Double.parseDouble(request.getParameter("Discount Percent"));
        double discountAmount= listPrice * discountPercent * 0.1/100;
        double discountPrice =listPrice - discountAmount;
    %>
</script>
    <table>
        <tr>
            <th>Product Description:</th>
            <td><%=productDescription%></td>
        </tr>
        <tr>
            <th>List Price:</th>
            <td><%=listPrice%></td>
        </tr>
        <tr>
            <th>Discount Percent:</th>
            <td><%=discountPercent%> %</td>
        </tr>
        <tr>
            <th>Discount Amount:</th>
            <td><%=discountAmount%></td>
        </tr>
        <tr>
            <th>Discount Price:</th>
            <td><%=discountPrice%></td>
        </tr>
    </table>
</body>
</html>
