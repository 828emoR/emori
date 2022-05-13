<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>removeBook.jsp</title>
</head>

<body>
	${error }
    <h3>회원탈퇴조회</h3>
    <form action="../searchUser.do" method="get">
        <input type="text" name="id" id=""><br>
        <input type="hidden" name="job" value="remove">
        <input type="submit" value="조회">
    </form>

    
    

    <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>

</body>

</html>