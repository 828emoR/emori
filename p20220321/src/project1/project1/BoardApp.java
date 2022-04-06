package project1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardApp {
	// ↓필드

	Scanner scn = new Scanner(System.in);
	List<BoardMember> list = new ArrayList<BoardMember>();

	// 생성자
	public BoardApp() {// 기본 생성자

	}

	// 멤버클래스.

	// 메인 기능을 담당하는 execute()
	public void execute() {
		BoardServiceOracle service = null;
		service = new BoardServiceOracle();

//							    service = new StudentServiceImpl();// 메인 기능을 하는 메소드.
//				                service = new StudentServiceFile();// <-로 바꾸겠습니다.

		// service = new StudentServuceOracle();//<-로 바꾸겠습니다.
		
		
		
		
		
		while (true) {
			System.out.println(
					"------------------------------------------------------" + "\r\n" + "                       "
							+ "자유게시판\r\n" + "------------------------------------------------------");

			System.out.println("------------------------------------------------------"
					+ "\r\n   1 회원가입	       2 로그인		  3.나가기	"
					+ "\r\n------------------------------------------------------" + "\r\n선택>>");
			
			
			int menu = scn.nextInt();

			if (menu == 1) {// 회원가입

				int boardId = 0;

				System.out.println("SYSTEM: 회원가입 메뉴입니다\r\n");

				System.out.println("비밀번호를 입력하세요.");
				String boardPW = scn.next();
				System.out.println("사용할 닉네임을 입력하세요.");
				String name = scn.next();
				System.out.println("성별을 입력하세요.");
				String gender = scn.next();
				System.out.println("생년월일을 입력하세요.");
				String birth = scn.next();
				System.out.println("이메일을 입력하세요.");
				String email = scn.next();
				System.out.println("전화번호를 입력하세요.");
				String tel = scn.next();

				BoardMember s1 = new BoardMember(boardId, boardPW, name, gender, birth, email, tel);
				service.insertBoardMember(s1);

				System.out.println("회원가입이 완료되었습니다!");

				continue;

			} else if (menu == 2) {// 로그인 호출

				System.out.println("아이디 입력");
				int id = scn.nextInt();
				System.out.println("비밀번호");
				String pw = scn.next();

				int result = service.login(id, pw);

				if (result == 1) {

					System.out.println("로그인 성공! \r\n");

					System.out.println("\r\n==========================");
					System.out.println("1.회원정보 2.자유게시판 3.나가기");
					System.out.println("==========================\r\n");
					menu = scn.nextInt();

					if (menu == 1) {// 회원정보 출력
						System.out.println("회원정보 메뉴입니다.");

						System.out.println("\r\n=======================================");
						System.out.println("1.회원정보 확인 2.회원정보 수정 3.회원 삭제 4.나가기");
						System.out.println("=======================================\r\n");
						 menu = scn.nextInt();

						if (menu == 1) {

							System.out.println("회원 정보를 입력해주세요");

							System.out.println("조회할 ID번호 입력");
							int BoardId = scn.nextInt();
							list = service.searchBoardMember(BoardId);

							if (list.isEmpty()) {
								System.out.println("정보없음");
							} else {
								for (BoardMember i : list) {
									System.out.println(i.toString());
								}
								continue;
							}

						} else if (menu == 2) {// 회원정보 수정

							int boardId = scn.nextInt();
							System.out.println("수정할 대상의 ID 번호 입력");
							boardId = scn.nextInt();

							System.out.println("수정 할 비밀번호 입력");
							String boardPW = scn.next();

							System.out.println("수정 할 닉네임 입력");
							String name = scn.next();

							System.out.println("수정할 이메일 입력");
							String email = scn.next();

							System.out.println("수정 할 전화번호 입력");
							String tel = scn.next();

							BoardMember s1 = new BoardMember(boardId, boardPW, name, null, null, email, tel);
							service.modifyBoardMember(s1);
							System.out.println("처리가 완료되었습니다.");

						} else if (menu == 3) {// 회원삭제
							int Bno = scn.nextInt();
							System.out.println("삭제할 ID 번호를 입력하세요");
							Bno = scn.nextInt(id);

							service.removeBoardMember(Bno);
							System.out.println("처리가 완료되었습니다.");

						} else if (menu == 4) {// 나가기
							System.out.println("\r\n나가시겠습니까?" + "1. YES 2. NO\r\n");
							 menu = scn.nextInt();
							if (menu == 1) {
								System.out.println("종료합니다.");
								break;
							} else if (menu == 2) {
								continue;
							}
						} else {
							System.out.println("잘못된 입력값입니다.");
							continue;
						}

//==============================================================회원정보 끝===================================================
					} else if (menu == 2) {// 자유게시판 출력
						

						while (true) {
							System.out.println("--------------------------------------------------------------------"
											  +"\r\n                               자유게시판                              "
										  +"\r\n====================================================================\r\n"
											 + "  1.글쓰기      2.게시판 보기      3.글 수정하기      4.게시글삭제      5.나가기 \r\n"
											 + "==================================================================== ");
					            menu = scn.nextInt();
							
							if (menu == 1) {
								int BoardNo = 0;
								

								System.out.println("제목 입력||:");
								String title = scn.next();
								
								System.out.println("내용 입력||:");
								String content = scn.next();
								
								String name = null;
								Date regdate = null;
							


								BoardMember w1 = new BoardMember(BoardNo, name, title, content, regdate);
								service.insertBoard(w1);

								System.out.println("글 작성이 완료되었습니다.");

								continue;

							} else if (menu == 2) {// 게시판 보기
								

							} else if (menu == 3) {

							} else if (menu == 4) {

							} else if (menu == 5) {
								
								System.out.println("\r\n 자동으로 로그아웃 됩니다. 나가시겠습니까?" + "1. YES 2. NO\r\n");
							 menu = scn.nextInt();
								
								if (menu == 1) {
									System.out.println("로그아웃 후 게시판을 빠져나갑니다.");
									break;
								}else if (menu == 2) {
									continue;
								}
							

							} else {
								System.out.println("잘못된 입력값입니다.");
								continue;
							}
						} // ======================자게 while 끝======================

					} else if (menu == 3) {// 나가기
						System.out.println("\r\n나가시겠습니까?" + "1. YES 2. NO\r\n");
					 menu = scn.nextInt();
						if (menu == 1) {
							System.out.println("종료합니다.");
							break;
						} else if (menu == 2) {
							continue;
						}
					} else {// ㅈ같은 값 입력시
						System.out.println("잘못된 입력값입니다.");
						continue;
					}

//==============================================================자유게시판 끝===================================================

				} else if (result == 0) {
					System.out.println("비밀번호가 틀립니다.");

					continue;

				} else if (result == -2) {
					System.out.println("존재하지 않는 아이디입니다.");

					continue;
				}

			} else if (menu == 3) {// 나가기
				System.out.println("\r\n나가시겠습니까?" + "1. YES 2. NO\r\n");
			 menu = scn.nextInt();

				if (menu == 1) {
					System.out.println("종료합니다.");
					break;
				} else if (menu == 2) {
					continue;
				}
			} else {
				System.out.println("잘못된 입력값입니다.");
				continue;
			}

		} // 제일 큰 while 끝
	}// execute 끝
}// boardApp 끝