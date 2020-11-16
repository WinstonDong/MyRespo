<%--
  Created by IntelliJ IDEA.
  User: dongliang
  Date: 2020/10/14
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <!--
    <a href="paramsController/testParam?username=winston&&password=123456">请求参数的绑定</a>
    -->

    <!--
    <form action="paramsController/saveAccount" method="post">
        姓名：<input type="text" name="username"/><br/>
        密码：<input type="password" name="password"/><br/>
        金额：<input type="text" name="money"/><br/>
        用户密码：<input type="text" name="user.uname"/><br/>
        年龄：<input type="text" name="user.age"/><br/>
        <input type="submit" value="提交">
    </form>
    -->


    <!--把数据封装到Account中，里面存在map和list集合-->
    <!--
    <form action="paramsController/saveAccount" method="post">
        姓名：<input type="text" name="username"/><br/>
        密码：<input type="password" name="password"/><br/>
        金额：<input type="text" name="money"/><br/>

        用户姓名：<input type="text" name="list[0].uname"/><br/>
        年龄：<input type="text" name="list[0].age"/><br/>

        用户姓名：<input type="text" name="map['one'].uname"/><br/>
        年龄：<input type="text" name="map['one'].age"/><br/>
        <input type="submit" value="提交">
    </form>
    -->

    <!--类型转换
    <form action="paramsController/saveUser" method="post">
        姓名：<input type="text" name="uname"/><br/>
        年龄：<input type="password" name="age"/><br/>
        生日：<input type="text" name="date"/><br/>
        <input type="submit" value="提交">
    </form>
    -->

    <!--原生的API-->
    <a href="paramsController/testServlet">Servelet原生API</a>

</body>
</html>
