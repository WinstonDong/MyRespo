<%--
  Created by IntelliJ IDEA.
  User: dongliang
  Date: 2020/10/19
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>我是index page</h3>

    <form action="userController/fileUploadTest" method="post" enctype="multipart/form-data">
        选择文件: <input type="file" name="upload"/><br/>
        <input type="submit" value="提交">
    </form>>

    <a href="userController/fileUploadTest2">test展示</a><br/>

    <h3>跨服务器文件上传</h3>

    <form action="userController/fileUploadTest3" method="post" enctype="multipart/form-data">
        选择文件: <input type="file" name="upload"/><br/>
        <input type="submit" value="提交">
    </form>>
</body>
</html>
