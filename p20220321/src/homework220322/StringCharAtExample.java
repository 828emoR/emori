package homework220322;

import java.util.Scanner;

public class StringCharAtExample {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
	    System.out.println("성별을 확인하기 위한 주민등록 번호를 입력해주세요");
		String ssn = scn.next();
		
		char sex = ssn.charAt(7);
		switch (sex) {
		case'1':
		case'3':
			System.out.println("이쉨 남자임");
			break;
		case'2':
		case'4':
			System.out.println("여자임 암튼 여자임");
			break;
		}
	}

}
