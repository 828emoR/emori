<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri= "http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="ko" />
<fmt:bundle basename="co.test.bundle.msg">
  <fmt:message key="id" />
  <fmt:message key="greeting" />
</fmt:bundle>
<br>
<a href="examList.jsp">리스트</a>