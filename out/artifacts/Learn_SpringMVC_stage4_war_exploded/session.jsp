<%--
  Created by IntelliJ IDEA.
  User: zzq52
  Date: 2020/2/16
  Time: 20:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>@SessionAttributes注解和@SessionAttribute注解</title>
</head>
<body>
<h1>@SessionAttributes注解和@SessionAttribute注解</h1>

<h1>@SessionAttributes注解</h1>
<a href="${pageContext.request.contextPath}/testSessionAttrs">
    url: /testSessionAttrs
</a>

<hr>

<h1>@SessionAttribute注解</h1>
<a href="${pageContext.request.contextPath}/testSessionAttr">
    url: /testSessionAttr
</a>

</body>
</html>
