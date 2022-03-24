package com.edu.Lambda;

interface Runnable4 {
	public int run();
}

public class RunExample4 {
	public static void main(String[] args) {
		Runnable4 runnable = () -> {
			return (int) (Math.random() * 11);
		};
		int result = runnable.run();
		System.out.println(result);
		
		//함수적인 프로그램 작성을 간단히 하고 싶을때 람다식을 작성함.(람다식 = ('->')
		runnable = () -> {
			return (int) (Math.random() * 1000);
		};
		result = runnable.run();
		System.out.println(result);
	}
}
