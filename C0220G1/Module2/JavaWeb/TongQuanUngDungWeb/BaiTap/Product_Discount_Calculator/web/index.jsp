
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
    <style>
      table, th, td {
        border: 0px solid black;
      }
    </style>
  </head>
  <body>
  <form method="post" action="/display-discount">
    <table>
      <tr>
        <th>Product Description:</th>
        <th><input type="text" name="Product Description"></th>
      </tr>
      <tr>
        <th>List Price:</th>
        <th><input type="text" name="List Price"></th>
      </tr>
      <tr>
        <th>Discount Percent:</th>
        <th><input type="text" name="Discount Percent"></th>
      </tr>
    </table>
    <br><input type="submit" id="submit" value="Calculate">
  </form>

  </body>
</html>
