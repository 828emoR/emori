package project1;

import java.util.List;

public interface BoardMemberService {
	public void insertBoard(BoardMember board2);//회원정보 입력
	public List<BoardMember> board2List();//회원정보 전체목록
	public void removeBoard(String name2);
	public void modifyBoard(BoardMember board2);
	public List<BoardMember> searchBoard(String name2);
}
