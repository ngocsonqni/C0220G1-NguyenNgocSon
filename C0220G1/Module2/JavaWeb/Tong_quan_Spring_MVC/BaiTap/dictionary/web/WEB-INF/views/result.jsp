<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 13/5/2020
  Time: 4:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result dictionary</title>
</head>
<body>
<fieldset>
    <legend>Từ điển đơn giản</legend>
    <table>
        <tr>
            <td>English:</td>
            <td>${dictionnaryEng}</td>
        </tr>
        <tr>
            <td>Vietnamese:</td>
            <td>${dictionnaryVie}</td>
        </tr>
    </table>
    <a href="index.jsp">Back to dictionary search</a>
</fieldset>
</body>
</html>
