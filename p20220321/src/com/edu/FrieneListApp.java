package com.edu;

public class FrieneListApp {
	public static void main(String[] args) {
		Friend[] friends = new Friend[10];

		
		UnivFriend f1 = new UnivFriend("임후식", 45, 169.3, 100, "010-5869-4243");
		f1.setUniversity("118조기경보전대");
		f1.setMajor("내연장");
		
		UnivFriend f2 = new UnivFriend("최 찬", 22, 169.3, 75, "010-9069-6129");
		f2.setUniversity("118조기경보전대");
		f2.setMajor("경계병");
		
		UnivFriend f3 = new UnivFriend("장명원", 25, 176.3, 77, "010-7523-1769");
		f3.setUniversity("118조기경보전대");
		f3.setMajor("경계병");
		
		Friend f4 = new Friend();
		f4.setName("병장 황근출");
		f4.setAge(25);
		f4.setHeight(182);
		f4.setWeight(80.9);
		f4.setPhone("010-0101-1010");

		UnivFriend f5 = new UnivFriend("톤톤즈", 29, 169.3, 70, "010-6969-4769");
		f5.setUniversity("해병대 포항항만방어대대");
		f5.setMajor("보병");

		ComFriend f6 = new ComFriend("옥만정", 29, 169.3, 70, "010-4769-6964", "네이버", "지도 App 개발연구원");
		
		friends[0] = f1;
		friends[1] = f2;
		friends[2] = f3;
		friends[3] = f4;
		friends[4] = f5;
		friends[5] = f6;
		
	//학교친구 출력.
		
		

		for (int i = 0; i < friends.length; i++) {
			if(friends[i] !=null && friends[i] instanceof UnivFriend)
			if (friends[i] != null)
				System.out.println(friends[i].toString());//동일한 기능이나 인스턴스 조율에 따라 다른 결과 실행. =>다형성.
		}

		Friend friend = (Friend) f2;// UnivFirend; getUniversity, getMajor
		//friend = f1;
		UnivFriend uni = null; //(UnivFriend) friend;
		if (friend instanceof UnivFriend) {// uni변수값이 UnivFriend의 인스턴스인지 확인.(양쪽을 비교 후 일치하는값. <=> if(B == A)
			uni = (UnivFriend) friend;// Casting 해야함.
//		    uni.getUniversity();//부모클래스의 참조변수 ->자식클래스의 참조변수 할당.

		}
	}
}
