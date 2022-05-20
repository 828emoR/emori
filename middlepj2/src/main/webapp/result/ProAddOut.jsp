<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	 <div>
         <jsp:include page="../WEB-INF/view/nav.jsp" flush="false"/>
         
      </div>
		<br>
		<br>
		
	<div id="container">
		<h4>${category } 카테고리에 상품 '${name }'이 등록되었습니다.</h4>
	</div>
		
<!-- Footer -->
	   <div>
         <jsp:include page="../WEB-INF/view/footer.jsp" flush="false"/>
      </div>
		
</body>
</html>