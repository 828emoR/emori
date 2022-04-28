package co.edu.student;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class studentDAO extends DAO {

	
	//수정
	public boolean modifyStudent(student std) {
		conn = getConnect();
		String sql = "update student_info set student_name=?, eng_Score=?, kor_Score=? where student_no = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, std.getStudentName());
			psmt.setInt(2, std.getEngScore());
			psmt.setInt(3, std.getKorScore());
			psmt.setInt(4, std.getStudentNo());
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제.");
			if (r>0) {
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return false;
	}
	
	
	
	public boolean removeStudent(String id) {
		conn = getConnect();
		String sql = "delete from student_info where student_no=?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제.");
			if (r>0) {
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return false;
	}
	
	public boolean addStudent(student stud){
		conn = getConnect();
		String sql = "insert into student_info values(?,?,?,?)";
		
		try {
		psmt = conn.prepareStatement(sql);
		psmt.setInt(1, stud.getStudentNo());
		psmt.setString(2, stud.getStudentName());
		psmt.setInt(3, stud.getEngScore());
		psmt.setInt(4, stud.getKorScore());
		int r = psmt.executeUpdate();
		System.out.println(r+"입력");
		if(r > 0) {
			return true;
		}
		
		}catch (SQLException e){
			e.printStackTrace();
		}finally {
			disconnect();
		}return false;
		
	}
	
	
	public List<student> studentList() {
		conn = getConnect();
		List<student> list = new ArrayList<student>();
		try {
			psmt = conn.prepareStatement("select * from student_info order by student_no");
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
