<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
	<jsp:useBean id="now" class="java.util.Date"/>
	<fmt:formatDate value="${now}" pattern="yyMMddkkmm" var="today" />
</head>
<body bgcolor="white" text="black" link="blue" vlink="purple" alink="red">
<form name="form1" method="post" action="board_insert.do">
<table align="center" cellpadding="0" cellspacing="0" width="479">

	
    <tr>
        <td width="469" colspan="2" height="42">
            <p align="center"><code><b><span style="font-size:20pt;">게시물작성</span></b></code></p>
        </td>
    </tr>
    <tr>
        <td width="479" colspan="2">
            <hr></td>
    </tr>
    
 	 <p><code><input type="hidden" name="reg_dtm" value="${today}"></code></p>
    <tr>
        <td width="104">
            <p><code><b>제목</b></code></p>
        </td>
        <td width="359">
            <p><code><input type="text" name="title" size="30"></code></p>
        </td>
    </tr>

    <tr>
        <td width="104">
            <p><code><b>아이디</b></code></p>
        </td>
        <td width="359">
            <p><code><input type="text" name="mem_id" size="30"></code></p>
        </td>
    </tr>

 
    <tr>
        <td width="104">
            <p><code><b>내용</b></code></p>
        </td>
        <td width="359">
            <p><textarea name="text" rows="10" cols="50"></textarea></p>
        </td>
    </tr>
   
   
    <tr>
        <td width="479" colspan="2">
            <hr>        </td>
    </tr>
    <tr>
        <td width="479" colspan="2">
            <p align="center"><input type="submit" name="formbutton1" value="작성"></p>
        </td>
    </tr>


</table>
</form>
</body>
</html>