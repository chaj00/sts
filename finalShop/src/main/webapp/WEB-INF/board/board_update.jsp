<%@page import="board.dto.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=euc-kr">
<title>회원정보수정</title>

<% BoardDTO user = (BoardDTO)request.getAttribute("user"); %>
</head>

<body bgcolor="white" text="black" link="blue" vlink="purple" alink="red">
<form name="form1" method="post" action="board_update.do">

	<jsp:useBean id="now" class="java.util.Date"/>
	<fmt:formatDate value="${now}" pattern="yyMMddkkmm" var="today" />
	
<table align="center" cellpadding="0" cellspacing="0" width="479">
    <tr>
        <td width="469" colspan="2" height="42">
            <p align="center"><code><b><span style="font-size:20pt;">게시물수정</span></b></code></p>
        </td>
    </tr>
    
    <p><code><input type="hidden" name="mod_dtm" value="${today}"/></code></p>
    <tr>
        <td width="479" colspan="2">
            <hr></td>
    </tr>
 
    <tr>
        <td width="104">
            <p><code><b>글번호</b></code></p>
        </td>
        <td width="359">
            <p><code><input type="hidden" name="board_no" value="${boardlist.board_no }" size="30"/>${boardlist.board_no }</code></p>
        </td>
    </tr>
    <tr>
        <td width="104">
            <p><code><b>아이디</b></code></p>
        </td>
        <td width="359">
            <p><code>${boardlist.mem_id }</code></p>
        </td>
    </tr>
   <tr>
        <td width="104">
            <p><code><b>제목</b></code></p>
        </td>
        <td width="359">
            <p><code><input type="text" name="title"  value="${boardlist.title }" size="30"/></code></p>
        </td>
    </tr>
    
    <tr>
        <td width="104">
            <p><code><b>내용</b></code></p>
        </td>
        <td width="359">
            <p><code><textarea name="text" rows="10" cols="50">${boardlist.text }</textarea></code></p>
        </td>
    </tr>
    
    <tr>
        <td width="479" colspan="2">
            <hr>        </td>
    </tr>
    <tr>
        <td width="479" colspan="2">
            <p align="center"><input type="submit" name="formbutton1" value="수정"></p>
        </td>
    </tr>
</table>
</form>
</body>

</html>
