<%--
  Created by IntelliJ IDEA.
  User: dongliang
  Date: 2020/10/14
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

   <h3>入门成功了</h3>
   <!--11个域对象的其中的一个。Request的map集合-->
   ${ requestScope.msg }<br/>
   ${ sessionScope }
</body>
</html>
