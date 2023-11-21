<%@page import="java.util.regex.Pattern"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String num = request.getParameter("num");
    String regex = "[0-9]+";	// 숫자만 입력 받게
    String result = "";			//문자열 변수를 전역 변수로 선언
    /* Pattern.matches(정규표현식, 문자열) */

    if(num == "" || !Pattern.matches(regex, num)){	// 빈 문자 처리, 문자 입력시 오류처리
    	out.println("<script>");
	  	out.println("alert('숫자를 입력해주세요')");
	  	out.println("history.back()");	// 이전 페이지로 이동
	 	out.println("</script>");  
    }else{
    	int n = Integer.parseInt(num);	// 문자를 숫자로 변환
    	if(n % 2 == 0){
    		result="짝수";
    	}else if(n % 2 == 1){
    		result="홀수";
    	}else{
    		result="null";
    	}
        out.println("결과는 " + result + "입니다.");
    }
    
    %>
