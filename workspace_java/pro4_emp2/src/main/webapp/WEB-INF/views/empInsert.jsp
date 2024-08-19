<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>emp2 사원추가</title>
</head>
<body>
<!-- 8월 19일 -->

<h1>emp2 사원추가</h1>
<!-- 상대주소인 join을 사용했을 때 주소가 어떻게 되는지 확인 필요 -->
<!-- 절대 주소로 바꾼다면 어떻게 적어야 하는가? -->
<form method="post" action="join">
	empno: <input type="text" name="empno"><br>
	ename: <input type="text" name="ename"><br>
	sal: <input type="text" name="sal"><br>
	deptno: <input type="text" name="deptno"><br>
	<input type="submit" value="추가">
</form>

<a href = "/proj4_emp2/join>">추가</a>
<table border=1>
   <tr>
      <th>empno</th>
      <th>ename</th>
      <th>job</th>
      <th>hireDate</th>
      <th>삭제</th>
   </tr>
   
   <c:forEach var="emp" items="${list }">
      <tr>
         <td>${emp.empno }</td>
         <td>${emp.ename }</td>
         <td>${emp.job }</td>
         <td>${emp.hireDate }</td>
         <td><a href="/proj4_emp2/delete?empno=${emp.empno }">삭제</a></td>
      </tr>
   </c:forEach>
   
</table>

</body>
</html>