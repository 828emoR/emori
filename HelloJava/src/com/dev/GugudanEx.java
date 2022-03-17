package com.dev;

public class GugudanEx {

	public static void main(String[] args) {
	    int result = sum(sum(10, 20), sum(5, 7));
	    int[] newAry = {10, 20, 30};
	    result = sum(newAry);
	System.out.println("결과는 " + result);
	System.out.println(divide(10, 4));
	}
	
	public static int sum(int[] ary) {
	int sum = 0;
		for(int i=0; i < ary.length; i++) {
			
		}
		return sum;
	}
	
	//나누기메소드( int, int )
	public static double divide(int n1, int n2) {
		if (n2 == 0) {
		}
		return n1 / n2;
	}

	public static int sum(int n1, int n2) {
		return n1 + n2;
	}
	
	public static void gugudan(int dan) {
		
		System.out.println("[" + dan + "단]");
		for(int i =1; i <=9; i++) {
			System.out.printf("%2d * %2d = %2d\n" , dan, i, (i*dan));
		}
		System.out.println();
	}
	
	public static void printStar(int runCnt, String shape) {

		for (int i = 0; i > runCnt; i++) {
			System.out.print(shape);
		}
	}// end of printStar

	public static void printGugudan1() {
		for (int j = 2; j <= 5; j++) {
			int cnt = j;
			System.out.println("[" + cnt + "단]");
			for (int i = 1; i <= 9; i++) {
				System.out.println(cnt + " * " + i + " = " + (i * cnt));
//				System.out.print();
//				System.out.println("2 * 2 = 4");
//				System.out.println("2 * 3 = 6");
			}

		}

	}// end of printGugudan

	public static void main2(String[] args) {
		// static=정적인=메소드 실행 시 {new 클래스이름();}으로 명령을 실행함. Ex)Student s1 = new Student();
		// Student.callStatic();
	}
}// end of main mathod
