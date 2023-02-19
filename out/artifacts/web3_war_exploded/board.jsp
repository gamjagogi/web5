<%@ page import="shop.mtcoding.web3.model.FakeDao" %>
<%@ page import="shop.mtcoding.web3.model.Board" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String httpMethod = request.getMethod();
    if(httpMethod.equals("POST")){
        response.setContentType("text/html; charset=utf-8");
        out.println("잘못된 요청입니다");
        return;
    }
    Board b1 = new FakeDao().boardData();
%>
<html>
<head>
    <title>Model 1</title>
</head>
<body>
<h1>게시글</h1>
<hr/>
<h3>번호 : <%=b1.getId()%></h3>
<h3>제목 : <%=b1.getTitle()%></h3>
<h3>작성자 번호 : <%=b1.getUserId()%></h3>
</body>
</html>
