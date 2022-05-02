/**
 * ajax.js
 */
 
 //비동기.
 
 let val = 10;
 setTimeout(function(){
 val+= 5;
 console.log('hello -> ' +val);
 
 setTimeout(function(){
 val += 3;
 console.log('hello2-> ' +val);
}, 1000);
  
   setTimeout(function(){
 val += 4;
 console.log('hello3-> ' +val);
}, 1000);
  
},2000);


let success = true;
let promise = new Promise(function(resolve, reject){//매개값이 정상으로 들어가면 1번, 정상 아니면 2번째 값으로 돌아감
	if(success){
	resolve('success');
	}else{
	reject('error');
	}
});

promise.then(function(result){
			console.log(result);
		})
		
		.then(function(result){
			console.log(result);
		})
		
		.then(function(result){
			console.log(result);
		})
		
		.catch(function(err){
				console.log(err);
		});

 