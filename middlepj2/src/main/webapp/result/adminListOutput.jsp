<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List" %>
<%@page import="middle.vo.UserVO1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>유저리스트페이지</title>
</head>
<body>
<h3>유저리스트페이지</h3>
	<c:choose>
   <c:when test="${empty list}"><h3>유저정보없음</h3></c:when>
   	<c:otherwise>  
    <table border="1">
        <caption>유저목록</caption>
        <thead>
            <tr>
                <th>유저아이디</th>
                <th>유저비밀번호</th>
                <th>유저이름</th>
                <th>유저전화번호</th>
                <th>유저이메일</th>
                <th>유저주소</th>
            </tr>
        </thead>
        <tbody>
         <c:forEach items="${list}" var="user_info">
          <tr>
           <td>${user_info.uid }</td>
  	       <td>${user_info.upw }</td>
  	       <td>${user_info.uname }</td>
  	       <td>${user_info.utel }</td>
  	       <td>${user_info.uemail }</td>
  	       <td>${user_info.uaddress }</td>
          </tr>
         </c:forEach>
        </tbody>
    </table>
   </c:otherwise> 
  </c:choose>
  <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>
</body>
</html>