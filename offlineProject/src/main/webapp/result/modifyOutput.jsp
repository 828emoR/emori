<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>modifyOutput.jsp</title>
</head>
<body>

	<h3>회원정보가 수정되었습니다!</h3>
	
	 	<c:if test="${!empty result }"><h4>${result }</h4></c:if>
 		<c:if test="${!empty vo }">
 	<h4>${vo.id } ${vo.pw } ${vo.name } ${vo.tel } ${vo.email } ${vo.address } </h4>
 </c:if>
	
    <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>

</body>
</html>