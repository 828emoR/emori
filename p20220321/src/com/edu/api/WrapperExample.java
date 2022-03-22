package com.edu.api;

import java.util.ArrayList;

public class WrapperExample {
	public static void main(String[] args) {
		
		//기본타입(int, long, double, boolean...)
		//참조타입(Integer, Long, Double, Boolean...)
		//int -> Integer (boxing), Integer -> int (unboxing)
		ArrayList<Integer> ary = new ArrayList<Integer>();  //int 타입은 index('<>') 안에 들어가지 않는다 애송이.
		ary.add(100);												//       ㄴ이쉨 뭔데 귀엽누..
		ary.add(new Integer(200)); //Deprecated. 앞으로 이딴 글귀 보이면 자바에서 지울테니 알아서 사려라. 
		
		new Integer(100).floatValue(); //100.0   <<Wrapper Class라고 한다 카더라.
	
	}

}
