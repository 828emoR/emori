package com.dev;

//쿄수님 살려주쎄요....
import java.util.Scanner;

// BankApp(main method), Account(계좌번호, 예금주, 잔액) 

public class BankApp {

	static Account[] banks = new Account[100];
	static Scanner scn = new Scanner(System.in);

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
				transperAmount();
			} else if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (menu == 9) {
				showList();
			}
		}
		System.out.println("=======end of prog=======");
	}
///////////////////////////////////////////////////////////////////////////////////////////////
	public static void printMenu() {

		String menu = 
				"\r\n===============원하는 메뉴를 선택해주세요===============\r\n" 
				+ "메뉴: 1.계좌생성(번호, 예금주, 예금액)\r\n"
				+ "2. 예금(번호, 예금액)\r\n"// -> 최고예금액 100,000원.
				+ "3. 출금(번호, 출금액)\r\n"// -> 잔액보다 큰 금액 출금 못하도록.
				+ "4. 잔액조회(번호)\r\n" 
				+ "5. 송금 (송금번호, 금액 입금번호)\r\n " // transoerAmunt() 사용.
				+ "6. 종료\r\n" 
				+ "선택 > \r\n" 
				+ "===================================================";

		System.out.println(menu); // "menu"라는 변수를 화면에 출력시킨다
	}

	// 계좌생성 메소드
	public static void createAccount() {// 계좌생성

		String accNo;
		while (true) {

			System.out.println("계좌생성기능");

			System.out.print("계좌번호를 입력해주세요 >>");
			accNo = scn.next();
			if (searchAccountNo(accNo) != null) {
				System.out.println("이미 있는 계좌번호입니다.");
				System.out.println("계좌번호 입력을 계속하시겠습니까?");
				System.out.println("1. Yes\r\n" + "2.No\r\n");
				int yes = scn.nextInt();
				int No = scn.nextInt();
				if (yes == 1) {
					continue;
				} else if (No == 2) {
					System.out.println("시스템을 종료합니다.");
					break;
				}
			}
			System.out.print("예금주를 입력해주세요 >>");
			String accName = scn.next();
//			System.out.print("예금하실 금액을 입력해주세요 >>");
//			int accMoney = scn.nextInt();
			Account accnt = new Account(accNo, accName);
			for (int i = 0; i < banks.length; i++) {
				if (banks[i] == null) {
					banks[i] = accnt;
					break;
				}
			}
//			// 계좌번호 있는지 체크

			System.out.println("\r\n계좌가 정상적으로 생성되었습니다.\r\n");

			System.out.println("이후에 뭐할거임?\r\n");

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
					transperAmount();
				} else if (menu == 6) {
					System.out.println("프로그램을 종료합니다.");
					break;
				} else if (menu == 9) {
					showList();
				}
			}
			System.out.println("=======end of prog=======");
		}
	}
	// 예금 메소드
	public static void deposit() {

		System.out.println("예금기능");
		System.out.println("계좌번호를 입력해주세요");
		String aNo = scn.next();// 사용자가 입력한 값을 읽어들여 문자열로 받아들임
		System.out.println("예금하실 금액을 선택하세요");
		int amt = scn.nextInt();
		int checkCnt = 0; // 해당 계좌의 조회여부 체크 변수.
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null && banks[i].getAccNo().equals(aNo)) { // 계좌번호 있을 경우 발동한다.
				// 계좌번호 조회됐을 때 발동.
				checkCnt = 1;
				int currAmt = banks[i].getMoney();

				// 예금액이 10만원을 초과하지 못하도록 한다.
				if (currAmt + amt > 100000) {
					checkCnt = 2;
					break;
				}
				banks[i].setMoney(currAmt + amt);// 잔액 + 입금액.
				break;
			}
		}
		while (true) {
			if (checkCnt == 1) {
				System.out.println("정상적으로 처리되었습니다.");
				System.out.println("예금 입금을 계속하시겠습니까?");
				System.out.println("1. Yes\r\n" + "2.No\r\n");
				int YesorNo = scn.nextInt();
				while (true) {
					if (YesorNo == 1) {
						deposit();
					} else if (YesorNo == 2) {
						System.out.println("예금 시스템을 종료합니다.");
						break;
					}
					break;
				}
			} else if (checkCnt == 2) {
				System.out.println("예금 한도 금액을 초과하였습니다.");
				System.out.println("예금 입금을 계속하시겠습니까?");
				System.out.println("1. Yes\r\n" + "2.No\r\n");
				int YesorNo = scn.nextInt();

				while (true) {
					if (YesorNo == 1) {
						deposit();
					} else if (YesorNo == 2) {
						System.out.println("예금 시스템을 종료합니다.");

					}
					break;
				}
				break;
			} else {
				System.out.println("해당 계좌번호는 없는 계좌번호입니다.");
				System.out.println("계좌번호를 다시 입력하시겠습니까?");
				System.out.println("1. Yes\r\n" + "2.No\r\n");
				int YesorNo = scn.nextInt();

				while (true) {
					if (YesorNo == 1) {
						deposit();
					} else if (YesorNo == 2) {
						System.out.println("예금 시스템을 종료합니다.");
						break;
					}
					break;
				}
			}
			break;
		}
	}

	// 출금메소드
	public static void withdraw() {
		System.out.println("출금기능");
		System.out.println("계좌번호를 입력해주세요");
		String aNo = scn.next();// 사용자가 입력한 값을 읽어들여 문자열로 받아들임
		System.out.println("출금 하실 금액을 선택하세요");
		int amt = scn.nextInt();
		int checkCnt = 0; // 해당 계좌의 조회여부 체크 변수.
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null && banks[i].getAccNo().equals(aNo)) { // 계좌번호 있을 경우 발동한다.
				// 계좌번호 조회됐을 때 발동.
				checkCnt = 1;
				int currAmt = banks[i].getMoney();

				// 예금액이 10만원을 초과하지 못하도록 한다.
				if (currAmt - amt < -1) {
					checkCnt = 2;
					break;
				}
				banks[i].setMoney(currAmt - amt);// 잔액 + 입금액.
				break;
			}
		}
		while (true) {
			if (checkCnt == 1) {
				System.out.println("정상적으로 처리되었습니다.");
				System.out.println("예금 출금을 계속하시겠습니까?");
				System.out.println("1. Yes\r\n" + "2.No\r\n");
				int YesorNo = scn.nextInt();
				while (true) {
					if (YesorNo == 1) {
						withdraw();
					} else if (YesorNo == 2) {
						System.out.println("출금 시스템을 종료합니다.");
						break;
					}
					break;
				}
			} else if (checkCnt == 2) {
				System.out.println("출금 한도 금액을 초과하였습니다.");
				System.out.println("예금 출금을 계속하시겠습니까?");
				System.out.println("1. Yes\r\n" + "2.No\r\n");
				int YesorNo = scn.nextInt();

				while (true) {
					if (YesorNo == 1) {
						withdraw();
					} else if (YesorNo == 2) {
						System.out.println("출금 시스템을 종료합니다.");

					}
					break;
				}
				break;
			} else {
				System.out.println("해당 계좌번호는 없는 계좌번호입니다.");
				System.out.println("계좌번호를 다시 입력하시겠습니까?");
				System.out.println("1. Yes\r\n" + "2.No\r\n");
				int YesorNo = scn.nextInt();

				while (true) {
					if (YesorNo == 1) {
						withdraw();
					} else if (YesorNo == 2) {
						System.out.println("출금 시스템을 종료합니다.");
						break;
					}
					break;
				}
			}
			break;
		}

	}

	// 잔액조회 메소드
	public static void findAccountMoney() {
		System.out.println("잔액조회 메뉴 입니다.");
		System.out.println("계좌번호를 입력해주세요");
		String ano = scn.next();
		Account findAccount = searchAccountNo(ano);
		if (findAccount == null) {
			System.out.println("해당 계좌가 존재하지 않습니다.");
			return;
		}
		System.out.println("해당 계좌의 잔액은 " + findAccount.getMoney() + "");
	}
	// 전체 리스트 출력

	public static void showList() {
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null) {
				System.out.println(banks[i].toString());
			}
		}
	}

//계좌번호를 입력하면 배열(bank)에서 그 계좌번호를 반환, 없으면 null
	public static Account searchAccountNo(String accNo) {
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null && banks[i].getAccNo().equals(accNo)) {
				return banks[i];
			}
		}
		return null;// 클래스의 초기값은 null(모든 클래스 적용가능
	}

	public static void transperAmount() {
		System.out.println("송금메뉴입니다.");
		
		String trspOut;
		String trspIn;
		int trspMon = 0;

		System.out.println("송금 할 계좌번호를 입력해주세요");
		trspOut = scn.next();

		for (int i = 0; i < banks.length; i++) {
			int checkCnt = 0;
			if (banks[i] != null && banks[i].getAccNo().equals(trspOut)) { // 계좌번호 있을 경우 발동한다.
				// 계좌번호 조회됐을 때 발동.
				checkCnt = 1;
				
				while(true) {
				if (checkCnt == 1) {
					System.out.println("송금받을 분의 계좌를 입력해주세요");
					trspIn = scn.next();
					
					for (int i1 = 0; i1 < banks.length; i1++) { //송금 받을 계좌를 검색
						int checkCnt1 = 0;
						
						if (banks[i] != null && banks[i].getAccNo().equals(trspIn)) {//해당 계좌가 있을 경우에 발동.
							// 계좌번호 있을 경우 발동한다.
							checkCnt1 = 1;
						}else if(checkCnt1 == 1) {//송금시작
							System.out.println("송금할 금액을 입력해주세요");
							trspMon = scn.nextInt();
					    }else {
						System.out.println("송금받을 고객의 계좌번호가 틀립니다.");
						System.out.println("프로그램을 종료합니다.");
					    break;
					
				} 
				     
				
					}
				}
				}
			}

		}

	}
}// 메인 메소드 끝.
