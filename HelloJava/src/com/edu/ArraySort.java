package com.edu;

public class ArraySort {
	public static void sorting(int[] ary) {
int loopCnt = ary.length - 1;//마지막값이 제일 처음위치로 이동하려면 배열크기 -1; - 이게 뭔 개소리지
		
		
		for(int cnt = 0; cnt < loopCnt; cnt++) {
			int temp = ary[0]; // 첫번째 값으로 temp값을 지정.
			for (int i = 0; i< loopCnt; i++){
				if (ary[i] > ary[i+1]) {
					// 34 25 => 25 34로 위치변경
					temp = ary[i];
					ary[i] = ary[i+1];
					ary[i+1] = temp;
				}
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		//정수형 배열 int[] intAry => {34, 36, 48, 12} 를 선언. 이후 오름차순으로 선언
		//intAry[i] -> intAry[i+1];
		
		int[] intAry = {34, 36, 48, 12};
		int loopCnt = intAry.length - 1;//마지막값이 제일 처음위치로 이동하려면 배열크기 -1; - 이게 뭔 개소리지
		
		
		for(int cnt = 0; cnt < loopCnt; cnt++) {
			int temp = intAry[0]; // 첫번째 값으로 temp값을 지정.
			for (int i = 0; i< loopCnt; i++){
				if (intAry[i] > intAry[i+1]) {
					// 34 25 => 25 34로 위치변경
					temp = intAry[i];
					intAry[i] = intAry[i+1];
					intAry[i+1] = temp;
				
				}
					
				}	
			}
		
//변경된 결과 출력
		for(int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i] + " ");
				}
		System.out.println("\n end of prog");
			}
}
	

//	if (intAry[i] > intAry[i+1]) {
//		
//		
//		
//	}