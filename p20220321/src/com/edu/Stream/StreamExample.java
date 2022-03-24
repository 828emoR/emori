package com.edu.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

class Student implements Comparable<Student>{
	String name;
	String gender;
	int score;
	int point;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", score=" + score + ", point=" + point + "]";
	}

	public Student(String name, String gender, int score, int point) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
		this.point = point;
	}

	public Student(String name, String gender, int score) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
	}

	@Override
	public int compareTo(Student student) {
		//this 와 student 비교: this, student => 음수값 만들어지면 오름차순, 반대일경우 내림차순
//		if(this.score < student.score) {
//			return -1;
//		}
		return (this.score+this.point) - (student.point + student.score);
	}

	/// 생성자

}

public class StreamExample {
	  public static void main(String[] args) {
	      List<Student> list = new ArrayList<Student>();
	      list.add(new Student("홍길동", "남자", 70));
	      list.add(new Student("김순희", "여자", 80));
	      list.add(new Student("김부식", "남자", 85));
	      list.add(new Student("박한나", "여자", 88));
	      //평균구하기
	      int sum = 0, cnt = 0;
	      double avg = 0;
	    		  for(Student student : list) {
	    			  if(student.gender.equals("남자")) {
	    				  sum += student.score;
	    				  cnt++;
	    			  }
	    		  }
	    		  avg = sum / (double) cnt;
	    		  
	    		  Stream<Student> stream = list.stream();
	    		  OptionalDouble od = stream.filter((s) -> s.gender.equals("남자")).mapToInt(s->s.score).average();
	    		  avg = od.getAsDouble();
	    		  System.out.println("스트림평균 : "+ avg);
	    		  
	    			  }
	    		  }

//이딴게..코딩..?

