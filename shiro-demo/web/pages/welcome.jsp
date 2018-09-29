<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018\9\12 0012
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<shiro:principal/>
<shiro:user/>
<shiro:guest>
    <p>当前为游客</p>
</shiro:guest>
<shiro:notAuthenticated>
    <p>用户未认证过</p>
</shiro:notAuthenticated>
<shiro:authenticated >
    <p>该用户已经被认证过了</p>
</shiro:authenticated>
<shiro:lacksRole name="emp">
    <p>不具备有emp角色</p>
</shiro:lacksRole>
<shiro:lacksPermission name="emp:add">
    <p>不具备有emp：add权限</p>
</shiro:lacksPermission>
<shiro:hasPermission name="member:add">
    <p>具备有member：add权限</p>
</shiro:hasPermission>
<shiro:hasRole name="member">
    <p>具备有member角色！</p>
</shiro:hasRole>
<shiro:hasAnyRoles name="member，emp">
    <p>具备有member或emp至少一种角色！</p>
</shiro:hasAnyRoles>
</body>
</html>
