<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="frm" action="StudentGetServlet" method="get">
		<input type="hidden" name="cmd" value="search">
		 ID:<input type="number" name="user_id" value="111"><br>
	   Name:<input type="text" name="user_name" value="홍길동"><br> 
	    Eng:<input type="number" name="eng_score"><br>
	    Kor:<input type="number" name="kor_score"><br>
			<input type="submit" value="조회"> 
			<input id="addbtn" type="button" value="입력">
			<input id="modbtn" type="button" value="수정">
			<input id="delbtn" type="button" value="삭제">
	</form>
	

	<script>
		let modbtn = document.getElementById('modbtn');
		modbtn.addEventListener('click', function(){
			let frm = document.forms.frm;
			frm.method = "post";
			frm.cmd.value = "mod";
			frm.submit(); // 서브밋 버튼 클릭
		});
	
		let delbtn = document.getElementById('delbtn');
		delbtn.addEventListener('click', function(){
			let frm = document.forms.frm;
			frm.method = "post";
			frm.cmd.value = "del";
			frm.submit(); // 서브밋 버튼 클릭
		});
	
		let btn = document.querySelector('#addbtn');
		btn.addEventListener('click', function() {
			let frm = document.forms.frm;
				frm.action = "StudentGetServlet"
				frm.method = "post";
				frm.cmd.value = "add";

				//frm.submit(); // form 의 submit.
				
				frm.submit();
		});
	</script>
</body>
</html>