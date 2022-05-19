<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 페이지.</title>
</head>
<body>
  <h3>관리자페이지입니다람쥐.</h3>
  <a href="adminAdd.jsp">회원정보생성</a><br>
  <a href="adminSearch.jsp">회원정보검색</a><br>
  <a href="${pageContext.servletContext.contextPath }/userList.do">회원목록</a><br>
  
  
  
  <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>
</body>
</html>