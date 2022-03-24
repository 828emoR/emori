package Test;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		double[] intAry = new double[3];
		
		for(int i=0; i < intAry.length; i++) {
			System.out.println("정수를 입력하세요");
			intAry[i] = scn.nextDouble();
		}
		
	}

}
