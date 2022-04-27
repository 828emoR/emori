package co.edu.student;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class studentDAO extends DAO {

	public List<student> studentList() {
		conn = getConnect();
		List<student> list = new ArrayList<student>();
		try {
			psmt = conn.prepareStatement("select * from student_info");
			rs = psmt.executeQuery();
			while(rs.next()) {
				co.edu.student.student student = new student();
				student.setStudentNo(rs.getInt("student_no"));
				student.setStudentName(rs.getString("student_name"));
				student.setEngScore(rs.getInt("eng_score"));
				student.setKorScore(rs.getInt("kor_score"));
				list.add(student);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}
}
