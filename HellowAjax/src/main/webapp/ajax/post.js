/**
 * post.js
 */

document.addEventListener('DOMContentLoaded', init);

//리스트
function init() {
	let xhtp = new XMLHttpRequest();
	xhtp.open('get', '../studentList.json')
	xhtp.send();
	xhtp.onload = function() {
		let data = JSON.parse(xhtp.responseText);
		console.log(data);
		let tbodyList = document.getElementById('list')
		data.forEach(function(elem) {
			tbodyList.appendChild(makeTr(elem));
		})
	}//end of onload

	let modBtn = document.querySelector('input[type=button]')
	modBtn.addEventListener('click', function() {
	let no = document.querySelector('input[name=sno]').value;
	let name = document.querySelector('input[name=sname]').value;
	let eScore = document.querySelector('input[name=eScore]').value;
	let kScore = document.querySelector('input[name=kScore]').value;
	
	let xhtp = new XMLHttpRequest();
	xhtp.open('get',/*서블릿을 만들어 홈페이지를 불러옴=>*/ `ModStudentServlet?a=${no}&b=${name}&c=${eScore}&d=${kScore}`)
	xhtp.send();
	xhtp.onload = function(){
	 let result = JSON.parse(xhtp.responseText);
	 if (result.retCode == "OK"){
	//결과값으로 받을 값을 새로운 Tr로 교체
	 	let obj = {
	 	studentNo: result.studentNo,
	 	studentname:result.studentName,
	 	engScore: result.engScore,
	 	korScore:result.korScore
	 	}
	 	let newTr = makeTr(obj);
	 	let oldTr = document.getElementById(result.studentNo);
	 	document.getElementById('list').replaceChild(newTr,oldTr);//새로운 Tr=> 이전 Tr 대체
	 }else{
	 alert('변경 중 오류')
	 }
	}
		})
}//end of init

//변경처리.
function modStudent() {

}


//한건추가
function addStudent(e) {
	e.preventDefault();//submit => 전송기능 차단.
	console.log(e);

	let no = document.querySelector('input[name="sno"]').value;
	let name = document.querySelector('input[name="sname"]').value;
	let eScore = document.querySelector('input[name="eScore"]').value;
	let kScore = document.querySelector('input[name="kScore"]').value;

	let xhtp = new XMLHttpRequest();//비동기방식으로 서버의 파일 요청
	xhtp.open('get', `addStudentServlet?sno=${no}&sname=${name}&eScore=${eScore}&kScore=${kScore}`);
	xhtp.send();
	xhtp.onload = function() {
		console.log(xhtp.responseText);//{"retCode":"Success"}
		let result = JSON.parse(xhtp.responseText);//{"retCode":"Success"}
		console.log(result.retCode);
		if (result.retCode == 'success') {
			//리스트 새로운 값 추가.
			successCallBack();//{retCode:?, studNo:?, studName:?, eScore:?, kScore:?}
		} else if (result.retCode == "Fail") {
			// 저리중 에러발생.
		}
	}//end of Fnc()
}//end of addStudent(e)

function makeTr(student) {
	let tr = document.createElement('tr');

	tr.setAttribute('id', student.studentNo);//<= 라인 삭제를 위한 ID값 기준으로 getElementById(id).remove();
	for (let field in student) { //student['studNo']
		let td = document.createElement('td');
		td.innerHTML = student[field];
		tr.appendChild(td);
	}

	//삭제버튼 등록
	let delBtn = document.createElement('button');
	delBtn.innerHTML = '삭제';

	//이벤트 등록
	delBtn.addEventListener('click', function() {
		//삭제할 ID 파악 후 ajax 호출) this => 이벤트 대상 엘리먼트
		let id = this.parentElement.parentElement.firstChild.innerHTML;
		console.log(id);
		let xhtp = new XMLHttpRequest();
		xhtp.open('get', 'delStudentServlet?delId=' + id);
		xhtp.send();
		xhtp.onload = function() {
			let result = JSON.parse(xhtp.responseText);
			if (result.retCode == 'OK') {
				alert(result.retVal + '번이 삭제되었습니다.');
				document.getElementById(result.retVal).remove();

			} else {
				console.log(result.retVal)
			}
		}
	});

	let td = document.createElement('td');
	td.appendChild(delBtn);
	tr.appendChild(td);

	return tr;
}




function successCallBack2(retObj) { //{retCode:?, studNo:?, studName:?, eng:?, kor:?}
	console.log(retObj);
	let obj = {
		studentNo: retObj.studentNo,
		studNm: retObj.studName,
		eng: retObj.engSc,
		kor: retObj.korSc
	}
	document.getElementById('list').appendChild(makeTr(obj));
}//end of successCallBack2()

function successCallBack() {
	//사용자 입력값을 id='list'하위 추가.
	let no = document.querySelector('input[name="sno"]').value;
	let name = document.querySelector('input[name="sname"]').value;
	let eScore = document.querySelector('input[name="eScore"]').value;
	let kScore = document.querySelector('input[name="kScore"]').value;

	let obj = {};
	obj.sno = no;
	obj.sname = name;
	obj.eScore = eScore;
	obj.kScore = kScore;

	document.getElementById('list').appendChild((makeTr(obj)));
}

function failCallBack() {
	alert('처리중 에러발생');
}