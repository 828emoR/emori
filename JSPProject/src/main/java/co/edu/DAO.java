package co.edu;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	//db 연결처리, 연결해제
	public class DAO {

		// DriverManager
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement psmt;

		public Connection getConnect() {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost", "hr", "hr");
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			System.out.println("정상적으로 연결되었습니다.");
			return conn;
		}

		public void disconnect() {

			try {
				if (rs != null)
					rs.close();

				if (stmt != null)
					stmt.close();

				if (psmt != null)
					psmt.close();

				if (conn != null)
					conn.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}


