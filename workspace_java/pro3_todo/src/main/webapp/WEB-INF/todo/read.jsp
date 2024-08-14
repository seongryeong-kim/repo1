<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	dto.tno: ${dto.tno }<br>
	dto.title: ${dto.title }<br>
	dto.dueDate: ${dto.dueDate }<br>
	dto.finished: ${dto.finished }<br>
	
	<a href="/pro3_todo/todo/list">목록 바로가기</a>
	
	<form method="post" action="remove">
		<input type="hidden" name="tno" value=" ${dto.tno }">
		<input type="submit" value="삭제">
	</form>
	
<a href="/pro3_todo/todo/modify?tno=${dto.tno}">수정</a> 
</body>
</html>