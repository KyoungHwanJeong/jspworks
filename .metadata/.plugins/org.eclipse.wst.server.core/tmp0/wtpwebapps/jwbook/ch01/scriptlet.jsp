<%-- 스크립트릿 사용하기 --%>
<!-- 스크립트릿 사용하기 -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립트릿 태그</title>
</head>
<body>
	<!-- 자바 영역 -->
	<!-- 스크립트릿 사용하기 -->
	<%-- 스크립트릿 사용하기 --%>
	<h2>html에서 jsp 사용하기</h2>
	<%
		int n1 = 10, n2 = 20;
		// 내장 객체 - out.println() 함수 사용
		out.println("두 수의 곱: " + (n1*n2));
		
		//1부터 10까지 자연수 중에 짝수 출력
		out.println("<br>1부터 10까지 자연수중 짝수 출력<br>");
		for(int i=1; i<=10; i++){
			
			if(i%2==0){
				out.println(i);
			}
		}
	%>
	<!-- 출력문(서버측이므로 클라에서는 자바 계산식이 안보인다) -->
	<h3>합계: <%=n1+n2 %> </h3>
</body>
</html>