<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String name = request.getParameter("name");
    String id = request.getParameter("id");
    String pass = request.getParameter("pass");
    String ssn = request.getParameter("ssn");
    String heigh = request.getParameter("heigh");
    String weight = request.getParameter("weight");
    String year= ssn.substring(0,2);
    String month = ssn.substring(2,4);
    String day = ssn.substring(4,6);
    String gender = "";
    switch(ssn.charAt(7)){
    case '1' : case '3':
    	gender = "남자";
    	break;
    case'2': case'4':
    	gender = "여자";
    	break;
    case'5' : case '6':
    	gender = "외국인";
    	break;
    default :
    	gender ="잘못된입력입니다";
    	break;
    }
    String bmi ="";
    double t = Double.parseDouble(heigh);
    double w = Double.parseDouble(weight);
    double res = w/((t*t)/10000);
    if(res>=40){
    	bmi = "고도비만";
    }else if(res>=35){
    	bmi = "중도비만";
    }else if(res>=30){
    	bmi = "경도비만";
    }else if(res>=25){
    	bmi = "과체중";
    }else if(res>=18.5){
    	bmi = "정상";
    }else{
    	bmi ="저체중";
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head><body>89
<form action="login-form.jsp">
<h3>가입한 ID : <%=id %></h3><br />
<h3>가입한 이름은 : <%=name %></h3><br />
<h3>가입한 비밀번호 : *******</h3><br />
<h3>생년월일 : <%=year %>년<%= month %> 월<%=day %> 일생</h3><br />
<h3>성별<%= gender %></h3><br />
<h3>BMI : <%= bmi %></h3><br />
<a href="login-form.jsp">로그인으로 이동</a>
<a href="../index.jsp">홈으로 이동</a>
</form>
</body>
</html>