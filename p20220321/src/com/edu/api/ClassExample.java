package com.edu.api;

import java.lang.reflect.Method;

public class ClassExample {
	public static void main(String[] args) {
		//String, System, Member => 관리하는 Class(Class);
		
		Class cls = String.class; //String 클래스의 정보를 읽어오기 위한 타입. "String.class;" 의 정보를 "cls" 안에 담는다.
		
		try {
		cls = Class.forName("java.lang.String");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
//=========================================================================
		System.out.println(cls.getName());
		System.out.println(cls.getSimpleName());
		Method[] methods = cls.getMethods();
		for (Method met : methods) {
			System.out.println("메소드 이름: " + met.getName());
		}
		
		
		
		cls = Member.class;
		
		String path = cls.getResource("ClassExample.class").getPath();
		System.out.println(path);
	}

}
