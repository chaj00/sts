<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
.main{
	text-align: center;
}
</style>
</head>
<body>
	<div class="main">
		<h1>자바나라</h1>
		<hr />
		<%if( session.isNew()==false){ %>
			<h3> ${user.name}(${user.id})님 로그인 성공</h3>
		<%} %>
		<img alt="" src="/mySecondPro/images/jang1.jpg" width="500" height="600">
	</div>
</body>
</html>