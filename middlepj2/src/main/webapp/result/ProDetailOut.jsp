<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>레이아웃</title>
<!-- Favicon-->
<link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
<!-- Bootstrap icons-->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css"
	rel="stylesheet" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="css/styles.css" rel="stylesheet" />
</head>
<body>
<!-- Header -->
      <div>
         <jsp:include page="../WEB-INF/view/nav.jsp" flush="false"/>
      </div>
      <!--
      구매페이지 
      해당 자리에 원래 있던 코드는 BuyBody로 통합되었습니다.
      -->
    	<div>
			<jsp:include page="../WEB-INF/view/BuyBody.jsp" flush="false"/>
		</div>
   <!-- Footer -->
      <div>
         <jsp:include page="../WEB-INF/view/footer.jsp" flush="false"/>
      </div>
</body>

<!--스크립트도  "js/BuyBodyDom.js" 로 들어갔습니다. -->
</html>