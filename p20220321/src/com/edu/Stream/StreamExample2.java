package com.edu.Stream;

import java.util.ArrayList;
import java.util.List;

public class StreamExample2 {
	public static void main(String[] args) {
		 List<Student> list = new ArrayList<Student>();
	      list.add(new Student("홍길동", "남자", 70, 100));
	      list.add(new Student("김순희", "여자", 80, 120));
	      list.add(new Student("김부식", "남자", 85, 95));
	      list.add(new Student("박한나", "여자", 88, 99));
	      
	      //남 녀 상관없이 스코어+포인트 > 180이상인 학생들만 출력.
	      
	      list.//컬렉션으로 부터
	      stream()//스트림을 생성
	      .filter(student -> student.score >= 80)//80점 이상인 대상을 필터/람다식으로 구현
	      .filter(student -> student.gender.equals("여자"))
	      .sorted()
	      .forEach(student -> System.out.println(student));//필터링 된 대상을 출력.
	      System.out.println("==========================================================");
	      
	      
	      list.//컬렉션으로 부터
	      stream()//스트림을 생성
//	      .filter(student -> student.score >= 80)//80점 이상인 대상을 필터/람다식으로 구현
//	      .filter(student -> (student.point + student.score) >= 180)
	      .sorted()//comparable 구현하는 클래스
	      .forEach(student -> System.out.println(student));//필터링 된 대상을 출력.
	}


}
