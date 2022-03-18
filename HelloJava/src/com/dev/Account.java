package com.dev;

public class Account {
	//계좌정보, 예금주, 예금액
	//field
	private String accNo;
	private String accName;
	private int money;
	
	public static String bankname;
	static {
		bankname = "모리은행";
	}
	
	public static void showbankName(){
		System.out.println("모리은행");
	}
	//constructor: 생성자 목적은 필드의 초기값을 지정.
	//같은 생성자를 여러개 만들어 쓸 때 constructor overloading 이라고 한다.
	public Account(String accNo, String accName, int money) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.money = money;
		
		
		
	}
	
	public Account(String accNo, String accName) {
		super();
		this.accNo = accNo;
		this.accName = accName;
	}
	
	//method
	public String getAccNo() {
		return accNo;
	}
	
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", money=" + money + "]";
	}

}