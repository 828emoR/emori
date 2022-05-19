<%@page import="org.apache.taglibs.standard.lang.jstl.EqualsOperator"%>
<%@page import="middle.service.Markservice"%>
<%@page import="middle.vo.UserVO1"%>
<%@page import="middle.dao.ModiFyDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보수정</title>
</head>
<body>
   
   <form action="${pageContext.servletContext.contextPath }/modify.do" method="post">
           아이디: <input type="text" name="Uid" readonly value="${vo.uid }"><br>
           비밀번호: <input type="text" name="Upw" value="${vo.upw }"><br>
           이름: <input type="text" name="Uname" value="${vo.uname }"><br>
           전화번호: <input type="text" name="Utel" value="${vo.utel }"><br>
           이메일: <input type="text" name="Uemail" value="${vo.uemail }"><br>
           주소: <input type="text" name="Uaddress" value="${vo.uaddress }"><br>
           <input type="submit" value="수정">
   
   </form>
   
   <script>



</script>
<form action="${pageContext.servletContext.contextPath }/delete.do" method="get">

<input type="submit" value="회원탈퇴">
</form>

   

</body>
</html>