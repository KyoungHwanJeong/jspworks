<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- 에러날 가능성이 있는 곳에다 출력할 페이지 이름을 넣는다 -->
<%@ page errorPage="error_page_11_20.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에러가 있는 페이지</title>
</head>
<body>
	<%
		String str = null;
		//코드 오류 발생
		out.println(str.toString());
	%>
</body>
</html>