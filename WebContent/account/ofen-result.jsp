<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%
    String name = request.getParameter("name");
    String accountNum = "";
    Random random = new Random();
    for(int i=0;i<8;i++){
    	if(i!=3){
    		accountNum +=random.nextInt(10);
    	}else{
    		accountNum += random.nextInt(10)+"-";
    	}
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3><%=name %>님의 계좌번호는 <%=accountNum %>입니다 </h3>
</body>
</html>