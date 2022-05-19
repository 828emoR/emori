<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	 <h3>${error }</h3>

    <!-- 도서수정을 위한 화면 작성코드를 입력하세요. -->
 
    <h3>수정완료</h3>
    <h4>${modify }</h4>
 

	
    <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>

</body>
</html>