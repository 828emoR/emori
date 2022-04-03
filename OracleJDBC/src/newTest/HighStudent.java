package newTest;

public class HighStudent extends Student{
	private String TeacherName; // 담임선생님.
	private String GroupName; // 반이름.
	
	
	  
	

	
	public HighStudent(int studNo, String stuName, String teacherName, String groupName) {
		super(studNo,stuName);
		this.TeacherName = teacherName;
		this.GroupName = groupName;
	}
	
	public String getTeacherName() {
		return TeacherName;
	}
	public void setTeacherName(String teacherName) {
		TeacherName = teacherName;
	}
	public String getGroupName() {
		return GroupName;
	}
	public void setGroupName(String groupName) {
		GroupName = groupName;
	}


	@Override
	public String toString() {
		return "고등학생 정보 [담임 이름= " + TeacherName + ", 학년= " + GroupName + "]";
	}

	
	
}
