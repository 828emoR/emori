<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="num" value="${80 }" />
점수
<c:out value="${num }" />
은
<c:if test="${num gt 60 }">
	합격입니다.
</c:if>
<c:if test="${num lt 60 }">
	불합격입니다.
</c:if>
<br>
점수
<c:out value="${num }" />
은
<c:choose>
	<c:when test="${num>=90 }">A point</c:when>
	<c:when test="${num>=80 }">B Point</c:when>
	<c:when test="${num>=70 }">C Point</c:when>
	<c:when test="${num>=60 }">D Point</c:when>
	<c:otherwise>F Point</c:otherwise>
</c:choose>
<br>
<a href="examList.jsp">리스트</a>