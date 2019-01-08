<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@include file="../home/head.jsp" %>
<body>
<table id="wrapper">
	<tr>
		<td colspan="2">
			<%@include file="../home/header.jsp" %>
		</td>
	</tr>
	<tr>
		<td colspan="2">
		<%@include file="../home/navi-bar.jsp" %>
		</td>
	</tr>
	<tr  style="height: 300px">
		<td style="width: 30%">
		
		<%
		String dest = String.valueOf(request.getAttribute("dest"));
		if(dest.equals("join-form")){
			%>
			<%@include file ="side-join.jsp" %>
			<% 	
		}else{
			%>
			<%@include file = "side-menu.jsp" %>
			<%}
		%>
		</td>
		<td>
		<%
		dest =String.valueOf(request.getAttribute("dest"));
		switch(dest){
		case"NONE": case"mypage":
			%>
			<%@ include file="mypage.jsp" %>
			<% 
			break;
		case"join-form":
			%>
			<%@ include file="join-form.jsp" %>
			<% 
			break;
		
		}
		%>
		</td>
	</tr>
		<tr style="height: 100px">
	<td colspan="2"></td>
	</tr>
</table>
</body>
</html>