package com.edu.Thread;

import java.awt.Toolkit;

class beepTask implements Runnable {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(30);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
//process (메인쓰레드

	public class BeepPrinteExample {
	}

	public static void main(String[] args) {
		//쓰레드 생성법
		//thread 생성자의 매개값으로 Runnable을 구현한 객체
		//Thread Thread = new Thread(new BeepTask());
		//Runnable 인터페이스의 익명구현객체를 생성
//		Thread 클래스의 생성자 매개값으로 활용
		Thread thread =new Thread(() -> {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
			for (int i =0; i< 5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(30);
					
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
					
	});
		thread.start();//쓰레드 시작
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i =0; i< 5; i++) {
			System.out.println("beep");
			try {
				Thread.sleep(30);
			}catch (InterruptedException e) {
					e.printStackTrace();
					
				}
			}
			System.out.println("EOP");
		}

	}
