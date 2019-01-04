	<%@ page language="java" contentType="text/html; charset=UTF-8"
	    pageEncoding="UTF-8"%>
	   <%@ page import="domain.*" %>
	<!DOCTYPE html>
	<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="<%=application.getContextPath()%>/resources/css/style.css" />
	</head>
	<body>
	<table id="wrapper">
		<tr>
			<td colspan="2">
				<h1>비트 쇼핑몰</h1>
			</td> 
		</tr>
		<tr>
			<td colspan="2">
	                    <ul class="nevi-bar">
	                        <li><a href="home.do">홈</a></li>
	                        <li><a href="member.do">회원관리</a></li>
	                        <li><a href="account.do"><font style="color:red;">계좌관리</font></a></li>
	                        <li><a href="article.do">게시판</a></li>
	                        <li><a href="admin.do">관리자</a></li>
	                    </ul>
			</td>
		</tr>
		<tr  style="height: 300px">
			<td id="side-menu">
			<table>
				<tr>
					<td><font style="color:red">계좌개설</font></td>
				</tr>
				<tr>
					<td>계좌목록</td>
				</tr>
				<tr>
					<td>계좌검색(이름)</td>
				</tr>
				<tr>
					<td>계좌검색(계좌번호)</td>
				</tr>
				<tr>
					<td>총계좌수</td>
				</tr>
				<tr>
					<td>계좌번호체크</td>
				</tr>
				<tr>
					<td>입금</td>
				</tr>
				<tr>
					<td>출금</td>
				</tr>
				<tr>
					<td>계좌삭제</td>
				</tr>
			</table>
			</td>
			<td>
			<%
			AccountBean acc = (AccountBean)request.getAttribute("account");
			String accNum = acc.getAccountNum();
			String money = String.valueOf(acc.getMoney());
			String today = acc.getToday();
			%>
				<div>
					<h1>성공적으로 개설되었습니다</h1><br />
					<h3>계좌번호:<%= accNum %></h3><br />	
					<h3>잔액:</h3><%= money %><br />
					<h3>개설일:<%= today %></h3><br />
				<a href="account.do"><input type="submit" name="btn" value="확 인" /></a>
				
				</div>
			</td>
		</tr>
	</table>
	</body>
	</html>