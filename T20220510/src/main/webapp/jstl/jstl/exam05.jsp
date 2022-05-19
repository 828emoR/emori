<%@page import="co.test.vo.BookVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
	ArrayList<BookVO> bookList = new ArrayList<>();
	bookList.add(new BookVO("2022050501", "The Secret", "Byrne Rhoda", "Atria Books", 1000));
	bookList.add(new BookVO("2022050502", "The Last Lecture", "Randy Paush", "hyperion", 2000));
	
	String[] bookCode = { "소설", "역사", "인문", "정치", "미술", "종교", "여행", "과학", "만화", "건강" };
%>

<hr>
<c:set var="code" value="<%=bookCode%>" />
<c:forEach var="item" items="${code }">
	<c:out value="${item }" /> or ${item }<br>
</c:forEach>
<br>
<table border="1">
	<c:forEach var="i" begin="1" end="9">
		<tr>
			<c:forEach var="j" begin="2" end="9">
				<td>${j }*${i } = ${i*j }</td>
				<td></td>
			</c:forEach>
		</tr>
	</c:forEach>
</table>
<hr>
<c:forEach var="k" begin="1" end="10" step="2">
	${k }
</c:forEach>
<br>
<c:forTokens items="소설/역사/인문/정치/미술/종교/여행/과학/만화/건강" delims="/" var="token">
	${token }
</c:forTokens>
<br>
<a href="examList.jsp">리스트</a>