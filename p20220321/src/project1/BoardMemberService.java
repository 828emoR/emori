package project1;

import java.util.List;


public interface BoardMemberService {
	public void insertBoardMember(BoardMember board2);//회원정보 입력
	public List<BoardMember> boardMemList();//회원정보 전체목록
	public Board getBoardMember(int Bno);//한건 조회
	public void removeBoardMember(String name2);
	public void modifyBoardMember(BoardMember board2);
	public List<BoardMember> searchBoardMember(String name2);
	
}
  