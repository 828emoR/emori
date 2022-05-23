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
	<h3>상품제거</h3>
	<form action="${pageContext.servletContext.contextPath }/productSearch.do" method="get">
        <input type="text" name="productCode" id=""><br>
        <input type="hidden" name="job" value="remove">
        <input type="submit" value="조회">
    </form>
    <c:choose>
		<c:when test="${!empty result }">
			<h3>${result }</h3>
		</c:when>
		<c:otherwise>
			<h3>상품삭제확인</h3>
			<form action="${pageContext.servletContext.contextPath }/productDel.do" method="post">
				<%--이미지는 json 사용 해야 할거 같아 일단은 이미지는 구현 안했스비다..... --%>
				상품코드: <input type="text" name="productCode" id="" readonly value="${vo.productCode}"><br>
				상품카테고리: <input type="text" name="productCate" id="" readonly value="${vo.productCate}"><br>
				상품이름: <input type="text" name="productName" id="" readonly value="${vo.productName} "><br> 
				상품가격: <input type="text"name="productPrice" id="" readonly value="${vo.productPrice}"><br> 
				상품주문갯수: <input type="text" name="productAmount" id="" readonly value="${vo.productAmount} "><br>
				상품회사: <input type="text" name="productExp" id="" readonly value="${vo.productExp} "><br>
				<input type="submit" value="삭제">
			</form>

		</c:otherwise>
	</c:choose>
</body>
</html>