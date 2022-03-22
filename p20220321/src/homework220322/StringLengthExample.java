package homework220322;

import java.util.Scanner;

public class StringLengthExample {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in); // 임의로 추가한 코드문. 정해진것 대신 자신의 주민번호도 대입해서 실험해보자.
		
		String ssn = scn.next();
		
		int length = ssn.length();//입력한 번호와 비교할 번호의 '길이' 를 비교한다
		if(length == 13) {//비교할 번호의 자릿수인 13개와 입력한 번호의 자릿수가 일치할 경우
			System.out.println("올바른 주민번호 자릿수입니다.");//출력한다.
		}else {//아닐경우
			System.out.println("올바르지 못한 자릿수의 주민등록번호입니다.");//출력한다.
		}
	}

}
