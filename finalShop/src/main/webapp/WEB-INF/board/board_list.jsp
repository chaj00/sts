<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*,board.dto.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">�Խ���</h1>
	
	<hr/>
	<form name="form" method="post" >
	<table align="center" border="1" width="600">
		<tr bgcolor="skyblue">
			<th>��ȣ</th>
			<th>����</th>
			<th>�ۼ���</th>
			<th>�������</th>
			<th>��ȸ��</th>
		</tr>
		<c:forEach var="i" begin="0" end="${fn:length(boardlist)}" step="1">
			<tr>
				<td>${boardlist[i].board_no}</td>
				<td>${boardlist[i].title}</td>
				<td>${boardlist[i].mem_id}</td>
				<td>${boardlist[i].reg_dtm}</td>
				<td>${boardlist[i].count}</td>
			</tr>
		</c:forEach>
	</table>
	<tr>
        <td width="479" colspan="2">
           <p align="center" ><input type="button" value="�۾���" onclick="location.href='board_insert.do'"/></p>
        </td>
    </tr>
	</form>
</body>
</html>










