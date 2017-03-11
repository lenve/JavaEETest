<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>${displayName}</title>
</head>
<body>
<%--<%@include file="comm/top.jsp" %>--%>
<jsp:include page="comm/top.jsp"/>
<div class="container">
    <c:forEach var="article" items="${articles}">
        <div class="panel panel-primary">
            <div class="panel-heading">
                <h3 class="panel-title">${article.title}</h3>
            </div>
            <div class="panel-body">
                <h4>${article.summary}</h4>
                <p><a class="btn btn-primary btn-lg" href="/detail/${article.id}/${article.category}" role="button">阅读全文</a></p>
            </div>
        </div>
    </c:forEach>
</div>
</body>
</html>
