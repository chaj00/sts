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
	<form name="form" method="post" action="board_read.do">
		<table width="400" border="1">
			<tr>
				<td>글번호</td>
				<td><input type="hidden" name="board_no" value="${boardlist.board_no}"/>${boardlist.board_no}</td>
			</tr>
			<tr>
				<td>제목</td>
				<td>${boardlist.title}</td>
			</tr>
			<tr>
				<td>회원아이디</td>
				<td>${boardlist.mem_id }</td>
			</tr>
		
			<tr>
				<td>내용</td>
				<td>${boardlist.text }</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="수정하기" />
					<input type="button" value="삭제하기" onclick="location.href='board_delete.do?board_no=${boardlist.board_no}'"/>
					<input type="button" value="목록보기" onclick="location.href='board_list.do'"/>
				</td>
			</tr>
		</table>
		</form>
	</div>
</body>
</html>









