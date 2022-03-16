package com.prod;

public class Work_User1 {
	public static void main(String[] args) {
		
		User u1 = new User();
		u1.setUserId(001);
		u1.setUserRank("A");
		u1.setUserPhone("010-2222-2222");
		u1.setUserPoint(1200);
		
		User u2 = new User();
		u2.setUserId(002);
		u2.setUserRank("B");
		u2.setUserPhone("010-3333-3333");
		u2.setUserPoint(500);
		
		User u3 = new User();
		u3.setUserId(003);
		u3.setUserRank("S");
		u3.setUserPhone("010-1111-1111");
		u3.setUserPoint(2200);
		
		User u4 = new User();
		u4.setUserId(004);
		u4.setUserRank("C");
		u4.setUserPhone("010-4444-4444");
		u4.setUserPoint(100);
		
		System.out.println(u1.getUserInfo());
	
		User [] user = { u1, u2, u3, u4 };
		for(int i=0; i < user.length; i++) {
			if ( user[i].getUserRank() == "A" && user[i].getUserPoint() >= 1000 ) {
				System.out.println(user[i].getUserInfo());
			}
		}
		
	}
	

}
