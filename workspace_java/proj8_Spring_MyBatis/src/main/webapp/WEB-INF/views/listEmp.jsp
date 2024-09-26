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

${list[0].empno }, ${list[0].ename },<br>
${list[1].empno }, ${list[1].ename },<br>
<hr>

<c:forEach var="employee" items="${list}">
    ${employee.empno}, ${employee.ename}<br>
</c:forEach>


</body>
</html>