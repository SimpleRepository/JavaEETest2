<%--
  Created by IntelliJ IDEA.
  User: Gudilin
  Date: 18.09.2020
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
  <h1>Testing JSP</h1>
  <p>
      <%
        String name = request.getParameter("name2");
      %>

    <%= name %>
  </p>
</body>
</html>
