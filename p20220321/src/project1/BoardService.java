
package project1;

import java.util.List;

//인터페이스는 실제로 클래스를 만드는게 아님. 기능에 대한 추상메소드. 
//임의의 소스를 지정, 정의해주는 공간.
//ㅅㅂ 그러면 왜 인터페이스라고 이름지은거임

public interface BoardService {
	
	public void insertBoard(Board board);//게시판 입력
	public Board getBoard(int no);//한건 조회
	public List<Board> boardList();//게시판 전체목록
	public void modifyBoard(Board board);//한건등록
	public void removeBoard(int no);
	public List<Board> searchBoard(String name);
	public void saveToFile();
	

}

  