package com.edu.except;

public class SlowEx {
	public static void main(String[] args) {
		showInterval("새끼... 기합! \r\n따흐흑..  \r\n보고...   \r\n싶습니다...     \r\n황근출병장님...");
	}
	public static void showInterval(String str) {
		for(int i=0; i< str.length(); i++) {
			System.out.print(str.charAt(i));
			try {
				Thread.sleep(300);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
