package com.edu;

public class UnivFriend extends Friend{
	//학교:학교이름, 전공
	private String university;
	private String major;
	
	
	public UnivFriend() {
		super(); // 부모 클래스가 Friend 이므로 () 안에 부모 클래스를 호출한다
	}
	public UnivFriend(String name, int age, double height, double weight, String phone) {
		super(name, age, height, weight, phone);//부모클래스 friend가 가지고 있는 각각의 값을 호출한다.
	}
	
	public UnivFriend(String name, int age, double height, double weight, String phone, String university, String major) {
		this.university = university;
		this.major = major;
	}
	
	
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	
	@Override
	public String toString() {
		String str = "이 해병의 이름은 " + super.getName() + "이고 \n";
		str += "나이는" + super.getAge() + "이고\n";
		str += "연락처는 " + this.getPhone() + "입니다. \n";
		str += " ============< 추가 정보 >============\n";
		str += "현재 근무중인 부대의 이름은 " + "'" + this.getUniversity() + "'" + "입니다. \n";
	    str += "현재 수행중인 병과는 " + this.getMajor() + "입니다. \n";
	    str += " ============< 추가 정보 끝 >============\n";
		return str;
	}
	
	}
	
	
	


