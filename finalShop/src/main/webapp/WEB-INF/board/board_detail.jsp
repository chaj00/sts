<%@page import="board.dto.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<form name="form" method="post" action="read.do">
		<table width="400" border="1">
			<tr>
				<td>�۹�ȣ</td>
				<td><input type="text" name="board_no" value="" readonly="readonly"/></td>
			</tr>
			<tr>
				<td>����</td>
				<td><input type="text" name="title" value=""/></td>
			</tr>
			<tr>
				<td>ȸ�����̵�</td>
				<td><input type="text" name="mem_id" value="" readonly="readonly"/></td>
			</tr>
		
			<tr>
				<td>����</td>
				<td><input type="text" name="text" value="" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="�����ϱ�" />
					<input type="button" value="�����ϱ�" onclick="location.href='boad_delete.do?board_no='"/>
					<input type="button" value="��Ϻ���" onclick="location.href='board_list.do'"/>
				</td>
			</tr>
		</table>
		</form>
	</div>
</body>
</html>









