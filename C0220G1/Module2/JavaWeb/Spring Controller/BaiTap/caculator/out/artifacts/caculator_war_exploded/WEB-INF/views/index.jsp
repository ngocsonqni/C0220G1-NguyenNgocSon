<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 14/5/2020
  Time: 4:50 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>caculator</title>
  </head>
  <body>
  <form action="/caculator" method="post">
    <input type="text" name="num1" value="${num1}">
    <input type="text" name="num2" value="${num2}"><br><br>
    <input type="submit" name="operator" value="Addition(+)">
    <input type="submit" name="operator" value="Subtraction(-)">
    <input type="submit" name="operator" value="Multiplication(*)">
    <input type="submit" name="operator" value="Division(/)">
  </form>
  <h1>Result Division: ${result}</h1>
  </body>
</html>
