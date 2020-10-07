<%@ page import="packCart.Cart" %>
<%--
  Created by IntelliJ IDEA.
  User: Gudilin
  Date: 18.09.2020
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Cart</title>
</head>
<body>
  <%@ page import = "packCart.Cart" %>
  <% Cart cart = (Cart)session.getAttribute("cart");%>

  <p> Naimenovanie: <%= cart.getName()%> </p>
  <p> Kolichestvo: <%= cart.getQuantity()%> </p>
</body>
</html>
