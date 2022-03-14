package com.edu;

public class BitExample {
	public static void main(String[] args) {
		int num = 10;
		int result = num >> 2;
//		int result = num << 2; = 오른쪽으로 비트를 2번 옮김
//		int result = num << 3; = 오른쪽으로 비트를 3번 옮김
		System.out.println(result);
		
		int val = 100;
		val = val + 10;
		System.out.println(val); //110
		
		val += 20; //상기 계산된 값에 20을 더한다. =130
		System.out.println(val);
		
		val = val -5; //125
		val -=10; //115
		
		val = val * 2; //230
		val *= 2; //460
		System.out.println(val); //460
		
		String message = "안녕하세오";
		System.out.println(message);
		
		message = message = "Emori에오.";
		System.out.println(message);
		
		message += "자바 존나 어려워오";
	    System.out.println(message);
	    
	    int cnt = 0;
	    cnt = cnt +1;
	    cnt += 1;
	    cnt++;
	    cnt--l
	    System.out.println(cnt);
	    
	    
	}

}
