<%--
  Created by IntelliJ IDEA.
  User: sang
  Date: 16-12-16
  Time: 下午2:24
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<form action="upload" enctype="multipart/form-data" method="post">
    <input type="file" name="file" />
    <input type="submit" value="上传" />
</form>
</body>
</html>
