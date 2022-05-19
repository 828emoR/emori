<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:set var="now" value="<%=new java.util.Date() %>"></c:set>
<fmt:formatDate type="time" value="${now }"></fmt:formatDate><br>
<fmt:formatDate type="date" value="${now }"></fmt:formatDate><br>
<fmt:formatDate type="both" value="${now }"></fmt:formatDate><br>
<fmt:formatDate type="both" dateStyle="short" timeStyle="short" value="${now }"></fmt:formatDate><br>
<fmt:formatDate type="both" dateStyle="medium" timeStyle="medium" value="${now }"></fmt:formatDate><br>
<fmt:formatDate type="both" dateStyle="long" timeStyle="long" value="${now }"></fmt:formatDate><br>
<fmt:formatDate pattern="yyyy-MM-dd" value="${now }"></fmt:formatDate><br>

<fmt:parseDate value="2021-05-05 11:23:45" pattern="yyyy-MM-dd HH:mm:ss" var="date"></fmt:parseDate>
<p>${date }</p>
<br>
<a href="examList.jsp">리스트</a>