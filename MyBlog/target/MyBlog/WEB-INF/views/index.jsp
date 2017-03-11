<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String contextPath = request.getContextPath();
%>
<html>
<head>
    <title>首页</title>
    <link href="<%=contextPath%>/static/mycss.css" rel="stylesheet"/>
</head>
<body>
<%--<%@include file="comm/top.jsp" %>--%>
<jsp:include page="comm/top.jsp"/>

<c:forEach var="article" items="${articles}" begin="0" step="1">
    <div class="row">
        <div class="container">
            <div class="jumbotron">
                <h3>${article.title}</h3>
                <span class="summary">${article.summary}</span><br><br>
                <p><a class="btn btn-primary btn-lg" href="/detail/${article.id}/firstPage"
                      role="button">阅读全文</a></p>
            </div>
        </div>
    </div>
</c:forEach>
</body>
</html>
