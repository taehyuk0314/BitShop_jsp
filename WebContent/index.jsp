<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>그룹웨어</title>
<style>
@charset "UTF-8";
#title {width : 150px; height :50px; 
				margin: 0 auto; color: #555; margin-top: 100px}
#login-outer-tab {width : 80%; margin: 0 auto; margin-top: 50px; 
				text-align: center}				
#login-inner-tab tr{border: 1px solid gray}
#login-inner-tab tr td{border: 1px solid gray}
#login-inner-tab {width: 300px; margin: 0 auto;border: 1px solid gray}
#userid-input {width: 190px; height: 45px}
#password-input {width: 190px; height: 45px}
#login-btn {width: 100px; height: 100px}
</style>
</head>
<body>
<div style="width: 100%">
<section>
<article>
	<h1 id="title">회원 전용 시스템</h1>
	<table id ="login-outer-tab">
		<tr>
			<td colspan="5">
				<form id="login-form" action="member.do">

					<table id="login-inner-tab">
						<tr>
							<td><input id="userid-input" name="id"
									type ="text" value="aa" placeholder="ID" tabindex="1" />
							</td>
							<td rowspan="2">
								<button id="login-btn">LOGIN</button>
							</td>
						</tr>
						<tr>
							<td><input id="password-input" name="pass"
								type="password" value="aa" placeholder="PASSWORD" tabindex="2"/>
								<input type="hidden" name="cmd" value="login" />
								<input type="hidden" name="dir" value="home" />
							</td>
						</tr>
					</table>
				
				</form>
				<a id="admin-link" href="#">관리자</a>
				<a id="join-link" href="#">회원가입</a>
			</td>
		</tr>
	
	</table>
</article>
</section>
</div>
</body>
</html>
