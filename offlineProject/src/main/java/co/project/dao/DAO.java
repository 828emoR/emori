package co.project.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


//public class DAO {
//
//	// DriverManager
//	 public Connection conn;
//	 public Statement stmt;
//	 public ResultSet rs;
//	 public PreparedStatement psmt;
//
//	public Connection getConnect() {
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost", "hr", "hr");
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
//		System.out.println("정상적으로 연결되었습니다.");
//		return conn;
//	}
//
//	public void disconnect() {
//
//		try {
//			if (rs != null)
//				rs.close();
//
//			if (stmt != null)
//				stmt.close();
//
//			if (psmt != null)
//				psmt.close();
//
//			if (conn != null)
//				conn.close();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//}

public class DAO {
	
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "hr";
	private String password = "hr";
	
	
	public Connection conn;
	public ResultSet rs;
	public PreparedStatement psmt;

	public void conn() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("데이터베이스 연결 실패!!!!");
		}
		
	}

	public void disconn() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (psmt != null) {
			try {
				psmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}


