<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="addressbook.AddrBook"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주소록 목록</title>
<link rel="stylesheet" href="../resources/css/style.css">
</head>
<body>
	<jsp:useBean id="abDAO" class="addressbook.AddrBookDAO" scope="application" />
	<%
		//로그인이 안된 경우 로그인을 하도록 알림 창을 띄움
		String sessionId = null;
		// session.getAttribute("sessionId") != null : 로그인을 한 경우
		if(session.getAttribute("sessionId") != null){
			//세션 가져와서 유지함
			sessionId = (String)session.getAttribute("sessionId");
		}else{
			out.println("<script>");
			out.println("alert('로그인을 해주세요')");
			out.println("location.href='loginForm.jsp'");
			out.println("</script>");
		}
	%>
	
	<div id="container">
		<h2>주소 목록</h2>
		<hr>
		<p>
			<a href="logout.jsp">
				<span class="accent">(<%=session.getAttribute("sessionName") %> 님)</span>[로그 아웃]
			</a>
		</p>
		<table id="tbl_list">
			<thead>
				<tr>
					<th>번호</th>
					<th>이름</th> 
					<th>전화번호</th> 
					<th>이메일</th> 
					<th>성별</th>
					<th>등록일</th>
					<th>보기</th>
				</tr>
			</thead>
			<tbody>
				<%
					/* abDAO.getListAll() : addrList와 같음 */
					for(int i = 0; i < abDAO.getListAll().size(); i++){
						// abDAO.getListAll() 어레이 리스트의 0번째부터 가져온다
						AddrBook addrBook = abDAO.getListAll().get(i);
					
				%>
				<tr>
					<td><%=addrBook.getBnum() %> </td>
					<td><%=addrBook.getUsername() %> </td>
					<td><%=addrBook.getTel() %> </td>
					<td><%=addrBook.getEmail() %> </td>
					<td><%=addrBook.getGender() %> </td>
					<td><%=addrBook.getRegDate() %> </td>
					<td>
						<a href="addrView.jsp?bnum=<%=addrBook.getBnum() %>">
							<button type="button">보기</button>
						</a>
					</td>
					
				</tr>
				<%
					}
				%>
			</tbody>
		</table>
	</div>
</body>
</html>