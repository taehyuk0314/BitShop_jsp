<%@page import="domain.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="mypage">
<h1>마이페이지</h1>
<%
MemberBean member = (MemberBean)request.getAttribute("member");
%>
<table>
	<tr>
		<th>\</th>
		<th>내용</th>
	</tr>
	<tr>
		<td>ID</td>
		<td><%=member.getId() %></td>
	</tr>
	<tr>
		<td>이름</td>
		<td><%=member.getName() %></td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td><%=member.getPass() %></td>
	</tr>
	<tr>
		<td>주민번호</td>
		<td><%=member.getSsn() %></td>
	</tr>
</table>
</div>