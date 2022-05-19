<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>qnaDetail.jsp</title>
</head>
<body>
<div id="container">
<!-- Header -->
		<div id="head">
			<jsp:include page="header.jsp"/>
		</div>
		<br>
		<br>
<c:choose>
	<c:when test="${empty qnadetail }"><h3>X.X</h3></c:when>
	<c:otherwise>
		<table border="1">
		<h3>문의글 상세보기</h3>
			<tr>
				<td>문의글 번호</td>
				<td>${qnadetail.qnaNo }</td>
			</tr>
			<tr>
				<td>작성일</td>
				<td>${qnadetail.qnaDate }</td>
			</tr>
			<tr>
				<td>상품코드</td>
				<td>${qnadetail.productCode }</td>
			</tr>
			<tr>
				<td>작성자</td>
				<td>${qnadetail.qnaWrite }</td>
			</tr>
			<tr>
				<td>제목</td>
				<td>${qnadetail.qnaTitle }</td>
			<tr>
				<td>내용</td>
				<td>${qnadetail.qnaContent }</td>
			</tr>
		</table>
	</c:otherwise>
</c:choose>		
			
		
		
		
		
		
<!-- Footer -->
		<div id="foot">
			<jsp:include page="footer.jsp"/>
		</div>		
</body>
</html>