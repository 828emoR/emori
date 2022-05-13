package co.dev.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.dev.DAO;
import co.dev.vo.MemberVO;

public class MemberDAO extends DAO {
	
	//회원정보 수정
	public void updateMember(MemberVO vo) {
		conn = getConnect();
		String sql = "update member " + "set id = ? "+  " name = ? " + " passwd = ? " +  " email = ? " + "where id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getPasswd());
			psmt.setString(5, vo.getEmail());
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정완료");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	
	//회원탈퇴
	public void deleteMember(String id) {
		conn = getConnect();
		String sql = "delete from member where id=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	
	//회원검색
	public MemberVO searchMember (String id) {
		conn = getConnect();
		String sql = "select * from member where id=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			if(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setPasswd(rs.getString("passwd"));
				vo.setEmail(rs.getString("email"));
				return vo;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return null;
	}
	//회원정보
	public List<MemberVO> listMember(){
		conn = getConnect();
		List<MemberVO> list =new ArrayList<MemberVO>();
		
		try {
			psmt = conn.prepareStatement("select * from member order by id");
			rs = psmt.executeQuery();
			while(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setEmail(rs.getString("email"));
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setPasswd(rs.getString("passwd"));

				list.add(vo);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}
	//회원가입
	public void insertMember(MemberVO member) {
		conn = getConnect();
		String sql = "insert into member(id, pw, name, phone, email) values(?,?,?,?,?,?)";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member.getId());
			psmt.setString(2, member.getName());
			psmt.setString(3, member.getPasswd());

			psmt.setString(5, member.getEmail());
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
}
