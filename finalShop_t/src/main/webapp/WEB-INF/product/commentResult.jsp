<%@page import="product.dto.ProductCommentResultDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script
	src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/392/Chart.min.js"></script>
</head>
<body>
	<%
		List<ProductCommentResultDTO> resultList = (List<ProductCommentResultDTO>) request
				.getAttribute("resultList");
	%>
	<div style="float: left;">
		<h3>��ǰ�� �м�</h3>
		<table border="1">
			<tr>
				<td>��ȣ</td>
				<td>������ Ű����</td>
				<td>Ƚ��</td>
			</tr>
			<%
				for (int i = 0; i < resultList.size(); i++) {
					ProductCommentResultDTO result = resultList.get(i);
			%>
			<tr>
				<td><%=result.getNum()%></td>
				<td><%=result.getContent()%></td>
				<td><%=result.getCount()%></td>
			</tr>
			<%
				}
			%>
		</table>
	</div>
	<img src="/shop/resources/images/wordcloud.png"/>
</body>
</html>