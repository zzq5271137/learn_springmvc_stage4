<%--
  Created by IntelliJ IDEA.
  User: zzq52
  Date: 2020/2/16
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>@SessionAttributes注解和@SessionAttribute注解</title>
</head>
<body>
<h1>@SessionAttributes注解和@SessionAttribute注解, 结果页</h1>

<h1>@SessionAttributes注解</h1>
<h1>name in request: ${requestScope.name}</h1>
<h1>name in session: ${sessionScope.name}</h1>
<h1>age in request: ${requestScope.age}</h1>
<h1>age in session: ${sessionScope.age}</h1>

<hr>
<h1>@SessionAttribute注解</h1>
<h1>注意看后台控制台的输出</h1>

</body>
</html>
