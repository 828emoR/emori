<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="co.test.vo.BookVO" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>result/listOutput.jsp</title>
</head>
<body>
<c:choose>
	<c:when test="${empty all }"><h3>도서정보가 없습니다.</h3></c:when>
	<c:otherwise>
		<table border="1">
       		<thead><tr><th>도서코드</th><th>도서명</th><th>도서저자</th><th>도서출판사</th><th>도서가격</th></tr></thead>
      	 <tbody>
        	<c:forEach items="${all }" var="book">
        	<tr>
        	<td>${book.bookCode }</td>
        	<td>${book.bookTitle }</td>
        	<td>${book.bookAuthor }</td>
        	<td>${book.bookPress }</td>
        	<td>${book.bookPrice }</td>
        	</tr>
        	</c:forEach>
        </tbody>
    </table>
</c:otherwise>
</c:choose>
 <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>
</body>
</html>