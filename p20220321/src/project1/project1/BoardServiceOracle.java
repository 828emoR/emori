package project1;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.edu.collect.Student;

public class BoardServiceOracle extends DAO implements BoardMemberService/*, /*BoardService*/ {
	Scanner scn = new Scanner(System.in);

	@Override
	public void insertBoardMember(BoardMember board2) {// 입력처리
		conn = getConnect();
		String sql = "insert into projectmember(Memberid, Password, Nickname, gender, birth, email, tel) \r\n"
				+ "values (board_mem_seq.nextval, ?, ?, ?, ?, ?, ?)";

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(2, board2.getPw());

			psmt.setString(3, board2.getName());

			psmt.setString(4, board2.getGender());

			psmt.setString(5, board2.getBirth());

			psmt.setString(6, board2.getEmail());

			psmt.setString(7, board2.getTel());

			psmt.executeUpdate();

			System.out.println("정상입력 완료");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public List<BoardMember> searchBoardMember(int Bno) {// 한건 조회
		conn = getConnect();
		List<BoardMember> list = new ArrayList<BoardMember>();
		String sql = "select * " + "from ProjectMember " + "where name like '%'||?||'%'";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, Bno);
			rs = psmt.executeQuery();
			while (rs.next()) {
				BoardMember Bom = new BoardMember();

				Bom.setId(rs.getInt("id"));
				Bom.setName(rs.getString("name"));
				Bom.setEmail(rs.getString("email"));
				Bom.setTel(rs.getString("tel"));

				list.add(Bom);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;

	}

	@Override
	public List<BoardMember> boardMemList() {// 전체회원출력
		List<BoardMember> list = new ArrayList<BoardMember>();// 조회된 결과값을 담기위한 컬렉션.

		conn = getConnect();
		String sql = "select * from projectMember order by id";

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();// 실행건수만큼 반복자
			while (rs.next()) {// 반복자를 통해 요소를 가지고 올 수 있는치 체크. 있으면 하나
				BoardMember board2 = new BoardMember();

				board2.setName(rs.getString("name"));
				board2.setTel(rs.getString("tel"));
				board2.setEmail(rs.getString("email"));

				list.add(board2);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void modifyBoardMember(BoardMember board2) {// 회원정보 수정
		conn = getConnect();
		String sql = "UPDATE ProjectMember " + "SET name = ? " + "email = ? " + "tel = ? " + "where id = ?";
		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, board2.getName());
			psmt.setString(2, board2.getEmail());
			psmt.setString(3, board2.getTel());
			psmt.setInt(4, board2.getId());

			int r = psmt.executeUpdate();

			System.out.println(r + "건 수정 완료");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void removeBoardMember(int Bno) {
		  conn = getConnect();
	      String sql = "delete from projectmember " + "where id = ?";
	      try {
	         psmt = conn.prepareStatement(sql);
	         psmt.setInt(1, Bno);
	         int r = psmt.executeUpdate(); // 실행
	         System.out.println(r + "건 삭제완료.");
	      } catch (SQLException e) {

	         e.printStackTrace();
	      } finally {
	         disconnect();
	      }

	   }
		


	

	@Override
	public Board getBoardMember(int Bno) {
		return null;
	}// ----------보드멤버 끝------------


	@Override
	public void insertBoard(Board board) {
		
	}

	@Override
	public Board getBoard(int no) {
		return null;
	}

	@Override
	public List<Board> boardList() {
		return null;
	}

	@Override
	public void modifyBoard(Board board) {
		
	}

	@Override
	public void removeBoard(int no) {
		
	}

	@Override
	public List<Board> searchBoard(String name) {
		return null;
	}//----------------게시판 작성 끝------------------

	}