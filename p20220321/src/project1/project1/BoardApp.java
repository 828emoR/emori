package project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardApp {
	// ↓필드

	Scanner scn = new Scanner(System.in);

	// 생성자
	public BoardApp() {// 기본 생성자

	}

	// 멤버클래스.
	class BoardMemberServiceImpl implements BoardMemberService {
		List<BoardMember> list = new ArrayList<BoardMember>();

		@Override
		public void insertBoardMember(BoardMember board2) {// 회원정보 입력
			list.add(board2);

		}

		@Override
		public List<BoardMember> boardMemList() {// 리스트 출력
			return list;
		}

		@Override
		public void removeBoardMember(int Bno) {// 삭제
			List<BoardMember> searchBoardMember = new ArrayList<BoardMember>();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getName().equals(Bno)) {
					searchBoardMember.remove(list.get(i));
				}
			}
		}

		@Override
		public void modifyBoardMember(BoardMember board2) {// 수정
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getId() == board2.getId()) {
					list.get(i).setEmail(board2.getEmail());
					list.get(i).setName(board2.getName());
					list.get(i).setTel(board2.getTel());
				}
			}
		}

		@Override
		public List<BoardMember> searchBoardMember(int Bno) {// 한건찾기
			List<BoardMember> searchBoard = new ArrayList<BoardMember>();
			for (int i = 0; i < list.size(); i++) {

				if (list.get(i).getId().equals(Bno)) {
					searchBoard.add(list.get(i));

				}
			}
			return searchBoard;

		}// 끝

		@Override
		public Board getBoardMember(int Bno) {

			return null;
		}

	}

	// 메인 기능을 담당하는 execute()
	public void execute() {
		BoardServiceOracle service = null;
		service = new BoardServiceOracle();
//							    service = new StudentServiceImpl();// 메인 기능을 하는 메소드.
//				                service = new StudentServiceFile();// <-로 바꾸겠습니다.

		// service = new StudentServuceOracle();//<-로 바꾸겠습니다.

		while (true) {
			int menu = scn.nextInt();

			System.out.println("로그인이 필요한 서비스 입니다. 로그인 하시겠습니까? \r\n" + "1. YES 2.NO");
			if (menu == 1) {
				
				DAO memlog = new DAO();
				int result = memlog.login(BoardMember.getId(), BoardMember.getPw());
				if (result == 1) {

					System.out.println("로그인 성공!");

					while (true) {

						System.out.println("|--------------------------------|");
						System.out.println("| 1. 회원정보 2. 자유 게시판 3. 나가기   |");
						System.out.println("|--------------------------------|");
						if (menu == 1) {
							while (true) {

								System.out.println("|----------------*회 원 정 보 시 스 템*----------------|");
								System.out.println("|  1.회원가입 2.리스트 3.ID 번호로 조회 4.수정 5.삭제 9. 종료  |");
								System.out.println("|--------------------------------------------------|");
								System.out.println("선택>>");

								if (menu == 1) {

									System.out.println("SYSTEM: 회원가입 메뉴입니다");

									System.out.println("비밀번호를 입력하세요.");
									String pw = scn.next();
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

									BoardMember s1 = new BoardMember(null, pw, name, gender, birth, email, tel);
									service.insertBoardMember(s1);

								} else if (menu == 2) {
									List<BoardMember> list = service.boardMemList();
									for (BoardMember s : list) {
										System.out.println("=========================================================");
										System.out.println(s.toString());
										System.out.println("=========================================================");
									}

								} else if (menu == 3) {// 1건 조회
									System.out.println("조회할 ID번호 입력");
									int id = scn.nextInt();
									Board board = service.getBoardMember(id);

									if (board == null) {
										System.out.println("정보없음");
									} else {
										System.out.println(board.toString());
									}

								} else if (menu == 4) {// 수정정보 입력

									System.out.println("수정할 대상의 ID 번호 입력");
									int MoNo = scn.nextInt();

									System.out.println("수정 할 닉네임 입력");
									String name = scn.next();

									System.out.println("수정할 이메일 입력");
									String email = scn.next();

									System.out.println("수정 할 전화번호 입력");
									String tel = scn.next();

									BoardMember s1 = new BoardMember(null, null, name, null, null, email, tel);
									service.modifyBoardMember(s1);
									System.out.println("처리가 완료되었습니다.");

								} else if (menu == 5) {
									System.out.println("삭제할 ID 번호를 입력하세요");
									int Bno = scn.nextInt();

									service.removeBoardMember(Bno);
									System.out.println("처리가 완료되었습니다.");

								} else if (menu == 9) {
									System.out.println("시스템을 종료합니다.");
									break;
								}

							} // while 끝
							System.out.println("EOP");
						} else if (menu == 2) {// 자유게시판

							System.out.println("| ======================자유게시판=================== |\r"
									+ "| 1.글쓰기 2.글 목록 확인  3.글 수정하기  4.게시글삭제  5.나가기 |\r"
									+ "| ================================================ |");

							while (true) {
								if (menu == 1) {// 글쓰기

								} else if (menu == 2) {// 글 목록 확인

								} else if (menu == 3) {// 글 수정하기

								} else if (menu == 4) {// 게시글 삭제

								} else if (menu == 5) {// 나가기

								} else {

								}
							}
						} else if (menu == 3) {
							System.out.println("게시판을 종료하시겠습니까?\r" + "1.yes 2.no");
							if (menu == 1) {
								System.out.println("종료합니다.");
							}
							break;

						} else {
							return;
						}

					} // while 끝
				} else if (result == 0) {
					System.out.println("비밀번호가 틀립니다.");

				} else if (result == -2) {
					System.out.println("존재하지 않는 아이디입니다.");

				} else if (result == -1) {
					System.out.println("DB에 오류가 발생했습니다.");

				}

			}
		}
	}
}
