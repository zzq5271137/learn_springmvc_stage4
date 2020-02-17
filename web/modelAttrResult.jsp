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
    <title>@ModelAttribute注解</title>
</head>
<body>
<h1>@ModelAttribute注解, 结果页</h1>

<h1>自动地把模型存放到Model对象中(以类型的名称作为key值, 首字母改为小写)</h1>
<h1>商品名称: ${goods.name}</h1>
<h1>商品价格: ${goods.price}</h1>

<hr>

<h1>@ModelAttribute修饰参数: 使用@ModelAttribute注解修改key值(不以类型的名称作为key值)</h1>
<h1>学生姓名: ${myStu.studentName}</h1>
<h1>学生id: ${myStu.studentId}</h1>

<hr>

<h1>@ModelAttribute修饰方法</h1>
<h1>timeout: ${timeout}</h1>
<h1>注意看后台控制台的输出</h1>

</body>
</html>
