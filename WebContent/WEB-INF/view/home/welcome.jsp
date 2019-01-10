<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="domain.MemberBean" %>
<%
MemberBean user = (MemberBean)request.getAttribute("member");
%>
	<%=user.getName() %>
	<a href="member.do?cmd=logout">로그아웃</a>