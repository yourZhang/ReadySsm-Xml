<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2020/9/14
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
你好 世界 ${cxp}
<br>
测试拦截器 <a href="${cxp}/toIn">拦截器</a>
</body>
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
<script>
    $(function () {
        $.ajax({
            url: "${cxp}/getUserInfo",
            async: true,
            data: {},
            success: function (res) {
                console.log(res)
            },
            type: "post",
            dataType: "json"
        })
    });
</script>
</html>
