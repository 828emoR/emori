package com.edu.api;

public class ApiExample {
	public static void main(String[] args) {

		IDCheck idcheck = new IDCheck();
		
		
		
		
		String result = idcheck.getGender("980425-1111111");
		System.out.println(result);

		result = idcheck.getGender("980420-2100000");
		System.out.println(result);

		System.out.println("끝");

	}
}
