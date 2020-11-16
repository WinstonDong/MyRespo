<%--
  Created by IntelliJ IDEA.
  User: dongliang
  Date: 2020/10/15
  Time: 13:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <!--@RequestParam注解-->
    <a href="annoController/testParam?uname=董梁">RequestParam展示</a>

    <br>
    <!--@RequestBody注解测试-->
    <form action="annoController/testRequestBody" method="post">
        姓名：<input type="text" name="uname"/><br/>
        年龄：<input type="password" name="age"/><br/>
        <input type="submit" value="提交">
    </form>

    <!--@PathVairable和Restful风格的测试-->
    <a href="annoController/testPathVariable/{20}">RequestVariable展示</a><br/>

    <!--@RequestHeader的测试-->
    <a href="annoController/testRequestHeader">@RequestHeader展示</a><br/>

    <!--@CookieValue的测试-->
    <a href="annoController/testCookieValue">@CookieValue展示</a><br/>

    <!--@ModelAttribute的测试-->
    <form action="annoController/testModelAttribute" method="post">
        姓名：<input type="text" name="uname"/><br/>
        年龄：<input type="password" name="age"/><br/>
        <input type="submit" value="提交">
    </form>

    <!--@SessionAttributes的测试-->
    <a href="annoController/testSessionAttribues">test @SessionAttributes展示</a><br/>
    <a href="annoController/getSessionAttribues">get @SessionAttributes</a><br/>
    <a href="annoController/delSessionAttribues">delete @SessionAttributes</a><br/>
</body>
</html>
