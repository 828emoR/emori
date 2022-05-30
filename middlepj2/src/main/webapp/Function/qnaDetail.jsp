<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>레이아웃</title>
<!-- Favicon-->
<link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
<!-- Bootstrap icons-->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css"
	rel="stylesheet" />
<!-- Core theme CSS (includes Bootstrap)-->
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css"/>
<script>
	function deleteQna(no) {
		var confirmed = confirm("삭제하시겠습니까?");
		if(confirmed) {
			location.href = "qnaDelete.do?qnaNo="+no;

		}
	}
</script>

<title>qnaDetail.jsp</title>
</head>
<body>
<div id="container">
<!-- Header -->
<jsp:include page="/WEB-INF/view/nav.jsp" flush="false"/>


		<br>
		<br>
<c:choose>
	<c:when test="${empty Uid }"><h3>로그인 후 이용가능합니다.</h3>
				<p><a href="view/login.jsp">로그인하기</a></p>
	</c:when>
	<c:when test="${qnadetail.id != Uid }">
		${list.id }
		<h3>작성자만 볼 수 있습니다.</h3>
	</c:when>
	<c:when test="${qnadetail.id == Uid }">
		<h3>문의글 상세보기</h3>
		<table border="1">
			<tr>
				<td>문의글 번호</td>
				<td>${qnadetail.qnaNo }</td>
			</tr>
			<tr>
				<td>아이디</td>
				<td>${qnadetail.id }</td>
			</tr>
				<td>작성자</td>
				<td>${qnadetail.qnaWrite }</td>
			<tr>
				<td>제목</td>
				<td>${qnadetail.qnaTitle }</td>
			<tr>
				<td>내용</td>
				<td>${qnadetail.qnaContent }</td>
			</tr>
			<tr>
				<td>작성일</td>
				<td>${qnadetail.qnaDate }</td>
			</tr>
		</table>
		
			<button type="button" onclick="deleteQna('${qnadetail.qnaNo }');">문의글 삭제</button>
			<button type="submit" onclick="location.href='view/qnaUpdate.jsp?qnaNo=${qnadetail.qnaNo}'">문의글 수정</button>
	</c:when>
	<c:otherwise>
		<h3>해당 문의글은 작성자만 볼 수 있습니다</h3>
	</c:otherwise>
</c:choose>		

			
		
		
		
		
		
<!-- Footer -->
<jsp:include page="/WEB-INF/view/footer.jsp" flush="false"/>
</body>
</html>