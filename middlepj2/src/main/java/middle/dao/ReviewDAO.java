package middle.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import middle.vo.ReviewVO;

public class ReviewDAO extends DAO {
	
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	
	// 리뷰쓰기
	public void insertReview(ReviewVO review) {
		conn = getConnect();
		String sql = "insert into review "
				+ "values(review_seq, ?, ?, ?, ?, ?, ?, sysdate, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, review.getOrderCode());
			psmt.setInt(2, review.getProductCode());
			psmt.setString(3, review.getId());
			psmt.setString(4, review.getReviewPass());
			psmt.setString(5, review.getReviewTitle());
			psmt.setString(6, review.getReviewContent());
			psmt.setString(7, review.getReviewImg());
			psmt.setInt(8, review.getReviewStar());
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 등록");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	// 리뷰수정
	public void modifyReview(ReviewVO review) {
		conn = getConnect();
		String sql = "update review "
				+ "set review_title = ?, review_content = ?, review_img = ?, review_star = ? "
				+ "where review_code = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, review.getReviewTitle());
			psmt.setString(2, review.getReviewContent());
			psmt.setString(3, review.getReviewImg());
			psmt.setInt(4, review.getReviewStar());
			psmt.setInt(5, review.getReviewCode());
			
			rs = psmt.executeQuery();
			if(rs.next()) {
				review.setReviewTitle(rs.getString("review_title"));
				review.setReviewContent(rs.getString("review_content"));
				review.setReviewImg(rs.getString("review_img"));
				review.setReviewStar(rs.getInt("review_star"));
				review.setReviewCode(rs.getInt("review_code"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
	}
	
	// 리뷰삭제
	public void deleteReview(int reviewCode) {
		conn = getConnect();
		String sql = "delete from review where review_code = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, reviewCode);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
	}
	
	
	// 리뷰리스트
	public List<ReviewVO> reviewList() {
		conn = getConnect();
		List<ReviewVO> list = new ArrayList<ReviewVO>();
		String sql = "select * from book_info order by review_code DESC";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				ReviewVO vo = new ReviewVO();
				vo.setReviewCode(rs.getInt("review_code"));
				vo.setOrderCode(rs.getInt("order_code"));
				vo.setProductCode(rs.getInt("product_code"));
				vo.setId(rs.getString("writer"));
				vo.setReviewPass(rs.getString("review_pw"));
				vo.setReviewTitle(rs.getString("review_title"));
				vo.setReviewContent(rs.getString("review_content"));
				vo.setReviewDate(rs.getString("review_date"));
				vo.setReviewImg(rs.getString("review_img"));
				vo.setReviewStar(rs.getInt("review_star"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
		
	}
	
	// 

}
