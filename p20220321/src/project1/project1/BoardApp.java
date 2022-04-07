package project1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardApp {
	// ↓필드

	Scanner scn = new Scanner(System.in);
	List<BoardMember> list = new ArrayList<BoardMember>();
	static int UserNo = 0;
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
					"------------------------------------------------------" 
			+ "\r\n" 
							+ "                       "+ "자유게시판\r\n"
			+ "------------------------------------------------------");

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
				int id = service.userCheck(tel);
			
				System.out.println("  ┌───────────────────────────────────────────────────┐");
				System.out.println("  |  가입하신 계정의 id는 " + id +" 입니다. 잊어버리지 않게 주의해주세요! │");
				System.out.println("  └──────────────────────┐"+ "  ┌─────────────────────────┘");
				System.out.println("                         |"+" /");
				System.out.println("\t\t  *゜   (\\__(\\\r\n"
								 + "\t\t   c(⌒(_*´ㅅ`)_\r\n"
								 	+ "");
				
				continue;

			} else if (menu == 2) {// 로그인 호출
				System.out.println("\r\n===========");
				System.out.println("아이디 입력 >>");
				System.out.println("===========\r\n");
				int id = scn.nextInt();
				System.out.println("\r\n============");
				System.out.println("비밀번호 입력>>");
				System.out.println("=============\r\n");
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
							System.out.println("\r\n=============");
							System.out.println("조회할 ID번호 입력 >>");
							System.out.println("=================\r\n");
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
							
							System.out.println("삭제할 ID 번호를 입력하세요");
							int Bno = scn.nextInt();
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
						List<BoardMember> list = new ArrayList<BoardMember>();

						while (true) {
							System.out.println("\n\n\n-----------------------------------------------------------------------------------"
											  +"\r\n                                    자유게시판                              "
										  +"\r\n===================================================================================\r\n"
											 + "     1.글쓰기 	 2.게시판 보기 	  3.글 수정하기	   4.게시글삭제  	 5.나가기  \r\n"
											 + "===================================================================================\n\n\n ");
					            menu = scn.nextInt();
							
							if (menu == 1) {
								
								System.out.println("제목 입력||:" + "");
								scn.nextLine();
								String title = scn.nextLine();
								
								System.out.println("내용 입력||:");
								String content = scn.nextLine();
								
							   
								
							    
								System.out.println("작성자의 ID 를 입력해주세요");
								int bno = scn.nextInt();
								String name = service.searchName(bno);
								System.out.println(name);
								BoardMember w1 = new BoardMember(0,name, title, content,null);
								service.insertBoard(w1);

								System.out.println("글 작성이 완료되었습니다.");
								System.out.println("\r\n====================================================================\n\n\n\n");
								continue;

							} else if (menu == 2) {// 게시판 보기
								
								
								
								System.out.println("\n\n\n-----------------------------------------------------------------------------------"
										  +"\r\n                               자유게시판                              "
										  		  +"\r\n===================================================================================");
								
								List<BoardMember> list1 = service.boardList();
								for(BoardMember i : list1) {
									System.out.println(i.toString2());
								}
					System.out.println("\r\n===================================================================================\n\n\n\n");
							} else if (menu == 3) {
								
								System.out.println("작성자의 ID 를 입력해주세요");
								int bno = scn.nextInt();
								boolean truefalse = service.userCheak(bno);
								
								if(truefalse == true) {
									
									System.out.println("수정할 게시글 번호를 입력하세요");
									int BoardNo = scn.nextInt();
									
									scn.nextLine();
									System.out.println("수정할 제목을 입력하세요");
									String title = scn.nextLine();
									
									
									System.out.println("수정할 내용을 입력하세요");
									String content = scn.nextLine();
									
									BoardMember m1 = new BoardMember(BoardNo, title, content);
									
									service.modifyBoard(m1);
									
									System.out.println("정상적으로 수정되었습니다.");
								}
								else
								{
									System.out.println("본인이 쓴 게시글이 아닙니다.");
								}
								
								
								
								
								

							} else if (menu == 4) {
								System.out.println("작성자의 ID 를 입력해주세요");
								int bno = scn.nextInt();
								boolean truefalse = service.userCheak(bno);
								if(truefalse == true)
								{
									System.out.println("삭제할 게시글의 번호를 입력하세요.");
									int BoardNo = scn.nextInt();
									service.removeBoard(BoardNo);
								}
								else
								{
									System.out.println("본인이 쓴 게시글이 아닙니다.");
								}
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