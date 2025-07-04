


<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page session="true" %>
<%
    String userId = (String) session.getAttribute("userId");
    if (userId == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<h2><%= userId %>님 환영합니다!</h2>
<a href="logout">로그아웃</a>