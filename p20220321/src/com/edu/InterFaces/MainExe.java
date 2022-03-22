package com.edu.InterFaces;

public class MainExe {
	public static void main(String[] args) {
		//리모콘 tv, radio, 냉장고
		
		
		RemoteControl rm = new TV();
		rm.powerON();
		rm.powerOff();
		
		rm = new Radio();
		rm.powerON();
		rm.powerOff();
		
		rm = new Refrigerator();
		rm.powerON();
		rm.powerOff();
		
	}

}
