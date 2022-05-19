package co.test.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.test.vo.BookVO;

public class BookDAO extends DAO {

	public List<BookVO> bookList() {

		System.out.println("DB연결 시도중");
		conn();
		System.out.println("DB 연결완료");

		List<BookVO> list = new ArrayList<BookVO>();

		try {
			psmt = conn.prepareStatement("SELECT *\r\n" + "FROM   book_info\r\n" + "ORDER  BY 1");
			rs = psmt.executeQuery();
			while (rs.next()) {
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
		} finally {
			disconn();
		}
		return list;
	}

	public BookVO selectBook(String bookCode) {
		System.out.println("DB연결 시도중");
		conn();
		System.out.println("DB 연결완료");
		String sql = "SELECT *  FROM   book_info " + "WHERE BOOK_CODE = ?";
		BookVO vo = new BookVO();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, bookCode);
			rs = psmt.executeQuery();
			if (rs.next()) {
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
		System.out.println("DB연결 시도중");
		conn();
		System.out.println("DB 연결완료");
		String sql = "insert into book_info(book_code, book_title, book_author, book_press, book_price) "
				+ "values (create_bookcode, ?, ?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, book.getBookTitle());
			psmt.setString(2, book.getBookAuthor());
			psmt.setString(3, book.getBookPress());
			psmt.setInt(4, book.getBookPrice());
			System.out.println("입력 시도중");
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력성공");

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			disconn();

		}

	}

	public void updateBook(BookVO book) {
		System.out.println("DB연결 시도중");
		conn();
		System.out.println("DB 연결완료");
		String sql = "update book_info\r\n" + "set\r\n" + "book_title = ?,\r\n" + "book_author = ?,\r\n"
				+ "book_press = ?,\r\n" + "book_price = ?\r\n" + "where book_code = ?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, book.getBookTitle());
			psmt.setString(2, book.getBookAuthor());
			psmt.setString(3, book.getBookPress());
			psmt.setInt(4, book.getBookPrice());
			psmt.setString(5, book.getBookCode());
			System.out.println("입력 시도중");

			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력성공");

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			disconn();

		}

	}

	public void deleteBook(String bookCode) {
		System.out.println("DB연결 시도중");
		conn();
		System.out.println("DB 연결완료");
		String sql = "delete from book_info where book_code=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, bookCode);
			
			System.out.println("삭제 시도중");
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제됨");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
	}
}
