package middle.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import middle.dao.DAO;
import middle.vo.ProductVO;

public class ProductDAO extends DAO {

	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;

	// 상품등록
	public void insertProduct(ProductVO product) {
		conn = getConnect();
		String sql = "insert into product(product_code,product_category,product_name,product_price,product_amount,product_exp,product_img,product_date) values(product_seq,?,?,?,?,?,?,sysdate)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, product.getProductCate());
			psmt.setString(2, product.getProductName());
			psmt.setInt(3, product.getProductPrice());
			psmt.setInt(4, product.getProductAmount());
			psmt.setString(5, product.getProductExp());
			psmt.setString(6, product.getProductImg());

			int r = psmt.executeUpdate();
			System.out.println(r + "건의 상품이 등록되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}
	
	
	// 간식 카테고리
	public List<ProductVO> listSnack() {
		List<ProductVO> productList = new ArrayList<ProductVO>();
		conn = getConnect();
		String sql = "select * from product where product_category = '간식'";
		try {
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

				productList.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return productList;
	}
	
	// 장난감 카테고리
	public List<ProductVO> listToy() {
		List<ProductVO> productList = new ArrayList<ProductVO>();
		conn = getConnect();
		String sql = "select * from product where product_category = '장난감'";
		try {
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

				productList.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return productList;
	}
	
	// 실내용품 카테고리
	public List<ProductVO> listGoods() {
		List<ProductVO> productList = new ArrayList<ProductVO>();
		conn = getConnect();
		String sql = "select * from product where product_category = '실내용품'";
		try {
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

				productList.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return productList;
	}
	
	// 목욕/미용 카테고리
	public List<ProductVO> listWash() {
		List<ProductVO> productList = new ArrayList<ProductVO>();
		conn = getConnect();
		String sql = "select * from product where product_category = '목욕/미용'";
		try {
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

				productList.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return productList;
	}

//	// 카테고리별보기 -> 카테고리별로 보기(1.간식 2.장난감 3.실내용품 4.목욕/미용)
//	public List<ProductVO> listProduct(String product_category) {
//		List<ProductVO> productList = new ArrayList<ProductVO>();
//		conn = getConnect();
//		String sql = "select * from product where product_category = ?";
//		try {
//			psmt = conn.prepareStatement(sql);
//			psmt.setString(1, product_category);
//			rs = psmt.executeQuery();
//			while (rs.next()) {
//				ProductVO vo = new ProductVO();
//				vo.setProductCode(rs.getString("product_code"));
//				vo.setProductCate(rs.getString("product_category"));
//				vo.setProductName(rs.getString("product_name"));
//				vo.setProductPrice(rs.getInt("product_price"));
//				vo.setProductAmount(rs.getInt("product_amount"));
//				vo.setProductExp(rs.getString("product_exp"));
//				vo.setProductImg(rs.getString("product_img"));
//				vo.setProductDate(rs.getString("product_date"));
//
//				productList.add(vo);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			disconnect();
//		}
//		return productList;
//	}

	// 최신목록
	public List<ProductVO> listNew() {
		conn = getConnect();
		List<ProductVO> newList = new ArrayList<ProductVO>();
		String sql = "select * from (select * from product order by product_code DESC) "
				+ "where rownum <=9";
		try {
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

				newList.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return newList;
	}

	// 상품상세보기
	public ProductVO productDetail(String product_code) {
		conn = getConnect();
		String sql = "select * from product where product_code = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, product_code);
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

}
