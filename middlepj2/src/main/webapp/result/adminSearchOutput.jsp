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
<h3>조회결과페이지</h3>
	<c:if test="${!empty result }"><h4>${result }</h4></c:if>
    <c:if test="${!empty vo }">
    <%-- markservice에 있는 유저 불러오기 기능에서, 아이디 표현이 없어서 없앰. ${vo.uid},${vo.upwd}--%>
    <h4>유저아이디: ${vo.upw }  / 유저이름:${vo.uname }
      / 유저전화번호: ${vo.utel } / 유저이메일: ${vo.uemail }/ 유저주소: ${vo.uaddress }
    </h4> 
  </c:if>

 <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>
</body>
</html>