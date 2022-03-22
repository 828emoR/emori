package com.edu.InterFaces;

public interface RemoteControl {
	
	//필드 생성 불가,
	//생성자 불가.
	//private String MaxVolume;
	//private 생성 불가.
	//interface는 구현 객체를 통해 기능이 만들어진다.
	public static final int MAXVOLUME = 10;//static =  //final=더 이상 값을 바꾸지 않는다.
	public static final int MINVOLUME = 0;//상수로 선언
	//단 상수라는 전제 하에 지정 가능하며
	
	
	public void powerON();//추상메소드
	public void powerOff();

}
