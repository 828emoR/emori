
package project1;

import java.util.List;

//인터페이스는 실제로 클래스를 만드는게 아님. 기능에 대한 추상메소드. 
//임의의 소스를 지정, 정의해주는 공간.
//ㅅㅂ 그러면 왜 인터페이스라고 이름지은거임

public interface BoardService {
	
	public void insertBoard(BoardMember board);//게시판 입력
	public BoardMember getBoard(int no);//한건 조회
	public List<BoardMember> boardList();//게시판 전체목록
	public void modifyBoard(BoardMember board);//수정
	public void removeBoard(int no);
	public List<BoardMember> searchBoard(int Bwno);
	
	
	public void insertBoardMember(BoardMember board);//회원정보 입력
	public List<BoardMember> boardMemList();//회원정보 전체목록
	public BoardMember getBoardMember(int Bno);//한건 조회
	public void removeBoardMember(String id);
	public void modifyBoardMember(BoardMember board);
	public List<BoardMember> searchBoardMember(String id);
	public int login(String name, String pw);
}

  