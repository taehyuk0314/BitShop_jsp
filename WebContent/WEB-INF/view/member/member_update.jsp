<%@page import="domain.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="member-detail">
<h1>비밀번호 수정</h1>
<%
MemberBean member = (MemberBean)session.getAttribute("member");
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
		<td>
		현재 비밀번호 <input type="text" name ="corrPass" />
		수정할 비밀번호 <input type="text" name="changePass"/>
		</td>
	</tr>
	<tr>
		<td>주민번호</td>
		<td><%=member.getSsn() %></td>
	</tr>
</table>
</div>