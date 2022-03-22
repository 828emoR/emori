package homework220322;

import java.util.Scanner;

public class StringSubstringExample {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		
		System.out.println("거 주민번호 한번 입력해보쇼");
		
		String ssn = scn.next();
		String firstNum = ssn.substring(0, 6);//쉼표 앞 0은 인덱스를 포함한 ~5번째까지의 문자열을 추출한다는 뜻이고,
		                                      //쉼표 뒤 6은 6번째 문자열을 제외한다는 뜻이다.
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7); //한자리 값만 있을 경우엔 해당 숫자의 순번 이후 문자열 전부를 추출하겠다는 뜻이다.
		System.out.println(secondNum);
	}

}
