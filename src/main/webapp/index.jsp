<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/means/sendToSMS" method="post">
    <input name="tel" title="手机号码">
    <button>发送验证码</button>
</form>
<%--<script>
    window.location.href='/movie/bg/page/doLogin';
</script>--%>
</body>
</html>
