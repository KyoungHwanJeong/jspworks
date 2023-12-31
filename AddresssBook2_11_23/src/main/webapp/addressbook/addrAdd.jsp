<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<title>주소 등록 처리</title>
<link rel="stylesheet" href="../resources/css/style.css">

</head>
<body>
	<jsp:useBean id="addrBook" class="addressbook.AddrBook" />
	<jsp:setProperty property="*" name="addrBook" />
	<jsp:useBean id="abDAO" class="addressbook.AddrBookDAO" scope="application" />
	<%
		abDAO.addAddrBook(addrBook);	//주소 추가
	%>
	<div id="container">
	<h2>등록 내용</h2>
		<hr>
		<p>이름: <%=addrBook.getUsername() %> </p>
		<p>전화번호: <%=addrBook.getTel() %> </p>
		<p>이메일: <%=addrBook.getEmail() %> </p>
		<p>성별: <%=addrBook.getGender() %> </p>
	</div>
</body>
</html>