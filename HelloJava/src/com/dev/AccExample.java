package com.dev;

public class AccExample {
	public static void main(String[] args) {
		Account[] accounts; 
		
		accounts = new Account[] {new Account("1-111", "hong")//
		, new Account("1-112", "hwang")//
		, new Account("1-113", "kim")//
		,
		};
//		Account a1 = new Account();//실체를 생성.
		System.out.println(Account.bankname);
		Account.showbankName();
		
		//쉐어하우스
		Calculator.sum(10, 20);//static method 를 이용하는게 훨씬 좋음 ㄹㅇㅋㅋ
		
		Calculator c1 = new Calculator();
		c1.sum(10, 20);
		
		Calculator.getArea(10);
		
		// static 활용.
		
		
	}
}
