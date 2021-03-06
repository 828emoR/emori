package com.edu.api;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		
		Date today = new Date("2022/01/01/00:00:00");
		today.setYear(2);//1909년
		System.out.println(today);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 hh시 mm분 ,55초");
		System.out.println(sdf.format(today));
		
		LocalDateTime time = LocalDateTime.now();
		
		System.out.println(time);
	}

}
