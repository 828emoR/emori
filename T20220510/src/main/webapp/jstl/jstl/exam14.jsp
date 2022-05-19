<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:set var="now" value="<%=new java.util.Date()%>"></c:set>
Korea:<fmt:formatDate value="${now }" type="both" dateStyle="full" timeStyle="full"></fmt:formatDate><br>

<fmt:timeZone value="en_US">
	USA:
	<fmt:formatDate value="${now }" type="both" dateStyle="full" timeStyle="full" /><br>
</fmt:timeZone>

<fmt:timeZone value="ja_jp">
	JAPAN: <fmt:formatDate value="${now }" type="both" dateStyle="full" timeStyle="full"></fmt:formatDate>
</fmt:timeZone>

<hr>
<br>
<a href="examList.jsp">리스트</a>