<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String contextPath = request.getContextPath();
%>
<html>
<head>
    <title>管理员</title>
    <script src="<%=contextPath%>/static/jquery-3.1.1.js"></script>
    <script src="<%=contextPath%>/static/bootstrap/js/bootstrap.js"></script>
    <link href="<%=contextPath%>/static/bootstrap/css/bootstrap.css" rel="stylesheet"/>
    <link href="<%=contextPath%>/static/bootstrap/css/bootstrap-theme.css" rel="stylesheet"/>
</head>
<body>
<div class="container">
    <div class="panel panel-default">
        <!-- Default panel contents -->
        <div class="panel-heading">文章列表</div>
        <div class="panel-body">
            <p><a class="btn btn-primary btn-sm" href="/sang/write" role="button">写博客</a></p>
        </div>

        <table class="table">
            <tr class="info">
                <td>编号</td>
                <td>标题</td>
                <td>摘要</td>
                <td style="text-align: center" colspan="2">操作</td>
            </tr>
            <c:forEach begin="0" var="article" items="${articles}" step="1">
                <tr>
                    <td>${article.id}</td>
                    <td>${article.title}</td>
                    <td>${article.summary}</td>
                    <td><a href="/sang/update/${article.id}">修改</a></td>
                    <td><a href="/sang/delete/${article.id}">删除</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
