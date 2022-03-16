package com.prod;

public class FriendExample {
	public static void main(String[] args) {
		
		//친구의 정보
		
		Friend f1 = new Friend();
		f1.friendName = "메모리";
		f1.friendPhone = "010-1234-1234";
		f1.email = "dndbaos@naver.com";
		f1.height = 180;
		f1.weight = 80;
		
		Friend f2 = new Friend();
		f2.friendName = "GDS";
		f2.friendPhone = "010-1234-1234";
		f2.email = "ggooddeess@naver.com";
		f2.height = 175;
		f2.weight = 47;
		
		Friend f3 = new Friend();
		f3.friendName = "멍학";
		f3.friendPhone = "010-1234-1234";
		f3.email = "kshs@naver.com";
		f3.height = 180;
		f3.weight = 75;
		
		System.out.println(f1);
		
		Friend[] friends = { f1, f2, f3 };
		
		for(int i=0; i<friends.length; i++) {
			
			if (friends[i].height >= 180)
				

			System.out.println("==============구 분 선==============");
			System.out.println("이름: " + friends[i].friendName);
			System.out.println("전화번호: " + friends[i].friendPhone);
			System.out.println("이메일: "  + friends[i].email);
			System.out.println("키: " + friends[i].height);
			System.out.println("몸무게: " + friends[i].weight);
			System.out.println("==============구 분 선==============");
		}
	}

	}

	