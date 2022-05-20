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
<title>/Function/add.jsp</title>
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

    <h3>회원가입</h3>
    <form action="../addUser.do" method="post">
        Id: <input type="text" name="Uid"><br>
        pw: <input type="password" name="Upw"><br>
        name: <input type="text" name="Uname"><br>
        tel: <input type="tel" name="Utel"><br>
        email: <input type="email" name="Uemail"><br>
        address: <input type="text" name="Uaddress"><br>      
        <input type="submit" value="회원가입">
    </form>
    
   <div>
         <jsp:include page="../WEB-INF/view/footer.jsp" flush="false"/>
      </div>

</html>