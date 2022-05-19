<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:url value="exam08.jsp" var="page">
  <c:param name="id" value="guest" />
  <c:param name="pwd" value="1004" />
</c:url>

<c:redirect url="${page }"></c:redirect>
<br>
<a href="examList.jsp">리스트</a>