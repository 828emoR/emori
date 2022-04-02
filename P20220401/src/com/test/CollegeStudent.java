package com.test;

public class CollegeStudent extends Student{
	private String ProfName; // 담당교수.
	private String Major; // 전공정보.
	
	
	
	
	public CollegeStudent(int studNo, String stuName, String profName, String major) {
	    super(studNo,stuName);
		ProfName = profName;
		Major = major;
	}
	
	public String getProfName() {
		return ProfName;
	}
	public void setProfName(String profName) {
		ProfName = profName;
	}
	public String getMajor() {
		return Major;
	}
	public void setMajor(String major) {
		Major = major;
	}
  
	@Override
	public String toString() {
		return "대학생 정보 [교수 이름= " + ProfName + ", 전공= " + Major + "]";
	}

}
