<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>List Page</h1>

	${ list1 }
	<hr>
	${ list1[0] }
	<hr>
	${ list1[0].title }
	<hr>
	${ list1[0]["title"] }
	<hr>
	123${null }456
	<hr>
	<style>
		<!--div{
			border: 1px solid red;
			padding: 10px;
			margin: 10px; 
		}-->
		
		<!--#teacher{
		border: 1px solid blue;
			padding: 10px;
			margin: 10px; 
		}-->
	</style>
	<div>
		제목: ${ list1[0].title },시간 : ${ list1[0].dueDate }
	</div>
	<div>
		제목: ${ list1[1].title },시간 : ${ list1[1].dueDate }
	</div>
	<hr>
	
	<c:forEach var="todo" items="${list1}">
	<div>
	<input type="checkbox">
		${todo.tno} ${todo.title } ${todo.dueDate } 
	</div>
	</c:forEach>

	<c:forEach var="todoDTO" items="${list1 }">
		<div id="teacher">
	선생님이랑<br> 
	 	제목: <a href="/pro3_todo/todo/read?tno=${todoDTO.tno }" >${todoDTO.title }</a>, 시간: ${todoDTO.dueDate }
		</div>
	</c:forEach>	
	
</body>
</html>