package co.project.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.project.vo.UserInfoVO;

public class UserInfoDAO extends DAO {

	
	//회원정보
	public List<UserInfoVO> UserList() {	
		conn();		
		List<UserInfoVO> list = new ArrayList<UserInfoVO>();

		try {
			psmt = conn.prepareStatement("SELECT * FROM user_info order by id");
			rs = psmt.executeQuery();
				while(rs.next()) {	
				UserInfoVO vo = new UserInfoVO();
				vo.setId(rs.getString("id"));
				vo.setPw(rs.getString("pw"));
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));
				vo.setEmail(rs.getString("email"));
				vo.setAddress(rs.getString("address"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}

	public UserInfoVO selectUser(String UserSel) {
		conn();
		String sql = "SELECT * FROM user_info "
				+ "where id= ?";
		UserInfoVO vo = new UserInfoVO();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, UserSel);
			rs = psmt.executeQuery();
			if(rs.next()) {
				vo.setId(rs.getString("id"));
				vo.setPw(rs.getString("pw"));
				vo.setName(rs.getString("name"));
				vo.setTel(rs.getString("tel"));
				vo.setEmail(rs.getString("email"));
				vo.setAddress(rs.getString("address"));
				
				int r = psmt.executeUpdate();
				System.out.println(r + "건 조회완료");
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}

	public void insertUser(UserInfoVO UserInst) {
		conn();
		String sql = "insert into user_info(id, pw, name, tel, email, address) "
				+ "values (?, ?, ?, ?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, UserInst.getId());
			psmt.setString(2, UserInst.getPw());
			psmt.setString(3, UserInst.getName());
			psmt.setString(4, UserInst.getTel());
			psmt.setString(5, UserInst.getEmail());
			psmt.setString(6, UserInst.getAddress());
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력성공");
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}finally {
			disconn();
			
		}
	}

	public void updateUser(UserInfoVO UserInst) {
		conn();
		String sql = "UPDATE user_info \r\n"
				+ "SET id = ?, "
				+ "pw = ?, "
				+ "name = ?, "
				+ "tel = ?, "
				+ "email = ?, "
				+ "address = ?, "
				+ "where id = ? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, UserInst.getId());
			psmt.setString(2, UserInst.getPw());
			psmt.setString(3, UserInst.getName());
			psmt.setString(4, UserInst.getTel());
			psmt.setString(5, UserInst.getEmail());
			psmt.setString(6, UserInst.getAddress());
		
		int r = psmt.executeUpdate();
		System.out.println(r + "건 수정성공");
		
	} catch (SQLException e) {
	
		e.printStackTrace();
	}finally {
		disconn();
		
	}
}
	
	

	

	public void deleteUser(String UserSel) {
		conn();
		String sql = "DELETE FROM user_info WHERE ID = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, UserSel);
			rs = psmt.executeQuery();
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}finally {
			disconn();
			
		}
		
	}

	}

