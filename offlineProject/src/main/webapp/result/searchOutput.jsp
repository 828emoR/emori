<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>searchOuput.jsp</title>
</head>
<body>

	<h3>조회완료</h3>
	 	<c:if test="${!empty result }"><h4>${result }</h4></c:if>
 		<c:if test="${!empty user }">
 
 </c:if>
    <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>
</body>
</html>