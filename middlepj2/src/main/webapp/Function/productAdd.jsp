<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
	<h3>상품등록화면</h3>
	<form action="../productAdd.do" method="post" enctype="multipart/form-data">
		상품카테고리: 
		<select name="pcate">
			<option value="간식">간식
			<option value="장난감">장난감
			<option value="실내용품">실내용품
			<option value="목욕/미용">목욕/미용
		</select><br>
		상품명: <input type="text" name="pname"><br>
		상품가격: <input type="text" name="pprice"><br>
		상품수량: <input type="number" name="pamount"><br>
		상품설명: <textarea name="pexp" rows="4" cols="50"></textarea><br>
		상품이미지: <input type="file" name="pimg">
		<input type="submit" value="추가">
		
		
	</form>
</body>
</html>