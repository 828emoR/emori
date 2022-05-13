<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 화면</title>
</head>
<body>
	<h3>회원가입화면</h3>
	<form action="../memberInsert.do" method="post" enctype="multipart/form-data">
	아이디 : <input type="text" name="id"><br>
	비밀번호: <input type="password" name="pw"><br>
	이름: <input type="text" name="name"><br>
	주소: <input type="text" name="address"><br>
	메일: <input type="email" name="email"><br>
	<input type="submit" name="추가"><br>

	</form>
   <jsp:include page="/memberResult/home.jsp"></jsp:include>
</body>
</html>