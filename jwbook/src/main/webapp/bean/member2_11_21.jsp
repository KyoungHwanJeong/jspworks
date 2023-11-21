<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MemberBean 사용</title>
</head>
<body>
	<jsp:useBean id="member" class="bean.MemberBean" />
	<!--  property= "아이디", name= "객체"를 넣는다 -->
<%-- 	<jsp:setProperty property="id" name="member"/>
	<jsp:setProperty property="name" name="member"/> --%>
	
	<!-- *은 모든 속성을 의미한다 -->
	<jsp:setProperty property="*" name="member"/>
	
	<p>아이디: <jsp:getProperty property="id" name="member"/>
	<p>이름: <jsp:getProperty property="name" name="member"/>
</body>
</html>