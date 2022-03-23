package com.edu.api;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("년도입력");
int year = scn.nextInt();
		System.out.println("월 입력");
int month = scn.nextInt();

   createCalendar(year, month);
}
public static void createCalendar(int year, int month) {
		
		Calendar today = Calendar.getInstance();
		today.set(year, month -1, 1);
		
		System.out.println("올해는 " + today.get(Calendar.YEAR)+ "년");
		System.out.println("이번달은 " + today.get(Calendar.MONTH) +1 + "월");
		System.out.println("오늘은 " + today.get(Calendar.DATE)+ "일");
		System.out.println("이번주에서 오늘의 위치는: " + today.get(Calendar.DAY_OF_WEEK)+ " 번째");
		System.out.println("이번달의 마지막 날은 : " + today.getActualMaximum(Calendar.DATE));

		int gapDay = today.get(Calendar.DAY_OF_WEEK);
		int lastDate = today.getActualMaximum(Calendar.DATE);
		

		// 요일 정보 출력
		String[] days = { "SUN", "MON", "TUS", "WED", "THR", "FRI", "SAT" };
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println();
		// 1월의 위치 지정
		for (int i = 1; i < gapDay; i++) {
			System.out.printf("%4s", "");
		}
		// 날짜를 출력.
		for (int i = 1; i <= lastDate; i++) {
			System.out.printf("%4d", i);
			if ((i + gapDay - 1) % 7 == 0) {
				System.out.println();
			}
		}
//프로그램 끝부분.
		System.out.println("\nend of prog");
	}
}

