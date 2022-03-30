package com.prod.emp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO extends DAO {

	// 전체 조회기능
	public List<Employee> empList() {
		List<Employee> employees = new ArrayList<Employee>();

		conn = getConnect();
		try {
			psmt = conn.prepareStatement("select * from emp_java");
			rs = psmt.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee();

				emp.setEmployeeId(rs.getInt("employee_id"));// emplpoyees.employee_id
				emp.setFirstname(rs.getString("first_name"));
				emp.setLastName(rs.getString("Last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setSalary(rs.getInt("salary"));
				emp.setHireDate(rs.getString("hire_Date").substring(0, 10));
				emp.setJobId(rs.getString("job_id"));
				emp.setPhoneNumber(rs.getString("phone_number"));

				employees.add(emp);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return employees;

	}

	// 입력처리 executeUpdate
	public boolean insertEmp(Employee emp) {
		conn = getConnect();
		String sql = "insert into emp_java (employee_id, last_Name, email, hire_date, job_id)\n"
				+ "values ( ?, ?, ?, ?, ?)";
		try {

			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, emp.getEmployeeId());
			psmt.setString(2, emp.getLastName());
			psmt.setString(3, emp.getEmail());
			psmt.setString(4, emp.getHireDate());
			psmt.setString(5, emp.getJobId());

			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력됨");
			if (r > 0) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// w정상실행, 예외발생 => 반드시 실행코드
			disconnect();

		}
		return false;

	}



//수정처리
	public boolean updateEmp(Employee emp) {
		conn = getConnect();

		String sql = "update emp_java " + "set first_name = ?, " + "phone_number = ?, " + "salary = ? "
				+ "where employee_id = ? ";
		try {
			psmt = conn.prepareStatement(sql);
			// 파라미터값을 지정

			psmt.setString(1, emp.getFirstname());
			psmt.setString(2, emp.getPhoneNumber());
			psmt.setInt(3, emp.getSalary());
			psmt.setInt(4, emp.getEmployeeId());

			int r = psmt.executeUpdate();

			System.out.println(r + "건 수정");
			if (r > 0) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();

		}
		return false;
	}

//삭제처리
	public boolean deleteEmp(int empId) {
		conn = getConnect();
		String sql = "delete emp_java\r\n" + "	where employee_id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, empId);
			// 파라미터값을 지정

			int r = psmt.executeUpdate();// 실행
			System.out.println(r + "건 삭제됨");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();

		}
		return false;
	}
	//한건 조회기능
	public Employee searchEmp(int eid) {
		conn = getConnect();
		Employee emp = null;
		String sql = "select * from emp_java where employee_id = ? ";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, eid);
			rs = psmt.executeQuery();
			while (rs.next()) {
				emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstname(rs.getString("first_name"));
				emp.setLastName(rs.getString("Last_name"));
				emp.setHireDate(rs.getString("hire_Date").substring(0, 10));
				emp.setPhoneNumber(rs.getString("phone_number"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return emp;

	}

}