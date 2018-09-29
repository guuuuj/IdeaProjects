<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\9\11 0011
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" +request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Shiro Login Demo</title>
</head>
<body>
<form action="shiroLogin" method="post">
    用户名:<input type="text" name="mid" id="mid"><br>
    密码:<input type="password" name="password" id="password"><br>
    <<input type="submit" value="登录">
    <<input type="reset" value="重置">
</form>
</body>
</html>
