package com.edu.api;

public class Member {
	private String id;
    private String username;
	
	public Member (String id, String username) {
		this.id = id;
		this.username = username;
	}
	
	

	@Override
	public int hashCode() {
		
		return 1111;
	}



	@Override
	public boolean equals(Object obj) {
//		Member member = null;
		if(obj instanceof Member) {
//			member = (Member) obj;
			Member member = (Member) obj;
			if(id.equals(member.id)) {
//			if(this.id == member.id && this.username == member.username){	
				return true;
			}
		}
//		System.out.println(member);
		return false;
	}
	
	

}



//@Override
//public boolean equals(Object obj) {
//	if(obj instanceof Member) {
//		Member member = (Member) obj;
//		if(id.equals(member.id)) {
//			return true;
//		}
//	}
//	return false;
//}
//
//
//
//}
//
