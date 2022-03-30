package com.edu.collect;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceOracle extends DAO implements StudentService {

	@Override
	public void insertStudent(Student student) {// 입력처리
		conn = getConnect();
		String sql = "insert into student_info (student_no, student_name, eng_Score, kor_score)\n"
				+ "values ( ?, ?, ?, ?)";

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, student.getStuNo());
			psmt.setString(2, student.getStuName());
			psmt.setInt(3, student.getEngScore());
			psmt.setInt(4, student.getKoScore());
			
			int r = psmt.executeUpdate();
			System.out.println("정상입력 완료");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public Student getStudent(int sno) {
		return null;
	}

	@Override
	public List<Student> studentList() {
		List<Student> list = new ArrayList<Student>();// 조회된 결과값을 담기위한 컬렉션.

		conn = getConnect();
		String sql = "select * from student_info order by student_no";

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();// 실행건수만큼 반복자
			while (rs.next()) {// 반복자를 통해 요소를 가지고 올 수 있는치 체크. 있으면 하나
				Student student = new Student();
				student.setStuNo(rs.getInt("student_no"));
				student.setStuName(rs.getString("student_name"));
				student.setEngScore(rs.getInt("eng_score"));
				student.setKoScore(rs.getInt("kor_score"));

				list.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void modifyStudent(Student student) {
		conn = getConnect();
		String sql = "update student_info "
				+ "set eng_score = ?, "
				+ "kor_score = ? "
				+ "where student_no = ? ";
		try {
			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, student.getEngScore());
			psmt.setInt(2, student.getKoScore());
			psmt.setInt(3, student.getStuNo());
			
			int r = psmt.executeUpdate();
			
			System.out.println(r + "건 수정 완료");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void removeStudent(int sno) {

	}

	@Override
	public List<Student> searchStudent(String name) {
		conn = getConnect();
		List<Student> list = new ArrayList<Student>();
		String sql = "select * "
				+ "from student_info "
				+ "where student_name like '%'||?||'%'";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Student stu = new Student();
				
				stu.setStuNo(rs.getInt("student_no"));
				stu.setStuName(rs.getString("student_name"));
				stu.setEngScore(rs.getInt("eng_Score"));
				stu.setKoScore(rs.getInt("kor_score"));
				
				list.add(stu);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;

	}

	

	@Override
	public void saveToFile() {

	}

}
