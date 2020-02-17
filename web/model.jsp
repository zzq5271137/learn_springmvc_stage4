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
    <title>Model与ModelAndView相关</title>
</head>
<body>
<h1>Model与ModelAndView相关</h1>

<h1>通过ModelAndView的addObject()传值</h1>
<a href="${pageContext.request.contextPath}/testModelAndView">
    url: /testModelAndView
</a>

<hr>

<h1>通过Model的addAttribute()传值</h1>
<a href="${pageContext.request.contextPath}/testModel">
    url: /testModel
</a>

<hr>

<h1>通过Model的addAllAttributes()传值</h1>
<a href="${pageContext.request.contextPath}/testModelAddAll">
    url: /testModelAddAll
</a>

<hr>

<h1>通过Map传值</h1>
<a href="${pageContext.request.contextPath}/testMap">
    url: /testMap
</a>

</body>
</html>
