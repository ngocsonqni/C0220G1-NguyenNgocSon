<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.DanhSachKhachHang" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <style>
    table, th, td {
      border: 1px solid black;
    }
    img{
      width: 200px;
      height: 200px;
    }

  </style>
  <body>

  <%
    List<DanhSachKhachHang> danhSach = new ArrayList<>();
    danhSach.add(new DanhSachKhachHang("Mai Văn Hoàng", "1983-08-20","Hà Nội","images/1.jpg"));
    danhSach.add(new DanhSachKhachHang("Nguyễn Văn Nam", "1983-08-21","Bắc Giang","images/2.jpg"));
    danhSach.add(new DanhSachKhachHang("Nguyễn Thái Hòa", "1983-08-22","Nam Định","images/3.jpg"));
    danhSach.add(new DanhSachKhachHang("Trần Đăng Khoa", "1983-08-17","Hà Tây","images/4.jpg"));
    danhSach.add(new DanhSachKhachHang("Nguyễn Đình Thi", "1983-08-19","Hà Nội","images/5.jpg"));
    request.setAttribute("dskh",danhSach);
  %>
  <table>
    <tr>
      <th>Tên</th>
      <th>Ngày Sinh</th>
      <th>Địa Chỉ</th>
      <th>Ảnh</th>
    </tr>
    <c:forEach var="getDanhSach" items="${dskh}">
      <tr>
        <td><c:out value="${getDanhSach.ten}"></c:out></td>
        <td><c:out value="${getDanhSach.ngaySinh}"></c:out></td>
        <td><c:out value="${getDanhSach.diaChi}"></c:out></td>
        <td><img src="<c:out value="${getDanhSach.avatar}"></c:out>"></td>
      </tr>
    </c:forEach>
  </table>

  </body>
</html>
