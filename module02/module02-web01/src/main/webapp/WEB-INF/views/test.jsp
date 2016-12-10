<%--
  Created by IntelliJ IDEA.
  User: robin
  Date: 16/3/9
  Time: PM5:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>页面跳转中</title>
</head>
<script language="JavaScript">
    function getCookie(name) {
        var arr, reg = new RegExp("(^| )" + name + "=([^;]*)(;|$)");
        if (arr = document.cookie.match(reg))
            return unescape(arr[2]);
        else
            return null;
    }
    var token = getcookie("token");
    if (undefined(token) || null == token || "" == token) {
        <%response.sendRedirect("/redirect_userinfo");%>
    } else {
        <%response.sendRedirect("http://d.2dfire.com/");%>
    }

</script>
<body>
</body>
</html>
