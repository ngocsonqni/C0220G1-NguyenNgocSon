<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 13/5/2020
  Time: 3:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Chuyển đổi tiền tệ</title>
  </head>
  <body>

    <fieldset>
      <legend>Chuyển đổi tiền tệ</legend>
      <form action="/convert">
        <table>
          <tr>
            <td>Tỉ giá USD-VND</td>
            <td><input type="text" name="tiGiaUSD" value="23000"></td>
          </tr>
          <tr>
            <td>Nhập USD</td>
            <td><input type="text" name="USD"></td>
          </tr>
          <tr>
            <td></td>
            <td><input type="submit" value="Chuyển đổi"></td>
          </tr>
        </table>
      </form>
  </fieldset>
  </body>
</html>
