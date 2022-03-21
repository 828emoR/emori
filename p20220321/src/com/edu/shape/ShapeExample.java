package com.edu.shape;

public class ShapeExample {
	public static void main(String[] args) {
		Shape s1 = new Ractangle();
		Shape s2 = new Circle();
		Shape s3 = new Triangle();
		
		double d1 = 0;
		int i1 = 0;
		d1 = i1; // promotion
		i1 = (int) d1; //34.56
		
		if(s1 instanceof Ractangle) {
			Ractangle r1 = (Ractangle) s1;//강제 형변환 개념임. 개같은거 ㅋㅋ
			r1.setWidth(7.3);
			r1.setHeight(7.8);
			System.out.println(r1.getArea()); 
		}
		if(s2 instanceof Circle) {
		Circle c1 = (Circle) s2;
		c1.setRadius(4);
		System.out.println(c1.getArea());
		}
		if(s3 instanceof Triangle) {
			Triangle t1 = (Triangle) s3;
			t1.setBase(4);
			t1.setHeight(6);
		System.out.println(t1.getArea());
		}
		
	}

}
