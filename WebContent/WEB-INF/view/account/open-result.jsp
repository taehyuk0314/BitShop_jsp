<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="open-result">
		<h1 style="font-size: 40px; color: #888" >  성공</h1>
		<%@ include file="content.jsp" %>
		<form action="account.do">
		<input type="hidden" name="dir" value="account"/>
		<input type="submit" id="btn" value="확인" />
		</form>
</div>