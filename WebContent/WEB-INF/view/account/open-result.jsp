<%@page import="domain.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
				<div id="open-result">
			<%
			AccountBean acc = (AccountBean)request.getAttribute("account");
			String accNum = acc.getAccountNum();
			String money = String.valueOf(acc.getMoney());
			String today = acc.getToday();
			%>
					<h1>성공적으로 개설되었습니다</h1><br />
					<h3>계좌번호:<%= accNum %></h3><br />	
					<h3>잔액:<%= money %></h3><br />
					<h3>개설일:<%= today %></h3><br />
				<a href="account.do"><input type="submit" name="btn" value="확 인" /></a>
				
				</div>
