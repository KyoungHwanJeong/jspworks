<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>다중 선택 처리</title>
</head>
<body>
	<form action="process2_11_22.jsp" method="post">
		<p>
			<!-- <label> : 글자를 선택해도 선택 되게 함, 메뉴를 선택하면 value가 출력된다  -->
			<label>오렌지
				<input type="checkbox" name="fruit" value="orange">
			</label>
			<label>사과
				<input type="checkbox" name="fruit" value="apple">
			</label>
			<label>바나나
				<input type="checkbox" name="fruit" value="banana">
			</label>
			
			<input type="submit" value="선택">
		</p>
	</form>
		
</body>
</html>