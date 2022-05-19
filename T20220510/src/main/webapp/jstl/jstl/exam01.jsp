<%@page import="co.test.vo.BookVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="name" value="Amy" />
<c:out value="${name }" />
<br>
<h3>${name }</h3>

<c:remove var="name" />
<c:out value="${name }" />
<br>
<hr>
<%
	BookVO book = new BookVO("2022051001", "The Secret", "Byrne, Rhonda", "Atria Books", 1000);
	request.setAttribute("bookOne", book);
%>

<c:set var="book" value="${bookOne }" />
<c:out value="${bookOne }" />
<br>
<c:out value="${book }" />
<br>

<c:set var="title" value="${bookOne.bookTitle }" />
<c:out value="${title }" /> + ${title }
<br>

<c:set var="author" value="${bookOne.bookAuthor }" />
<c:out value="${author }" /> + ${author }
<br>

<c:set var="publisher" value="${bookOne.bookPress }" />
<c:out value="${publisher }" /> - ${publisher }
<br>

<c:set var="name">Tobey</c:set>
<c:out value="${name }" /> + ${name }
<br>

<%
	BookVO bookTwo = new BookVO("2022051001", "The Secret", "Byrne, Rhonda", "Atria Books", 1000);
	request.setAttribute("bookTwo", book);
%>

<c:set var="title">${bookTwo.bookTitle }</c:set>
<c:out value="${title }" /> + ${title } + ${bookTwo.bookTitle }
<br>

<c:set var="author"><%=bookTwo.getBookAuthor() %></c:set>
<c:out value="${author }"></c:out>
<br>

<a href="examList.jsp">리스트</a>

