<%--
  Created by IntelliJ IDEA.
  User: sy03
  Date: 2017/2/6
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="poolConfig/jquery-1.11.3.min.js"></script>
</head>
<body>
正在跳转...
<script>

    $.get("user",function (data) {
        
        
    });
                $.ajax({
                    type: "GET",
                    url: "demo/map",
                    dataType : 'json',
                    success: function (data) {
                        console.log(data);
                        var errorCode = data.errorCode;
                        console.log(errorCode);
                        var status = data.status;

                        <%--if (errorCode == "9999") {--%>
                            <%--window.location.href = "${errorUrl}";--%>
                        <%--}--%>
                        <%--if (status == "2") {--%>
                            <%--window.location.href = "${returnUrl}";--%>
                        <%--} else {--%>
                            <%--window.location.href = "${errorUrl}";--%>
                        <%--}--%>
                    }
                });

</script>
</body>
</html>
