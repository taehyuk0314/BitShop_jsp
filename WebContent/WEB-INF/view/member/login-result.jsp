<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
    String id = request.getParameter("id");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 성공</h1>
	<h3><%=id %>님 환영합니다</h3>
	<a href="account/main.jsp">계좌생성</a><br />	
	<a href="../index.jsp">홈으로이동</a><br />
</body>
</html>