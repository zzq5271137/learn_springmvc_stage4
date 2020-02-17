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
    <title>@ModelAttribute注解</title>
</head>
<body>
<h1>@ModelAttribute注解</h1>

<h1>自动地把模型存放到Model对象中(以类型的名称作为key值, 首字母改为小写)</h1>
<form action="${pageContext.request.contextPath}/testModelAttr1">
    名称: <input type="text" name="name"><br>
    价格: <input type="text" name="price"><br>
    <input type="submit" value="提交">
</form>

<hr>

<h1>@ModelAttribute修饰参数: 使用@ModelAttribute注解修改key值(不以类型的名称作为key值)</h1>
<form action="${pageContext.request.contextPath}/testModelAttr2">
    学生姓名: <input type="text" name="studentName"><br>
    学生id: <input type="text" name="studentId"><br>
    <input type="submit" value="提交">
</form>

<hr>

<h1>@ModelAttribute修饰方法</h1>
<form action="${pageContext.request.contextPath}/testModelAttrSp">
    学生姓名: <input type="text" name="studentName"><br>
    学生id: <input type="text" name="studentId"><br>
    <input type="submit" value="提交">
</form>

</body>
</html>
