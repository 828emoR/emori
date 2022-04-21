//variable.js

var myName = '김주환';//string
myName = 100;//undefined
myName = true;//bolean
myName = null;//object

console.log(typeof yourName);
var yourName = "홍길동";
console.log(typeof yourName);

//전역변수(스크립트 변수), 지역변수(함수 안에서의 변수)
function checkInfo(){
  myName = 'Kimjuhwan';
  console.log(myName);
}
checkInfo();
console.log(myName);

//ES6()
//let 블럭레벨 선언

function info(){
  let myName = 'hong';
  console.log(myName);
}
info();
{
  let myName = 'hong';
  console.log(myName);
}
{
let myName = 'hwang';
  console.log(myName);
}
{
  const otherName = 'hong';
  //otherName = 'hwang';
}