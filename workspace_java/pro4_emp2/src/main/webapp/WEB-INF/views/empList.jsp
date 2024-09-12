<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="java.util.*"
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

<div style="text-align: right;">

	<c:if test="${not empty loginDTO }">
	%{loginDTO.ename}님 환영합니다
	</c:if>
	<c:if test="${empty loginDTO }">
		<a href="login.jsp">로그인</a>
	</c:if>
	
</div>

	<table border=1>
		<tr>
			<th>rnum</th>
			<th>empno</th>
			<th>ename</th>
			<th>job</th>
			<th>hireDate</th>
		</tr>

		<!-- Emp2SErvelet getAttribute에서 보낸 list -->
<!-- 		list에서 빼서 emp에 저장, 뭔지 모르지만 빼온다 -->
		<c:forEach var="emp" items="${list }">
		<tr>
			<td>${emp.rnum }</td> 
			<td>${emp.empno }</td> <%-- empno에 해당하는 getEmpno호출 --%>
			<td>${emp.ename }</td>
			<td>${emp.job }</td>
			<td>${emp.hiredate }</td>
		</tr>
		</c:forEach>
	</table>
<%
	Map map = (Map)request.getAttribute("map");
	int totalCount = (int)map.get("totalCount");
	
	String str_countPerPage = (String)request.getAttribute("countPerPage");
	int countPerPage = Integer.parseInt(str_countPerPage);
	
	String str_pageNo = (String)request.getAttribute("page");
	int pageNo = Integer.parseInt(str_pageNo);
	
	// 17/10 계산하려고 하나를 더블로 형변환 해줌 
	// 전체 나누기 한페이지 당 개수 그리고 올림 처리 하면 페이지 마지막 번호가 나온다 
	int lastPage = (int)Math.ceil( (double)totalCount / countPerPage) ;
	
	//한번에 보여줄 페이지의 개수
	int countPerSection = 3; 
	//페이지 섹션 위치
	int position = (int)Math.floor( (double)pageNo / countPerSection);
	int sec_first = ((position*1) * countPerSection ) + 1;
	int sec_last = (position + 1) * countPerSection;
	
%>

<c:set var="lastPage2" value="<%= lastPage %>" scope="page"/>
	
이전 

<%-- <c:forEach var="i" begin="1" end="${ lastPage2}"> --%>
<c:forEach var="i" begin="<%=sec_first %>" end="<%=sec_last %>"> 
	[<a href="page?page=${i}">1</a>]
</c:forEach> 
<!-- [<a href="page?page=2"><strong>2</strong></a>]  -->

다음	
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
</body>
</html>