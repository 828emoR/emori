package com.prod;

public class ArrayExample3 {
	
	public static void main(String[] args) {
		
		String[] names = new String[5];
		
		names[0] = "한놈";
		names[1] = "234";
		names[2] = "석삼";
		names[3] = "너구리";
		
		names[1] = "이삼사";
		names[4] = "이모리";
		names[0] = null;
		
		String searchName = "이모리";
		
		for (int i=0; i<5; i++) {
//			if(names[i] != null) {// != ~가 아닐 경우에
//				System.out.println("이름: " + names[i]);
//			}
		if(names[i] !=null && names[i].equals(searchName)) {
			System.out.println("이모리는 " + (i + 1) +"번째 위치에 있습니다.");
			}
		}
	}
}
