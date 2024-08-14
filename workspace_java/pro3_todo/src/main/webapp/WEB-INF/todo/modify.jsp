<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>할 일 수정</title>
</head>
<body>
	<a href="/pro3_todo/todo/list">목록 바로가기</a>

<form id="form1" action="/todo/modify" method="post">
</form>
  tno: ${dto.tno }<br>
	dto.title: ${dto.title }<br>
	dto.dueDate: ${dto.dueDate }<br>
	dto.finished: ${dto.finished }<br>
	
	
	
	<c:if test="${dto.finished }">
		<input type="radio" name="finished" value="N">미완료
		<input type="radio" name="finished" value="Y" checked="checked">완료
	</c:if>
	
	<c:if test="${not dto.finished }">
		<input type="radio" name="finished" value="N">미완료
		<input type="radio" name="finished" value="Y" checked="checked">완료
	</c:if>
	
	<br>
	
	<input type="hidden" name="tno" value=" ${dto.tno }">
	<input type="submit" value="수정">
	</form> 
	
</body>
</html>