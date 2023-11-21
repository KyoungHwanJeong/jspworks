<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제곱을 계산하는 프로그램 사용</title>
</head>
<body>
	<!-- jsp:useBean id="객체 이름" class="클래스 경로" -->
	<!-- Java Beans (자바 클래스를 의미한다)
		1. java.io.Serializable 인터페이스를 구현해야 한다(현상태를 저장, 버전을 만들어서 관리한다)
		2. 기본생성자로 사용
		3. 모든 멤버는 private 접근 제어자 사용
		4. getter/setter 메서드를 사용함
	 -->
	<!-- Calcuator calc = new Calculator() -->
	<jsp:useBean id="calc" class="bean.Calculator"></jsp:useBean>
	
	<%
		int num = calc.calculate(5);
		out.println("결과: " + num);
	%>
</body>
</html>