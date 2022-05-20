package JB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import middle.dao.DAO;
import middle.vo.ProductVO;
import middle.vo.UserVO1;

public class AdminDAO extends DAO {
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

	// 유저정보검색
	public UserVO1 selectUser(String user) {
		String sql = "select * from user_info where id = ?";
		try {
			conn = getConnect();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, user);
			rs = psmt.executeQuery();
			if (rs.next()) {
				UserVO1 vo = new UserVO1();
				vo.setUid(rs.getString("id"));
				vo.setUpw(rs.getString("pw"));
				vo.setUname(rs.getString("name"));
				vo.setUtel(rs.getString("tel"));
				vo.setUemail(rs.getString("email"));
				vo.setUadress(rs.getString("address"));
				return vo;
			}
			;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return null;
	}

	// 관리자물건검색
	public ProductVO adminProSearch(String productcode) {
		String sql = "select * from product where product_code = ?";
		try {
			conn = getConnect();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, productcode);
			rs = psmt.executeQuery();
			if (rs.next()) {
				ProductVO vo = new ProductVO();
				vo.setProductCode(rs.getInt("product_code"));
				vo.setProductCate(rs.getString("product_category"));
				vo.setProductName(rs.getString("product_name"));
				vo.setProductPrice(rs.getInt("product_price"));
				vo.setProductAmount(rs.getInt("product_amount"));
				vo.setProductExp(rs.getString("product_exp"));
				vo.setProductImg(rs.getString("product_img"));
				vo.setProductDate(rs.getString("product_date"));
				return vo;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return null;

	}

	// 상품정보
	public List<ProductVO> Prolist() {
		List<ProductVO> list = new ArrayList<ProductVO>();
		String sql = "select * from product order by 1";

		try {
			conn = getConnect();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				ProductVO vo = new ProductVO();
				vo.setProductCode(rs.getInt("product_code"));
				vo.setProductCate(rs.getString("product_category"));
				vo.setProductName(rs.getString("product_name"));
				vo.setProductPrice(rs.getInt("product_price"));
				vo.setProductAmount(rs.getInt("product_amount"));
				vo.setProductExp(rs.getString("product_exp"));
				vo.setProductImg(rs.getString("product_img"));
				vo.setProductDate(rs.getString("product_date"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}
	//상품정보수정
	public void adminProMod (ProductVO pro) {
		String sql = "update product set product_category = ?, product_name =?,\r\n"
				+ "product_price = ?, product_amount = ?, product_exp = ? where product_code =?";
		
		
		try {
			conn = getConnect();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, pro.getProductCate());
			psmt.setString(2, pro.getProductName());
			psmt.setInt(3, pro.getProductPrice());
			psmt.setInt(4, pro.getProductAmount());
			psmt.setString(5, pro.getProductExp());
			psmt.setInt(6, pro.getProductCode());
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		
	}
	
	
	public void adminProDel (String productCode) {
		String sql = "delete from product where product_code=?";
		
		try {
			conn = getConnect();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, productCode);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
}