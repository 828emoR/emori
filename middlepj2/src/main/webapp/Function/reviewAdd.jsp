<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style>
#container {
	width: 1000px;
	margin: 0 auto;
}
</style>
</head>
<body>
<!-- Header -->
		<div id="head">
			<jsp:include page="/WEB-INF/view/nav.jsp"/>
		</div>
		<br>
		<br>
	
	<div id="container">
	<h3>리뷰등록화면</h3>
	<form action="reviewAdd.do" method="post" enctype="multipart/form-data">
		제목: <input type="text" name="rtitle"><br>
		주문상품: <select name="rproduct">
			<c:forEach items="${list }" var="order">
				<option value="${order.productCode }">${order.productName }
			</c:forEach>
		</select><br>
		<select name="rstar">
			<option value="5">★★★★★
			<option value="4">★★★★☆
			<option value="3">★★★☆☆
			<option value="2">★★☆☆☆
			<option value="1">★☆☆☆☆
		</select><br>
		<textarea name="rcontent" rows="5" cols="50" placeholder="리뷰 내용을 작성해주세요."></textarea><br>
		첨부이미지: <input type="file" name="rimg"><br>
		비밀번호: <input type="password" name="rpass" placeholder="4자리 숫자를 입력해주세요."><br>
		<input type="submit" value="등록">
		<button type="button" onclick="../review.do">취소</button>
	</form>
	</div>

<!-- Footer -->
		<div id="foot">
			<jsp:include page="/WEB-INF/view/footer.jsp"/>
		</div>
</body>
</html>