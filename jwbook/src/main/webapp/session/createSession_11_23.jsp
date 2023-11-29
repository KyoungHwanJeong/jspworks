<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- page session= "true"이면 실행 "false"면 실행되지 않음 -->
<%@ page session="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 생성</title>
</head>
<body>
	<h2>세션 생성</h2>
	<!-- session: 내장 객체이다(embedded) -->
	<p>세션 : <%=session %> </p>
	<!-- JSESSIONID : 세션 아이디 -->
	<p>세션 아이디: <%=session.getId() %></p>
</body>
</html>