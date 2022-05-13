<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="co.project.vo.UserInfoVO" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>listOutput.jsp</title>
</head>
<body>
<c:choose>
	<c:when test="${empty all }"><h3>회원정보가 없습니다.</h3></c:when>
	<c:otherwise>
		<table border="1">
       		<thead>
	       		<tr>
		       		<th>id</th>
		       		<th>pw</th>
		       		<th>name</th>
		       		<th>tel</th>
		       		<th>email</th>
		       		<th>address</th>
	       		</tr>
       		</thead>
      	 <tbody>
        	<c:forEach items="${all }" var="user">
        	<tr>
        	<td>${user.id }</td>
        	<td>${user.pw }</td>
        	<td>${user.name }</td>
        	<td>${user.tel }</td>
        	<td>${user.email }</td>
        	<td>${user.address }</td>
        	</tr>
        	</c:forEach>
        </tbody>
    </table>
</c:otherwise>
</c:choose>
 <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>
</body>
</html>