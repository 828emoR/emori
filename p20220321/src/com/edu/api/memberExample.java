package com.edu.api;

import java.util.ArrayList;
import java.util.HashSet;

public class memberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("red","황근출");
		Member obj2 = new Member("blue","톤톤정");
		Member obj3 = new Member("red","황근출");
		
		if(obj1 == obj2) {
			System.out.println("obj1과 obj2는 동등합니다.");
		}else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3번은 동등합니다.");
		}else {
			System.out.println("obj1과 obj3번은 동등하지 않습니다.");
		}
		
		//배열 -> 컬렉션(ArrayList, HashSet, HashMap): 여러개의 값을 저장.
		Member[] memberAry = new Member[5];//Member의 인스턴트 최대 5개 저장.
		 								   //크기 초과하면 새로운 배열 선언. 복사.
		ArrayList<Member> memList = new ArrayList<Member>();
		memList.add(new Member("user1","황근출"));
		memList.add(new Member("user1","황근출"));
		
		for (int i =0; i < memList.size(); i++) {
			System.out.println(memList.get(i));
		}
		
		HashSet<Member> memSet = new HashSet<Member>();
		memSet.add(new Member("user1" , "황근출"));//hashCode(), equals()
		memSet.add(new Member("user1" , "황근출"));//
		
		System.out.println(memSet.size());
		
	}

}
