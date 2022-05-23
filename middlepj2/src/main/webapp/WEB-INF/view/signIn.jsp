<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>회원가입</title>
<!-- Favicon-->
<link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
<!-- Bootstrap icons-->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css"
	rel="stylesheet" />
<!-- Core theme CSS (includes Bootstrap)-->
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css"/>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
	<!-- Page content-->
	<section class="py-5">
		<div class="container px-5">
			<!-- Contact form-->
			<div class="bg-light rounded-3 py-5 px-4 px-md-5 mb-5">
				<div class="text-center mb-5">

					<h1 class="fw-bolder">회원가입</h1>
					<p class="lead fw-normal text-muted mb-0">도비마켓의 가족이 되어주세요!</p>
				</div>
				<div class="row gx-5 justify-content-center">
					<div class="col-lg-8 col-xl-6">
						<form action="../addUser.do" method="post">
							<!--아이디 입력 -->
							<div class="form-floating mb-3">
								<input class="form-control" id="Uid" type="text"
									placeholder="Enter your name..." data-sb-validations="required" />
								<label for="Uid">ID</label>
								<div class="invalid-feedback" data-sb-feedback="name:required">ID
									를 입력해주세요.</div>
							</div>
							<!--비밀번호 입력-->
							<div class="form-floating mb-3">
								<input class="form-control" id="Upw" type="password"
									placeholder="(123) 456-7890" data-sb-validations="required" />
								<label for="Upw">비밀번호</label>
								<div class="invalid-feedback"
									data-sb-feedback="password:required">비밀번호를 입력해주세요.</div>
							</div>
							<!--이름 입력-->
							<div class="form-floating mb-3">
								<input class="form-control" id="Uname" type="text"
									placeholder="(123) 456-7890" data-sb-validations="required" />
								<label for="Uname">이름</label>
								<div class="invalid-feedback" data-sb-feedback="phone:required">이름을
									입력해주세요!</div>
							</div>
							<!-- Phone number input-->
							<div class="form-floating mb-3">
								<input class="form-control" id="Utel" type="tel"
									placeholder="(123) 456-7890" data-sb-validations="required" />
								<label for="Utel">휴대전화 번호</label>
								<div class="invalid-feedback" data-sb-feedback="phone:required">휴대폰
									번호를 입력해주세요.</div>
							</div>
							<!--메일 입력-->
							<div class="form-floating mb-3">
								<input class="form-control" id="Uemail" type="email"
									placeholder="name@example.com"
									data-sb-validations="required,email" /> <label for="Uemail">이메일</label>
								<div class="invalid-feedback" data-sb-feedback="email:required">이메일을
									입력해주세요.</div>
								<div class="invalid-feedback" data-sb-feedback="email:email">올바른
									이메일을 작성해주세요.</div>
							</div>
							<!--주소입력-->
							<div class="form-floating mb-3">
								<input class="form-control" id="Uaddress" type="text"
									placeholder="(123) 456-7890" data-sb-validations="required" />
								<label for="Uaddress">주소</label>
								<div class="invalid-feedback"
									data-sb-feedback="address:required">주소를 입력해주세요.</div>
							</div>
							
							<input type="submit" value="회원가입">
							<a href="main.jsp">첫페이지</a>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>

</body>
</html>