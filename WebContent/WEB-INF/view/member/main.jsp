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
                        <li><a href="member.do"><font style="color:red;">회원관리</font></a></li>
                        <li><a href="account.do">계좌관리</a></li>
                        <li><a href="article.do">게시판</a></li>
                        <li><a href="admin.do">관리자</a></li>
                    </ul>
		</td>
	</tr>
	<tr  style="height: 300px">
		<td id="side-menu">
		<table>
			<tr>
				<td style="font-size:30px">회원정보</td>
			</tr>
			<tr>
				<td>회원가입</td>
			</tr>
			<tr>
				<td>회원리스트</td>
			</tr>
			<tr>
				<td>회원이름찾기</td>
			</tr>
			<tr>
				<td>회원아이디찾기</td>
			</tr>
			<tr>
				<td>회원 수</td>
			</tr>
			<tr>
				<td>로그인</td>
			</tr>
			<tr>
				<td>비밀번호변경</td>
			</tr>
			<tr>
				<td>회원탈퇴</td>
			</tr>
		</table>
		</td>
		<td></td>
	</tr>
</table>
</body>
</html>