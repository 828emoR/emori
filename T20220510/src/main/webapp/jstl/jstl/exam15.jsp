<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<sql:query var="rs" dataSource="jdbc/myoracle">
	select * from book_info order by 1
</sql:query>

<table border="1">
	<tr>
		<c:forEach var="columnName" items="${rs.columnNames }">
			<th>
				<c:out value="${columnName }" />
			</th>
		</c:forEach>
	</tr>
	<c:forEach var="row" items="${rs.rows }">
		<tr>
			<td>${row.book_code }</td>
			<td>${row.book_title }</td>
			<td>${row.book_author }</td>
			<td>${row.book_press }</td>
			<td>${row.book_price }</td>
		</tr>
	</c:forEach>
</table>
<br>
<a href="examList.jsp">리스트</a>