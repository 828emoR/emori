//object.js

let member1 = {  /*<<전역변수 */
  fullName: 'hong',
  age: 20,
  score:80
};
let member2 = {
  fullName:'hwang',
  age:22,
  score:88
}
let member3 = {
  fullName:'park',
  age:25,
  score:92
}
member1.fullName = '홍';
console.log(member1.fullName)
console.log(member1.age+member2.age)
//{key: value}, {key, value}

const members = [member1, member2, member3];
//홍의 나이는 20이고 점수는 80입니다.
//황의 나인ㄴ 22이고 점수는 88입니다.
//박의 나이는 25이고 점수는 92입니다.

console.log(member1.fullName + '의 나이는' + member1.age +'이고'
+'점수는'+member1.score+'입니다.')
console.log(member2.fullName + '의 나이는' + member2.age +'이고'
+'점수는'+member2.score+'입니다.')
console.log(member3.fullName + '의 나이는' + member3.age +'이고'
+'점수는'+member3.score+'입니다.')
document.write ('<li>홍, 20, 80<br><li>hwang, 22, 88</li><li>park, 25, 92</li>')

document.write('<ul>');
for (let i = 0; i <members.length; i++){
  document.write('<li>'+members[i].fullName +', '+ members[i].age +', '+ members[i].score +'<li>')
/*★*/  document.write(`<li>${members[i].fullName} , ${members[i].age}, ${members[i].score}<li>`)/*★ 기억해둘 것*/
}
document.write('</ul>')

let welcome = `안농하세오 
반가워오`;
console.log(welcome)
// document.write ('<li>hwang, 22, 88</li>')
// document.write ('<li></li>')