package com.edu.Lambda.Consumer;

import java.util.function.ToIntFunction;

import com.edu.collect.Student;

// Function 인터페이스 : 매핑작업.(Student
public class FunctionExample {
	public static void main(String[] args) {
		ToIntFunction<Student> func = (student) -> 
			
			student.getEngScore() + student.getKoScore();
		
			int result = func.applyAsInt(new Student(101, "hong", 80, 90));
			System.out.println("결과값: " + result);
		}
	}