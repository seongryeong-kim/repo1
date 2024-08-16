<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	%>
<%@ page import = "java.util.List" %>
<%@ page import = "emp2.dto.EmpDTO" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border=1>
		<tr>
			<th>empno</th>
			<th>ename</th>
			<th>job</th>
			<th>hireDate</th>
		</tr>

		<!-- Emp2SErvelet getAttribute에서 보낸 list -->
<!-- 		list에서 빼서 emp에 저장, 뭔지 모르지만 빼온다 -->
		<c:forEach var="emp" items="${list }">
		<tr>
			<td>${emp.empno }</td> <%-- empno에 해당하는 getEmpno호출 --%>
			<td>${emp.ename }</td>
			<td>${emp.job }</td>
			<td>${emp.hiredate }</td>
		</tr>
		</c:forEach>
		<%
		List<EmpDTO> list = (List)request.getAttribute("list");
// 		for(int i=0;i<list.size();i++){
// 			EmpDTO dto = (EmpDTO)list.get(i);
			
// 			int empno = dto.getEmpno();
// 			out.print(empno + ", ");
// 		}

		for( EmpDTO dto : list ){
			int empno = dto.getEmpno();
 			out.print(empno + ", ");
		}
		
		%>
	</table>
</body>
</html>