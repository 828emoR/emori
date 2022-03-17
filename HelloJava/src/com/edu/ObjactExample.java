package com.edu;
//Object(객체) -> Class(도면, 틀) -> 인스턴스 생성 (초기화).
public class ObjactExample {
	public static void main(String[] args) {
//		int num1 = 10;
//		double num2 = 12.34;
//		double num3 = 20; // int 타입은 4비트, double타입은 8비트이다. 4비트인 파일은 자동형변환(promotion) 되므로 넣는데 지장은 없다.
//		int num4 = (int) 23.4; //반대인 8비트는 4비트 안으로 못들어가므로 강제형변환(Casting)을 해야한다.
//		
//	    String str1 = "Hello"; //heap(인스턴스)생성.

		Car car1 = new Car(); //초기화(인스턴스 생성)
	    car1.setModel("sonata");
	    car1.setPrice(10000000);
	    

	}

}
