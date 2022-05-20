<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8" />
<title>도비마켓</title>
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

	<%
	String id = (String) session.getAttribute("id");

	if (id == null) {
		id = "guest";
	}
	%>



	<!-- Navigation-->

	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container px-4 px-lg-5">
			<a class="navbar-brand"
				href="${pageContext.servletContext.contextPath }/view/index.jsp"><img
				alt="" src="C:\Users\admin\Desktop\dobby.jpg"></a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page"
						href="<%=request.getContextPath()%>/index.jsp">홈</a></li>
					<%
					if (id.equals("guest")) {
					%>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="qna.do">고객센터</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page"
						href="<%=request.getContextPath()%>/view/add.jsp">회원가입</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page"
						href="<%=request.getContextPath()%>/view/login.jsp">로그인</a></li>
					<%
					} else {
					%>
					<li class="log"><%=id%> 님 반갑습니다.</li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page"
						href="<%=request.getContextPath()%>/mypage.do">마이페이지</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page"
						href="<%=request.getContextPath()%>/logout.do">로그아웃</a>
					<li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="qna.do" style="text-decoration: none">고객센터</a>
					<li>
						<%
						}
						%>
					
					<li class="nav-item"><a class="nav-link" href="#!">About</a></li>



					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" id="navbarDropdown" href="#"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">Shop</a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">

							<li><a class="dropdown-item" href="#!">모든 상품</a></li>
							<li><hr class="dropdown-divider" /></li>
							<li><a class="dropdown-item"
								href="${pageContext.request.contextPath}/SnackList.do">간식</a></li>
							<li><a class="dropdown-item"
								href="${pageContext.request.contextPath}/ToyList.do">장난감</a></li>
							<li><a class="dropdown-item"
								href="${pageContext.request.contextPath}/GoodsList.do">실내용품</a></li>
							<li><a class="dropdown-item"
								href="${pageContext.request.contextPath}/WashList.do">목욕/미용</a></li>
								
								
								
						</ul></li>
						<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" id="navbarDropdown" href="#"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">커뮤니티</a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">

							<li><a class="dropdown-item"
								href="${pageContext.request.contextPath}/review.do">리뷰</a></li>
							<li><a class="dropdown-item"
								href="${pageContext.request.contextPath}/qna.do">Q & A</a></li>
			
								
						</ul></li>
				</ul>

				<form class="d-flex">
					<button class="btn btn-outline-dark" type="submit">
						<i class="bi-cart-fill me-1"></i> 장바구니 <span
							class="badge bg-dark text-white ms-1 rounded-pill">0</span>
					</button>
				</form>
			</div>
		</div>
	</nav>
</body>
</html>