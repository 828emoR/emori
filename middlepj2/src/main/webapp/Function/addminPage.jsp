<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>도비마켓 로그인</title>

    <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="${pageContext.request.contextPath}/css/sb-admin-2.min.css" rel="stylesheet">
</head>
<body>

	<div>
		<jsp:include page="/WEB-INF/view/nav.jsp" flush="false" />
	</div>

	<div>
		<jsp:include page="/WEB-INF/view/addminPageview.jsp" flush="false" />
	</div>

	<div>
		<jsp:include page="/WEB-INF/view/footer.jsp" flush="false" />
	</div>

	<a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지11</a>
</body>
</html>