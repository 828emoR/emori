<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="co.test.vo.BookVO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
	BookVO book = new BookVO();
%>

<c:set target="<%=book %>" property="bookTitle" value="The Secret" />
<%=book.getBookTitle() %><br>

<h3>
	<c:out value="${b.bookTitle }" />
</h3>

<c:set var="b" value="<%=book %>" />
<c:set target="${b }" property="bookAuthor" value="Byrne, Rhoda" />
<c:out value="${b.bookAuthor }" /><br>
"${b.bookAuthor }"
<br>

<a href="examList.jsp">리스트</a>