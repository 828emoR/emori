
//package middle.dao;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import middle.vo.qnaVO;
//
//public class qnaDAO extends DAO{
//	
//	Connection conn;
//	ResultSet rs;
//	 PreparedStatement psmt; 
//	 
//	 public String getDate() {
//		 conn = getConnect();
//		 String sql = "select now()";
//		 try {
//			 psmt = conn.prepareStatement(sql);
//			 rs = psmt.executeQuery();
//			 if(rs.next()) {
//				 return rs.getString(1);
//			 }
//		 }catch(Exception e) {
//			 e.printStackTrace();
//		 }finally {
//			 disconnect();
//	 }
//		 return "";
//	 }
//	 
//	 public int getNext() {
//		 conn = getConnect();
//		 String sql = "select qna_no from qna order by qna_no desc";
//		 try {
//			 psmt = conn.prepareStatement(sql);
//			 rs = psmt.executeQuery();
//			 if(rs.next()) {
//				 return rs.getInt(1)+1;
//			 }
//			 return 1;
//		 }catch(Exception e) {
//			 e.printStackTrace();
//		 }finally {
//			 disconnect();
//	 }
//		 return -1;
//	 }
//	
//	 public void write(String qnaTitle, String qnaContent, String id, qnaVO qna) {
//		 conn = getConnect();
//		 String sql = "insert into qna(qna_date,qna_no,qna_pw,qna_category,product_code,qna_writer,qna_title,qna_content,id) values(?,?,?,?,?,?,?,?,?)";
//		 try {
//			 psmt.setString(1, qna.getQnaDate());
//			 psmt.setString(2, qna.getProductCode());
//			 psmt.setString(3, qna.getQnaCategory());
//			 psmt.setString(4, qna.getQnaWrite());
//			 psmt.setString(5, qnaTitle);
//			 psmt.setString(6, qnaContent);
//			 psmt.setString(7, getDate());
//			 psmt.setString(8, id);
//			 int r = psmt.executeUpdate();
//			 System.out.println(r + "건 입력되었습니다");
//		 }catch(SQLException e) {
//			 e.printStackTrace();
//		 }finally {
//			 disconnect();
//		 }
//	 }
//	 
////	 public qnaVO getqna(int qnaNo) {
////		 conn = getConnect();
////		 String sql = "select * from qna where qna_no = ?";
////		 try {
////			 psmt = conn.prepareStatement(sql);
////			 rs = psmt.executeQuery();
////			 if(rs.next()) {
////				 qnaVO qnavo = new qnaVO();
////					qnavo.setQnaDate(rs.getString("qna_date"));
////					qnavo.setQnaNo(rs.getInt("qna_no"));
////					qnavo.setQnaPw(rs.getString("qna_pw"));
////					qnavo.setQnaCategory(rs.getString("qna_category"));
////					qnavo.setProductCode(rs.getString("product_code"));
////					qnavo.setQnaWrite(rs.getString("qna_writer"));
////					qnavo.setQnaTitle(rs.getString("qna_title"));
////					qnavo.setQnaContent(rs.getString("qna_content"));
////					qnavo.setId(rs.getString("id"));
////					return qnavo;
////			 }
////		 }catch (SQLException e) {
////			 e.printStackTrace();
////		 }finally {
////			 disconnect();
////		 }
////	 }
//	public List<qnaVO> getList() {
//		conn = getConnect();
//		getConnect();
//		List<qnaVO> list = new ArrayList<qnaVO> ();
//		try {
//			psmt = conn.prepareStatement("select*from qna order by qna_no desc");
//			rs = psmt.executeQuery();
//			while(rs.next()) {
//				qnaVO qnavo = new qnaVO();
//				qnavo.setQnaCategory(rs.getString("qna_category"));
//				qnavo.setQnaNo(rs.getInt("qna_no"));
//				qnavo.setProductCode(rs.getString("product_code"));
//				qnavo.setId(rs.getString("id"));
//				qnavo.setQnaTitle(rs.getString("qna_title"));
//				qnavo.setQnaContent(rs.getString("qna_content"));
//				qnavo.setQnaWrite(rs.getString("qna_writer"));
//				qnavo.setQnaDate(rs.getString("qna_date"));
//				qnavo.setQnaPw(rs.getString("qna_pw"));
//				list.add(qnavo);
//			}
//		}catch (SQLException e) {
//			e.printStackTrace();
//		}finally {
//			disconnect();
//		}
//		return list;
//	}
//}

package middle.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import middle.vo.qnaVO;

public class qnaDAO extends DAO{
	
	Connection conn;
	ResultSet rs;
	 PreparedStatement psmt; 
	 
	 //문의글 전체리스트
	public List<qnaVO> getList() {
		conn = getConnect();
		getConnect();
		List<qnaVO> list = new ArrayList<qnaVO> ();

		try {
			psmt = conn.prepareStatement("select*from qna order by qna_no desc");
			rs = psmt.executeQuery();
			while(rs.next()) {
				qnaVO qnavo = new qnaVO();
				qnavo.setQnaCategory(rs.getString("qna_category"));
				qnavo.setQnaNo(rs.getInt("qna_no"));
				qnavo.setProductCode(rs.getString("product_code"));
				qnavo.setId(rs.getString("id"));
				qnavo.setQnaTitle(rs.getString("qna_title"));
				qnavo.setQnaContent(rs.getString("qna_content"));
				qnavo.setQnaWrite(rs.getString("qna_writer"));
				qnavo.setQnaDate(rs.getString("qan_date"));
				qnavo.setQnaPw(rs.getString("qna_pw"));
				list.add(qnavo);

			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}
	
	//문의번호 클릭시 문의글 상세보기
	public qnaVO qnaDetail(int qnaNo) {
		conn = getConnect();
		getConnect();
		String sql = "select q.qna_no, q.qan_date, p.product_code, q.qna_writer, q.qna_title, q.qna_content\r\n"
				+ "from qna q join product p\r\n"
				+ "on(q.product_code = p.product_code)\r\n"
				+ "where q.qna_no = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, qnaNo);
			rs = psmt.executeQuery();
			if(rs.next()) {
				qnaVO vo = new qnaVO();
				vo.setQnaNo(rs.getInt("qna_no"));
				vo.setQnaDate(rs.getString("qan_date"));
				vo.setProductCode(rs.getString("product_code"));
				vo.setQnaWrite(rs.getString("qna_writer"));
				vo.setQnaTitle(rs.getString("qna_title"));
				vo.setQnaContent(rs.getString("qna_content"));
				return vo;
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				disconnect();
			}
		return null;
	}
	
	//글쓰기
	public void writeQna(qnaVO qna) {
		conn = getConnect();
		getConnect();
		String sql = "";
	}
	
	
}
