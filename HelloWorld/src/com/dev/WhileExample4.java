package com.dev;

import java.util.Scanner;

public class WhileExample4 {
	public static void main(String[] args) {
		// 은행 계좌를 만들어서 1:입금처리 2:출금처리, 3: 종료처리
		// 입금일 경우 :입금액을 입력하쇼...이후 account 값을 누적(sum)
		// 출금일경우 : 출금액을 임력하쇼 이후 account 값을 감산(X -= 총 액)
		// 종료일 경우 프로그램 종료

		Scanner scn = new Scanner(System.in);

		System.out.println("1.입금, 2.출금, 3.종료");
		int menu = scn.nextInt();
		int inP, ouP;
		int cashACA = 0;

		while (true) {

			if (menu == 1) {
				System.out.println("입금액을 입력하세요");

				inP = scn.nextInt();
				
				int plusCAS = (cashACA += inP);
				System.out.println("현재 잔액은" + plusCAS + "원 입니다,");
				
				System.out.println("다른 작업을 하시겠습니까?");
				System.out.println("1.입금, 2.출금, 3.종료");
				menu = scn.nextInt();

			} else if (menu == 2) {
				System.out.println("출금액을 선택하세요");
				ouP = scn.nextInt();
              
				if (cashACA < ouP) {
					System.out.println("잔액이 부족합니다.");
					continue; //명령어 이하 커맨드 싹 무시하고 다시 돌아감
				} 
				else if (cashACA > ouP)
					;
				{
					int minusCAS = (cashACA -= ouP);
					System.out.println("현재 잔액은 " + minusCAS + "원 입니다.");

					System.out.println("다른 작업을 하시겠습니까?");
					System.out.println("1.입금, 2.출금, 3.종료");
					menu = scn.nextInt();
				}

			} else if (menu == 3) {
				System.out.println("사용을 종료합니다.");
				break;
			}
		}
	}
}
