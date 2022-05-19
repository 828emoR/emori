package JB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import middle.dao.DAO;
import middle.vo.UserVO1;

public class AdminDAO extends DAO{
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	public List<UserVO1> Userlist() {
		// 유저정보 불러오기\
		
		List<UserVO1> list = new ArrayList<UserVO1>();
		String sql = "select * from user_info order by 1";
		try {
			conn = getConnect();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				UserVO1 vo = new UserVO1();
				vo.setUid(rs.getString("id"));
				vo.setUpw(rs.getString("pw"));
				vo.setUname(rs.getString("name"));
				vo.setUtel(rs.getString("tel"));
				vo.setUemail(rs.getString("email"));
				vo.setUadress(rs.getString("address"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	public UserVO1 selectUser(String user) {
		String sql ="select * from user_info where id = ?";
		try {
			conn = getConnect();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, user);
			rs = psmt.executeQuery();
			if(rs.next()) {
				UserVO1 vo = new UserVO1();
				vo.setUid(rs.getString("id"));
				vo.setUpw(rs.getString("pw"));
				vo.setUname(rs.getString("name"));
				vo.setUtel(rs.getString("tel"));
				vo.setUemail(rs.getString("email"));
				vo.setUadress(rs.getString("address"));
				return vo;
			};
		} catch (SQLException e) {	
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return null;
	}
}
