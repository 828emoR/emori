<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="exam05.jsp" var="url"></c:import>
===== import 파일 내용 ====
<p>${url }
<br>
<a href="examList.jsp">리스트</a>