<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이름 등록 폼</title>
</head>
<body>
	<!--  form의 action= "이동할 파일 경로" method="어떤 방식으로 공개할건지(get은 공개함)" -->
	<form action="process_11_21.jsp" method="post">
		<label for="uname">이름 </label>
		<input type="text" id="name" name="uname">
		<input type="submit" value="등록">
	</form>
</body>
</html>