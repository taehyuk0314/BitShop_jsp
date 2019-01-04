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
                        <li><a href="article.do"><font style="color:red;">게시판</font></a></li>
                        <li><a href="admin.do">관리자</a></li>
                    </ul>
		</td>
	</tr>
	<tr  style="height: 300px">
		<td id="side-menu">
		<table>
			<tr>
				<td style="font-size:30px">게시판</td>
			</tr>
			<tr>
				<td>글쓰기</td>
			</tr>
			<tr>
				<td>게시판 글</td>
			</tr>
			<tr>
				<td>작가 찾기</td>
			</tr>
			<tr>
				<td>제목 찾기</td>
			</tr>
			<tr>
				<td>글 수</td>
			</tr>
			<tr>
				<td>작가 로그인</td>
			</tr>
			<tr>
				<td>내용 수정</td>
			</tr>
			<tr>
				<td>글 삭제</td>
			</tr>
		</table>
		</td>
		<td></td>
	</tr>
</table>
</body>
</html>