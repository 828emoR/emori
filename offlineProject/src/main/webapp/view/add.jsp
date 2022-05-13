<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>

<body>

    <h3>회원가입</h3>
    <form action="../addUser.do" method="post">
        Id: <input type="text" name="id"><br>
        pw: <input type="password" name="pw"><br>
        name: <input type="text" name="name"><br>
        tel: <input type="text" name="tel"><br>
        email: <input type="text" name="email"><br>
        address: <input type="text" name="address"><br>      
        <input type="submit" value="회원가입">
    </form>
    
    <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>

</body>

</html>