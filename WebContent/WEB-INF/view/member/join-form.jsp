<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="join-form">
	<h1>회원관리</h1>
	<p>회원관리</p>
	<form action="member.do">
		ID <input type="text" name="id"/><br />
		이름 <input type="text" name="name"/> <br />
		비밀번호 <input type="text" name="pass"/> <br />
		주민번호 <input type="text" name="ssn"/> <br />
		<input type="hidden" name="cmd" value="join" />
		<input type="submit" id ="btn" value="JOIN"/>
	</form>
</div>