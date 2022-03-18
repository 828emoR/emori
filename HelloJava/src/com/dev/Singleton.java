package com.dev;

public class Singleton {

	private static Singleton instance = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return instance;// 4번 줄의 instance를 return한 값.

	}
}