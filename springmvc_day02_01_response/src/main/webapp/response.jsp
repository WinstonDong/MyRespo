<%--
  Created by IntelliJ IDEA.
  User: dongliang
  Date: 2020/10/16
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script src="js/jquery.min.js"></script>

    <script>
        //页面加载，绑定单击事件
        $(function () {
            $("#btn").click(function(){
                // alert("hello, btn");
                //发送ajax请求
                $.ajax({
                    url:"userController/testAjax",
                    contentType:"application/json;charset:UTF-8",
                    data:'{"username":"蛋蛋","password":"123","age":"30"}',
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                        //data 服务器响应的jason数据进行解析
                        alert(data);
                        alert(data.username);
                        alert(data.age);
                        alert(data.password);
                    }
                });
            });
        });
     </script>

</head>
<body>

    <a href="userController/testString">testString</a><br/>
    <a href="userController/testVoid">testVoid</a><br/>
    <a href="userController/testModelAndView">testModelAndView</a><br/>

    <button id="btn">发送Ajax请求</button>

</body>
</html>
