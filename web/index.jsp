<%--
  Created by IntelliJ IDEA.
  User: 8491389
  Date: 2023-02-25
  Time: 오후 8:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form class="pure-form">
    <form action="/board/mainPage.do" method="get" enctype="application/x-www-form-urlencoded">
        <input type="button" value="메인사이트로 이동" onclick="location.href='http://localhost:10000/board/mainPage.do'"/>
    </form>
</form>
</body>
</html>
