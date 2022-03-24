package com.edu;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("책 제목을 입력하세요");
		String title = scn.next();
		
		System.out.println("책 저자을 입력하세요");
		String author = scn.next();
		
		System.out.println("책 출판사를 입력하세요");
		String press = scn.next();
		
		System.out.println("책 가격을 입력하세요");
		int price = scn.nextInt();
		
		Book book = new Book(title, author, press, price);
		book.showInfo();
	}

}
