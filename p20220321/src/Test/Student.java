package Test;

public class Student {
	String stuNo;
	String stuName;
	int engScore;
	int korScore;
	
	
	
	
	public Student(String stuNo, String stuName, int engScore, int korScore) {
		super();
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.engScore = engScore;
		this.korScore = korScore;
	}
	public void showInfo() {
		System.out.println("학생 정보: " + stuNo + stuName + engScore+ korScore);
}
}
