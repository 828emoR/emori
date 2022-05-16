<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>

<body>

	${error }
    <h3>회원정보 수정</h3>
    <form action="${pageContext.servletContext.contextPath }/searchUser.do" method="get">
  	조회 아이디: <input type="text" name="id"><br>
  	<input type="hidden" name="job" value="modify">
  	<input type="submit" value="Search">
  	
  	</form>
  	
  	
  	
    <c:choose>
		<c:when test="${!empty result }"><h3>${result }</h3></c:when>
			<c:otherwise>
    <form action="${pageContext.servletContext.contextPath }/modifyUser.do" method="post">
				아이디: <input type="text" name="id" readonly value="${vo.id }"><br>
				비밀번호: <input type="password" name="pw" value="${vo.pw }"><br>
				이름:	 <input type="text" name="name" value="${vo.name }"><br>
				전화번호: <input type="text" name="tel" value="${vo.tel }"><br>
				이메일: <input type="text" name="email" value="${vo.email }"><br>
				주소: <input type="text" name="address" value="${vo.address }"><br>
				<input type="submit" value="수정">
        <input type="submit" value="수정">
    </form>
    		</c:otherwise>
		</c:choose>

    <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>

</body>

</html>