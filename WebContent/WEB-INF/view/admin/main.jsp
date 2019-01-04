<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
                    <ul id="navi-bar">
                        <li><a href="home.do">홈</a></li>
                        <li><a href="member.do">회원관리</a></li>
                        <li><a href="account.do">계좌관리</a></li>
                        <li><a href="article.do">게시판</a></li>
                        <li><a href="admin.do"><font style="color:red;">관리자</font></a></li>
                    </ul>
		</td>
	</tr>
	<tr  style="height: 300px">
		<td id="side-menu">
		<table>
			<tr>
				<td style="font-size:30px;">관리자메뉴</td>
			</tr>
			<tr>
				<td>관리자생성</td>
			</tr>
			<tr>
				<td>관리자리스트</td>
			</tr>
			<tr>
				<td>관리자직책찾기</td>
			</tr>
			<tr>
				<td>관리자이름찾기</td>
			</tr>
			<tr>
				<td>관리자 수</td>
			</tr>
			<tr>
				<td>관리자 로그인</td>
			</tr>
			<tr>
				<td>관리자 승진</td>
			</tr>
			<tr>
				<td>관리자 빠염</td>
			</tr>
		</table>
		</td>
		<td></td>
	</tr>
</table>
</body>
</html>