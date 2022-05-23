<%@page import="middle.dao.qnaDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>qnaUpdate.jsp</title>
</head>
<body>
	<h3>문의글 수정</h3>
	
	<form action="">
		<table border="1">
			<thead>
			</thead>
			<tbody>
				<tr>
					<td>카테고리</td>
					<td>
						<select name="category">
						<option value="상품">상품문의</option>
						<option value="배송">배송문의</option>
						<option value="기타">기타문의</option>
						</select>
				</td>
				</tr>
				<tr>
				<td>제목</td>
				<td><input type="text" placeholder="제목수정" name="qnaTitle"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><input type="text" placeholder="내용수정" name="qnaContent" style= "height:350px"></td>
			</tr>
			
			</tbody>
		</table>
	</form>
</body>
</html>