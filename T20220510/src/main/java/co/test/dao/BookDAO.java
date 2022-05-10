package co.test.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.test.vo.BookVO;

public class BookDAO extends DAO {

	public List<BookVO> bookList() {
		
		conn();
		
		List<BookVO> list = new ArrayList<BookVO>();
		
		try {
			psmt = conn.prepareStatement("SELECT *\r\n"
					+ "FROM   book_info\r\n"
					+ "ORDER  BY 1");
			rs = psmt.executeQuery();
			while(rs.next()) {
				BookVO vo = new BookVO();
				vo.setBookCode(rs.getString("book_Code"));
				vo.setBookTitle(rs.getString("book_Title"));
				vo.setBookAuthor(rs.getString("book_Author"));
				vo.setBookPress(rs.getString("book_Press"));
				vo.setBookPrice(rs.getInt("book_Price"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return list;
	}

	public BookVO selectBook(String bookCode) {
		conn();
		String sql = "SELECT *\r\n"
				+ "FROM   book_info\r\n"
				+ "WHERE BOOK_CODE = ?";
		BookVO vo = new BookVO();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, bookCode);
			rs = psmt.executeQuery();
			if(rs.next()) {
				vo.setBookCode(rs.getString("book_Code"));
				vo.setBookTitle(rs.getString("book_Title"));
				vo.setBookAuthor(rs.getString("book_Author"));
				vo.setBookPress(rs.getString("book_Press"));
				vo.setBookPrice(rs.getInt("book_Price"));
			}
			int r = psmt.executeUpdate();
			System.out.println(r + "건 조회완료");
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		return vo;
	}

	public void insertBook(BookVO book) {
		conn();
		String sql = "insert into book_info(book_code, book_title, book_author, book_press, book_price)\r\n"
				+ "values(\r\n"
				+ "create_bookcode ,\r\n"
				+ "'textttt' ||  SUBSTR(create_bookcode,10,12),\r\n"
				+ "'bigtest' || SUBSTR(create_bookcode,10,12),\r\n"
				+ "'newpress' || SUBSTR(create_bookcode,10,12),\r\n"
				+ "SUBSTR(create_bookcode,10,12) * 1000)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, book.getBookCode());
			psmt.setString(2, book.getBookTitle());
			psmt.setString(3, book.getBookAuthor());
			psmt.setString(4, book.getBookPress());
			psmt.setInt(5, book.getBookPrice());
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력성공");
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}finally {
			disconn();
			
		}
		
	}

	public void updateBook(BookVO book) {
		String sql = "update book_info\r\n"
				+ "set book_code = create_bookcode ,\r\n"
				+ "book_title = 'textttt' ||  SUBSTR(create_bookcode,10,12),\r\n"
				+ "book_author = 'bigtest' || SUBSTR(create_bookcode,10,12),\r\n"
				+ "book_press = 'newpress' || SUBSTR(create_bookcode,10,12),\r\n"
				+ "book_price = SUBSTR(create_bookcode,10,12) * 1000\r\n"
				+ "WHERE BOOK_CODE = '20220510-001'";
	}

	public void deleteBook(String bookCode) {
		String sql = "delete from book_info where book_code = '?'";
	}
}
