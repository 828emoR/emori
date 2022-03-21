package com.edu;

public class Students extends Person{
	       //부모 클래스         자식 클래스
 	    
    //학교, 학년, : 이름, 나이 , 키 ,몸무게
	private String school;
	private int grade;
	
	
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	

}
