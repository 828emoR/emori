<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div>
			<h1>(대충 회원가입 하라는 뜻)</h1>
		</div>
		<div>
			<form id="frm" action="studentJoin.do" onsubmit="return formCheck()"
				method="post">
				<div>
					<table border="1">
						<tr>
							<th width="150">아이디</th>
							<td width="380"><input type="email" id="id" name="id"
								required="required">&nbsp;
								<button type="button" id="btn" onclick="idCheck()">중복체크</button> 
								<input type="hidden" id="checkId" value="N"></td>
						</tr>
						<tr>
							<th width="150">패스워드</th>
							<td><input type="password" id="password" name="password"
								required="required"></td>
						</tr>
						<tr>
							<th width="150">패스워드 확인</th>
							<td><input type="password" id="password1" name="password1"
								required="required"></td>
						</tr>
						<tr>
							<th width="150">이 름</th>
							<td><input type="text" id="name" name="name"
								required="required"></td>
						</tr>
						<tr>
							<th width="150">전화번호</th>
							<td><input type="tel" id="tel" name="tel"
								required="required"></td>
						</tr>
						<tr>
							<th width="150">주 소</th>
							<td><input type="text" size="50" id="address" name="address">
							</td>
						</tr>
						<tr>
							<th width="150">생년월일</th>
							<td><input type="date" id="birthday" name="birthday"
								required="required"></td>
						</tr>
						<tr>
							<th width="150">나 이</th>
							<td><input type="text" id="age" name="age"
								required="required"></td>
						</tr>
					</table>
				</div>
				<br />
				<div>
					<input type="submit" value="회원등록">&nbsp;&nbsp; <input type="reset" value="취소">

				</div>
			</form>
		</div>

	</div>
	<script type="text/javascript">
	function formCheck(){
		if(frm.checkId.value == 'N'){
			alert("아이디 중복체크를 해주세요");
			return false;
		}
		
		if(frm.password.value != frm.password1.value){
			alert("패스워드가 일치하지 않습니다.");
			frm.password.value = "";
			frm.password1.value = "";
			frm.password.focus();
			return false;
			
		}
		
		return true;
	}
	
	function idCheck(){
		id = frm.id.value;
		fetch("ajaxIdCheck.do?id="+id,{
			method : 'GET',
		}).then((response) => {
			return response.text()
		.then((data) => {
			if(data != 'N') {
				alert(id + "는 사용할 수 있는 아이디 입니다.");
				const target = document.getElementById('btn');
				target.disabled =true;
				frm.checkId.value = data;
			}else{
				alert(id +"는 사용할 수 없는 아이디 입니다.")
				frm.id.value = "";
				frm.id.focus();
			}
		})
	});
	}
</script>
</body>
</html>