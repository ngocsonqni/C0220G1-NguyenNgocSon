<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/5/2020
  Time: 3:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<script>
    <%String  name =request.getParameter("username");
    String password =request.getParameter("password");%>

    <%if (name.equals("admin") || password.equals("admin")){
        %>
        document.write('<h1>Welcome <%=name%> to website</h1>')
    <%
    }else {
    %>
        document.writeln('<h1>Login Error</h1>')
    <%
    }
    %>
</script>
</body>
</html>
