package com.prod;

public class User {
	int userId; //
	String userRank; //
	String userPhone; // 
	int userPoint; 
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getUserId() {
		return this.userId;
	}
	public void setUserRank(String userRank) {
		this.userRank = userRank;
	}
	public String getUserRank() {
		return this.userRank;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserPhone() {
		return this.userPhone;
	}
	public void setUserPoint(int userPoint) {
		this.userPoint = userPoint;
	}
	public int getUserPoint() {
		return this.userPoint;
	}
	
	public String getUserInfo() {
		String result = this.userId + "님 의 랭크는" //
				       +this.userRank + "입니다." //
			+ "포인트는 " + this.userPoint + " 점 입니다.";
		return result;
	}
	
}
