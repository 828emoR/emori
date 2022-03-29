package com.edu.io;
//참조, 라이브러리 용도 
public class Student {
	//학생번호(int 타입을 이용한 학생번호 1, 2, 3/ 이름 (홍길동),영어점수(80), 국어(70), 
	
	int stuNo;
	String stuName;
	int engScore;
	int koScore;
	
	
	@Override
	public String toString() {
		return "학생정보: 학생번호 :" + stuNo + "이름: " + stuName + "영어점수: " 
	+ engScore + "국어점수: " + koScore;
	}



	public Student(int stuNo, String stuName, int engScore, int koScore) {
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.engScore = engScore;
		this.koScore = koScore;
	}
	
	
	
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public int getKoScore() {
		return koScore;
	}
	public void setKoScore(int koScore) {
		this.koScore = koScore;
	}

	

}
