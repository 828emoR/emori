package com.edu.collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();// set: 중복값은 허용하지 않습니다.
		set.add("Hello");
		set.add("World");
		set.add("Hello");//중복된 요소는 추가 불가.
		set.add("Fuck");
		
		set.remove("Fuck");
		
		System.out.println("set 크기: " + set.size());
		
		Iterator<String> iter = set.iterator(); // 반복자.
		while(iter.hasNext()) {
			String result = iter.next();
			System.out.println(result);
		}
		System.out.println("EOP");
	}

}
