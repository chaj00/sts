<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div id="header">
		<tiles:insertAttribute name="header"/>
	</div>
	
	<div id="content1">
		<tiles:insertAttribute name="content1"/>
	</div>
	
	<div id="content2">
		<tiles:insertAttribute name="content2"/>
	</div>
</body>
</html>