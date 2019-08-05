<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/info" method="post">
        用户名：<input type="text" name="username">
        密码：<input type="text" name="password">
        昵称：<input type="text" name="nickname">
        描述：<input type="text" name="description">
        <input type="submit" value="提交">
    </form>
</body>
</html>