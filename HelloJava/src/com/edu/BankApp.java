package com.dev;

import java.util.Scanner;

// BankApp(main method), Account(계좌번호,예금주,잔액) 
public class BankApp {

	static Account[] banks = new Account[100];
	static Scanner scn = new Scanner(System.in);

	// 메뉴: 1.계좌생성(번호,예금주,예금액)
	// 2.예금(번호,예금액) -> 최고예금액 100,000원.
	// 3.출금(번호,출금액) -> 잔액보다 큰 금액 출금 못하도록.
	// 4.잔액조회(번호)
	// 5.종료.
	// 오늘이 자바 5일째인데 ... 적절한 프로그램입니다...

	public static void main(String[] args) {

		while (true) {
			printMenu();
			int menu = scn.nextInt();

			if (menu == 1) {
				createAccount();
			} else if (menu == 2) {
				deposit();
			} else if (menu == 3) {
				withdraw();
			} else if (menu == 4) {
				findAccountMoney();
			} else if (menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (menu == 9) {
				showList();
			}
		}
		System.out.println("=== End of Prog ===");
	} // end of main()

	// 메뉴출력 기능.
	public static void printMenu() {
		String menu = "=====================================================\r\n" //
				+ "     1.계좌생성(번호,예금주,예금액)\r\n" //
				+ "     2.예금(번호,예금액) -> 최고예금액 100,000원.\r\n" //
				+ "     3.출금(번호,출금액) -> 잔액보다 큰 금액 출금 못하도록.\r\n" //
				+ "     4.잔액조회(번호)\r\n" //
				+ "     5.종료.\r\n" //
				+ "=====================================================\r\n"//
				+ "선택> ";
		System.out.print(menu);
	}

	// 계좌생성 메소드.
	public static void createAccount() {
		System.out.println("계좌생성기능.");

		String accNo;
		while (true) {
			System.out.print("계좌번호입력>> ");
			accNo = scn.next();
			// 계좌번호 있는지 체크.
			if (searchAccountNo(accNo) != null) {
				System.out.println("이미 있는 계좌번호입니다.");
				continue;
			}
			// 사용가능한 계좌번호가 맞으면 while 반복문을 벗어난다.
			break;
		}

		System.out.print("예금주입력>> ");
		String accName = scn.next();
		System.out.print("예금액입력>> ");
		int accMoney = scn.nextInt();

		Account accnt = new Account(accNo, accName, accMoney);

		for (int i = 0; i < banks.length; i++) {
			if (banks[i] == null) {
				banks[i] = accnt;
				break;
			}
		}
		System.out.println("계좌가 정상적으로 생성되었습니다.");

	}

	// 예금 메소드.
	public static void deposit() {
		System.out.println("예금기능.");

		System.out.print("계좌번호>> ");
		String ano = scn.next();
		System.out.print("예금액 입력>> ");
		int amt = scn.nextInt();
		int checkCnt = 0; // 조회가 됐는지 체크 여부 변수.

		Account findAccount = searchAccountNo(ano);
		if (findAccount != null) {
			checkCnt = 1; // 찾는 조건에 맞는 계좌존재.
			int currAmt = findAccount.getMoney();

			// 예금액이 10만원을 초과하지 못하도록..
			if (currAmt + amt > 100000) {
				checkCnt = 2;
			} else {
				findAccount.setMoney(currAmt + amt); // 잔액 + 입금액.
			}
		}

		if (checkCnt == 1) {
			System.out.println("정삭적으로 처리되었습니다.");
		} else if (checkCnt == 2) {
			System.out.println("한도액을 초과했습니다.");
		} else {
			System.out.println("계좌번호가 없습니다.");
		}

	}

	// 출금 메소드.
	public static void withdraw() {
		System.out.println("출금기능.");
		System.out.print("계좌번호>> ");
		String ano = scn.next();
		System.out.print("예금액 입력>> ");
		int amt = scn.nextInt();
		int checkCnt = 0; // 조회가 됐는지 체크 여부 변수.

		Account findAccount = searchAccountNo(ano);
		if (findAccount != null) {
			checkCnt = 1;
			int currAmt = findAccount.getMoney();

			// 잔액을 초과해서 출금을 못하도록..
			if (currAmt < amt) {
				checkCnt = 2;
			} else {
				findAccount.setMoney(currAmt - amt); // 잔액 - 입금액.
			}
		}

		if (checkCnt == 1) {
			System.out.println("정삭적으로 처리되었습니다.");
		} else if (checkCnt == 2) {
			System.out.println("잔액을 초과했습니다.");
		} else {
			System.out.println("계좌번호가 없습니다.");
		}
	}

	// 잔액조회 메소드.
	public static void findAccountMoney() {
		System.out.println("조회기능.");
		System.out.print("계좌번호>> ");
		String ano = scn.next();
		Account findAccount = searchAccountNo(ano);
		if (findAccount == null) {
			System.out.println("계좌가 존재하지 않습니다.");
			return;
		}
		System.out.println("잔액: " + findAccount.getMoney());
	}

	// 전체리스트 출력.
	public static void showList() {
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null) {
				System.out.println(banks[i].toString());
			}
		}
	}

	// 계좌번호를 입력하면 배열(banks)에서 그 계좌번호를 반환 없으면 null
	// 100개 35개 저장
	public static Account searchAccountNo(String accNo) {
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null && banks[i].getAccNo().equals(accNo)) {
				return banks[i];
			}
		}
		return null; // 클래스 -> null(Student, Car,
	}

}
