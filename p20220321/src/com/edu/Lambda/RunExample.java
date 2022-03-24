package com.edu.Lambda;

interface Runnable{
	public void run();
	
}
class RunImpl implements Runnable{

	@Override
	public void run() {
		System.out.println("run...");
	}
	
}
public class RunExample {
	public static void main(String[] args) {
		//람다 표현식(String s) -> {구현코드};/ 람다식 구현은 인터페이스에서.
		
		Runnable runnable = new RunImpl();
		runnable.run();
		
		runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("냥식이 달려욧");
			}
		}; //익명구현개체
	 runnable.run();
	 runnable = () -> {System.out.println("심바 달려욧");};
	 runnable.run();
}
}