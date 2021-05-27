<%--
  Created by IntelliJ IDEA.
  User: swz
  Date: 2021/5/27
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String basePath = request.getContextPath();%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("ctp", request.getContextPath());
%>

</body>
</html>
