<%@ page import="shop.mtcoding.web3.model.User" %>
<%@ page import="shop.mtcoding.web3.model.FakeDao" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    User u1 = new FakeDao().userData();
%>
<html>
<head>
    <title>Model 1</title>
</head>
<body>
    <h1>유저</h1>
    <hr/>
    <h3>번호 : <%=u1.getId()%></h3>
    <h3>유저명 : <%=u1.getUsername()%></h3>
    <h3>비밀번호 : <%=u1.getPassword()%></h3>
</body>
</html>
