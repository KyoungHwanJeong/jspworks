<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//invalidate() : 삭제 함수
	//모든 세션 삭제 - 로그 아웃
	session.invalidate();

	// 로그아웃 후 인덱스로 이동
	response.sendRedirect("../index.jsp");
%>