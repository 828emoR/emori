package com.dev;

public class ForExample4 {
	public static void main(String[] args) {
		// 1~ 10까지 수중에서 짝구의 값 => evenSum, 홀수의 값 => oddSum
		
		int evenSum = 0;
		int oddSum = 0;
		
		for (int i = 1; i <= 10; i++) {
			
			if (i % 2 ==1) {
				System.out.println(i);
				oddSum += i;
				
			}else {
					System.out.println(i);
					evenSum += i;
				}		
			}
		
		System.out.println("1부터 10까지의 홀수의 합은" + oddSum + "이며," + "1부터 10까지의 짝수의 합은" + evenSum + "입니다.");
	}
	

		 
}




