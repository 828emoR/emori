package project1;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardServiceOracle extends DAO implements BoardMemberService, BoardService {
	Scanner scn = new Scanner(System.in);

	@Override
	public void insertBoardMember(BoardMember board2) {// 입력처리
		conn = getConnect();
		String sql = "insert into projectmember(id, Pw, name, gender, birth, email, tel) \r\n"
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
		String sql = "select * " + "from ProjectMember " + "where id = ?";

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

				return list;
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
	public int login(int id, String pw) {
		conn = getConnect();// DB연동시작

		String sql = "SELECT * FROM projectmember WHERE id = ? AND Pw = ?";

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, id);
			psmt.setString(2, pw);

			int r = psmt.executeUpdate();
			if (r != 0) {
				return 1;
			} else if (r == 0) {
				return 0;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return -2;
	}

	@Override
	public BoardWrite getBoardMember(int Bno) {
		return null;
	}// ----------보드멤버 끝------------

	@Override
	public void insertBoard(BoardWrite board) {
		conn = getConnect();
		String sql = "insert into project_board_001(boardno, title, contents, writer) \r\n"
				+ "values (board_seq.nextval, '테스트 제목', '내가', '글쓴이')";
		try {
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, board.getBoardNo());
			psmt.setString(2, board.getTitle());
			psmt.setString(3, board.getContent());
			psmt.setString(4, board.getWriter());

			psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public BoardWrite getBoard(int no) {
		return null;
	}

	@Override
	public List<BoardWrite> boardList() {// 한건(보드번)으로 조회
		List<BoardWrite> list = new ArrayList<BoardWrite>();
		String sql = "SELECT * " + "FROM project_board_001 " + "WHERE boardno = ? ";

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();// 실행건수만큼 반복자
			while (rs.next()) {// 반복자를 통해 요소를 가지고 올 수 있는치 체크. 있으면 하나
				BoardWrite boardW = new BoardWrite();

				boardW.setBoardNo(rs.getInt("boardno"));
				boardW.setContent(rs.getString("contents"));
				boardW.setTitle(rs.getString("title"));
				boardW.setWriter(rs.getString("Writer"));
				boardW.setRegdate(rs.getDate("regdate date default sysdate"));

				list.add(boardW);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void modifyBoard(BoardWrite board) {
		conn = getConnect();
		String sql = "update project_board_001 " + "		Set title = ? " + "		    contents = ? "
				+ "		Where boardno = ?";
		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, board.getTitle());
			psmt.setString(2, board.getContent());

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void removeBoard(int no) {
		conn = getConnect();
		String sql = "SELECT * " + "FROM project_board_001 " + "WHERE boardno = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, no);
			int r = psmt.executeUpdate(); // 실행
			System.out.println(r + "건 삭제완료.");
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public List<BoardWrite> searchBoard(String name) {
		List<BoardWrite> list = new ArrayList<BoardWrite>();
		String sql = "SELECT * " + "FROM project_board_001 ";

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();// 실행건수만큼 반복자
			while (rs.next()) {// 반복자를 통해 요소를 가지고 올 수 있는치 체크. 있으면 하나
				BoardWrite boardW = new BoardWrite();

				boardW.setBoardNo(rs.getInt("boardno"));
				boardW.setContent(rs.getString("contents"));
				boardW.setTitle(rs.getString("title"));
				boardW.setWriter(rs.getString("Writer"));
				boardW.setRegdate(rs.getDate("regdate date default sysdate"));

				list.add(boardW);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}// ----------------게시판 작성 끝------------------

}