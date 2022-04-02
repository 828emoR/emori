package newTest;

public class Student {
	private int StudNo; // 학생번호.
	private String StudName; // 학생이름.

	public Student() {

	}

	public Student(int studNo, String studName) {
		super();
		this.StudNo = studNo;
		this.StudName = studName;
	}

	public int getStudNo() {
		return StudNo;
	}

	public void setStudNo(int studNo) {
		this.StudNo = studNo;
	}
  
	public String getStudName() {
		return StudName;
	}

	public void setStudName(String studName) {
		this.StudName = studName;
	}

	@Override
	public String toString() {
		return "Student [studNo=" + StudNo + ", studName=" + StudName + "]";
	}

}
