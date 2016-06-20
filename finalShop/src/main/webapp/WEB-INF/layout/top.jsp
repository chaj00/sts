<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="/finalShop/resources/common/css/lavalamp_test.css" type="text/css" media="screen">
<script type="text/javascript" src="/finalShop/resources/common/js/jquery-1.2.3.min.js"></script>
<script type="text/javascript" src="/finalShop/resources/common/js/jquery.lavalamp.min.js"></script>
<script type="text/javascript" src="/finalShop/resources/common/js/jquery.easing.min.js"></script>


</head>
<body>
	<div style="margin-left; auto;margin-right:auto;width:1200px">
		<h1 style="float: left;">자바나라 쇼핑몰</h1>

		<div>
			<h5 style="float: right; margin-left: 10px">
			<a href="#">오늘의날씨</a></h5>
			<h5 style="float: right; margin-left: 10px">
			<a href="/finalShop/board_list.do">게시판</a></h5>
			<h5 style="float: right; margin-left: 10px">e-book</h5>
			
			<h5 style="float: right; margin-left: 10px">
			<a href="#">회원가입</a></h5>

					
			<c:choose>
				<c:when test="${user == null}">
					<h5 style="float: right; margin-left: 10px">
						<a href="login.do">로그인</a></h5>
				</c:when>
				
				<c:otherwise>
					<h5 style="float: right; margin-left: 10px">
						님</h5>
					<h5 style="float: right; margin-left: 10px">
						<a href="#">로그아웃</a></h5>
				</c:otherwise>
			</c:choose>
		
		</div>
		<div>
			<ul class="lavaLampNoImage" id="menu">
				<li class="current">
				<a href="prdlist.do">Home</a></li>
				<li><a href="prdlist.do?category_no=CAT000000001">DRESS</a></li>
				<li><a href="prdlist.do?category_no=CAT000000002">TOP</a></li>
				<li><a href="prdlist.do?category_no=CAT000000003">BOTTOM</a></li>
				<li><a href="prdlist.do?category_no=CAT000000004">OUTER</a></li>
				<li><a href="prdlist.do?category_no=CAT000000005">ACC</a></li>
				<li><a href="prdlist.do?category_no=CAT000000006">CARDIGAN</a></li>
			</ul>
		</div>
	</div>
</body>
</html>