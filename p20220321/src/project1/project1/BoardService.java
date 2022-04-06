
package project1;

import java.util.List;

//인터페이스는 실제로 클래스를 만드는게 아님. 기능에 대한 추상메소드. 
//임의의 소스를 지정, 정의해주는 공간.
//ㅅㅂ 그러면 왜 인터페이스라고 이름지은거임

public interface BoardService {
	
	public void insertBoard(BoardWrite board);//게시판 입력
	public BoardWrite getBoard(int no);//한건 조회
	public List<BoardWrite> boardList();//게시판 전체목록
	public void modifyBoard(BoardWrite board);//수정
	public void removeBoard(int no);
	public List<BoardWrite> searchBoard(String name);
}

  