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
    <title>Model与ModelAndView相关</title>
</head>
<body>
<h1>Model与ModelAndView相关, 结果页</h1>

<h1>通过ModelAndView的addObject()传值</h1>
<h1>testModelAndView: ${requestScope.testModelAndView}</h1>

<hr>

<h1>通过Model的addAttribute()传值</h1>
<h1>testModel: ${requestScope.testModel}</h1>
<h1>商品名称: ${requestScope.goods.name}</h1>
<h1>商品价格: ${requestScope.goods.price}</h1>

<hr>

<h1>通过Model的addAllAttributes()传值</h1>
<h1>name: ${requestScope.name}</h1>
<h1>age: ${requestScope.age}</h1>
<h1>string: ${requestScope.string}</h1>
<h1>integer: ${requestScope.integer}</h1>

<hr>

<h1>通过Map传值</h1>
<h1>mapKey1: ${requestScope.mapKey1}</h1>
<h1>mapKey2: ${requestScope.mapKey2}</h1>

</body>
</html>
