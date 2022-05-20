<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="middle.vo.ProductVO" %>
<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style>
#container {
	width: 1000px;
	margin: 0 auto;
}
h2 {
	color: gray;
}
</style>
</head>
<body>
<!-- Header -->
      <div>
         <jsp:include page="../WEB-INF/view/nav.jsp" flush="false"/>
         
      </div>
		<br>
		<br>
		
<div id="container">
	<c:choose>
		<c:when test="${empty list }"><h4>상품정보가 없습니다.</h4></c:when>
		<c:otherwise>
				<c:set var="i" value="0"/>
				<c:set var="j" value="3"/>
				<h2 style="text-align:center;">${list[0].productCate }</h2>
				<table width="1000">
				<c:forEach items="${list }" var="product">
					<c:if test="${i%j==0 }">
					<tr>
					</c:if>
						<td align="center"><a href="productDetail.do?productCode=${product.productCode}" style="text-decoration:none; color:black">
								<img src="upload/${product.productImg }" width="170"><br>
								${product.productName }<br>
								${product.productPrice }원<br>
						</a></td>
					<c:if test="${i%j==j-1 }"	>
					</tr>	
					</c:if>
					<c:set var="i" value="${i+1 }"/>
				</c:forEach>
				</table>
		</c:otherwise>
	</c:choose>
	<br>
	<br>
	</div>
	

	<!-- Footer -->
      <div>
         <jsp:include page="../WEB-INF/view/footer.jsp" flush="false"/>
      </div>
		

</body>
</html>