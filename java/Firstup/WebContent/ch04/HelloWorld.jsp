<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>ch03 : HelloWorld</title>
</head>
<body>
<div align="center">
    <h2>HelloWorld! : 헬로월드</h2>
    <%-- JSP 표현식으로 자바의 Date 클래스를 이용한 현재 날짜 시간 출력 --%>
    현재 날짜와 시간은 : <%= new java.util.Date() %>
</div>
</body>
</html>