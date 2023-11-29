<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산 결과</title>
</head>
<body>
	<h2>계산 결과</h2>
	<hr>
	<!-- ${result} : 값을 받을 때 el언어로 받으면 주소가 바뀌지 않는다 -->
	<p>계산 결과: ${result}
</body>
</html>