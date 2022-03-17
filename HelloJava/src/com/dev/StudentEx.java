package com.dev;

import java.util.Scanner;

import com.edu.Student;

public class StudentEx {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//배열선언 5개, 입력, 리스트 출력.
		
		Student[] students = new Student[5];
		
		while(true) {
			System.out.println("1.입력" + "\n2.리스트" + "\n3.종료");
			System.out.println("선택> ");
		    int menu =scn.nextInt();
		    if(menu == 1) {
		    	//입력기능 구현. 학번, 이름, 영어, 수학, 국어 =>
		    	System.out.println("=====입력할 정보를 입력해주세요=====");
		    	System.out.println("학번을 입력해주세요>");
		    	int sno =scn.nextInt();
		    	System.out.println("이름을 입력해주세요>");
		    	String sname = scn.next();
		    	System.out.println("영어 점수를 입력해주세요");
		        int escore = scn.nextInt();
		        System.out.println("국어 점수를 입력해주세요");
		        int kscore = scn.nextInt();
		        System.out.println("수학 점수를 입력해주세요");
		        int mscore = scn.nextInt();
		    	
		        Student s1 = new Student(sname, sno, kscore, mscore, escore);
		        
		        for(int i = 0; i < students.length; i++) {
		        	if(students[i] == null) {//값이 채워져 있는지 확인
		        	   students[i] = s1;
		        	break;
		        	}else {
		        	    System.out.println("다시 입력하시겠습니까?" + "\n Y"+ "\n N");
		        	   String yes = scn.next();
		        	   String no = scn.next();
		        	    if(yes == Y) {
		        	    	continue;
		        	    }else if(no == N) {
		        	    	break;
		        	    }
		        	    
		        	}
		        }
		        
		        System.out.println("저장완료");
		        
		    }else if(menu ==2) {
		    	//리스트 구현
		    	for(int i = 0; i< students.length; i++) {
		    		if (students[i] != null) {
		    			System.out.println(students[i].getStudInfo());
		    		}
		    	}
		    System.out.println("조회완료");
		    
		    
		    }else if(menu == 3) {
		    	System.out.println("프로그램을 종료합니다.");
		    	break;
		    }else {
		    	System.out.println("해당하는 값이 없습니다. 프로그램을 종료합니다");
		    	break;
		    }
		}
		System.out.println("종료합니다.");
	}

}
