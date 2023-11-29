<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <jsp:useBean id="abDAO" class="addressbook.AddrBookDAO" scope="application"/>  
<%
	String username = request.getParameter("username");
	abDAO.deleteAddrBook(username);
	
	//response.sendRedirect():JSP 페이지에서 특정한 작업을 수행한 후 
	//						지정한 페이지로 이동하고 싶은 경우
	//페이지 이동(redirect - 리다이렉트)
	response.sendRedirect("addrList.jsp");
	
%>