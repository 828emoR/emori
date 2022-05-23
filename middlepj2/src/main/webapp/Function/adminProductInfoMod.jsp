<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h3>${error }</h3>
   
   <h3>상품수정조회</h3>
   <form action="${pageContext.servletContext.contextPath }/productSearch.do" method="get">
		<input type="text" name="productCode" id=""><br> <input
			type="hidden" name="job" value="modify"> 
			<input type="submit"value="조회">
	</form>
	<c:choose>
		<c:when test="${!empty result }">
			<h3>${result }</h3>
		</c:when>
		<c:otherwise>
			<h3>상품수정</h3>
			<form action="${pageContext.servletContext.contextPath }/productMod.do" method="post">
				<%--이미지는 json 사용 해야 할거 같아 일단은 이미지는 구현 안했스비다..... --%>
				상품코드: <input type="text" name="productCode" id="" value="${vo.productCode}"><br>
				상품카테고리: <input type="text" name="productCate" id="" value="${vo.productCate}"><br>
				상품이름: <input type="text" name="productName" id=""value="${vo.productName} "><br> 
				상품가격: <input type="text"name="productPrice" id="" value="${vo.productPrice}"><br> 
				상품주문갯수: <input type="text" name="productAmount" id="" value="${vo.productAmount} "><br>
				상품회사: <input type="text" name="productExp" id="" value="${vo.productExp} "><br>
				<input type="submit" value="수정">
			</form>

		</c:otherwise>
	</c:choose>
	
</body>
</html>