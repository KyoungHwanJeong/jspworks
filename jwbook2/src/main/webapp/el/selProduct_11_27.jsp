<%@ page import="el.Product_11_27" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 선택(장바구니)</title>
<style>
	#container{width: 80%; margin: 30px auto; text-align: center;}
</style>
</head>
<jsp:useBean id="product" class="el.Product_11_27" />
<%-- <%
	Product product = new Product(); 
%> --%>
<body>
	<div id="containger">
		<h2>상품 선택</h2>
		<hr>
		<p>선택한 상품: ${param. select}
		<p>num1 + num2 = ${product.num1 + product.num2}
		<%-- <p>num1 + num2 = <%= product.getNum1() + product.getNum2() %> --%>
	</div>
</body>
</html>