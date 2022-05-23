<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 페이지.</title>
</head>
<body>
  <h3>관리자페이지입니다람쥐.</h3>
  <h4>회원관련</h4><br>
  
  <a href="adminSearch.jsp">회원정보검색</a><br>
  <a href="${pageContext.servletContext.contextPath }/userList.do">회원목록</a><br>
  
  <br>
  
  <h4>상품관련</h4><br>
  <a href="productAdd.jsp">상품추가</a><br>
  <a href="adminProductSearch.jsp">상품단건검색</a><br>
  <a href="adminProductInfoMod.jsp">상품정보수정</a><br>
  <a href="adminProductDel.jsp">상품삭제</a><br>
  <a href="${pageContext.servletContext.contextPath }/listProduct.do">상품리스트</a><br>
  
  <h4>게시판관련</h4><br>
  <a href="">게시글목록</a><br>
  
 
  <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>
</body>
</html>