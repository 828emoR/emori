package com.edu.generic;

// 제네릭은 무엇인가.  ArrayList<Integer>
//T = Type parameter. 뭘 선언했냐에 따라 바뀜. 메타몽같은새끼..
public class Box<String> {
	String obj;
	
	public void setObj(String obj) {
		this.obj = obj;
	}
	
	public String getObj() {
		return this.obj;
		
	}

}
