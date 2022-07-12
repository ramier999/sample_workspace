package co.edu.thread;

import java.awt.Toolkit;

public class ThreadExample {
	public static void main(String[] args) {
		
		// Thread의 생성자 매개값 (Runnable 구현객체)
		Thread beep = new Thread(new BeepTask());
		
		// Thread 클래스 상속받은 하위클래스
		beep = new BeepWorkerThread();
		beep.start();
		
		// 메세지 출력
		for (int i=0; i<5; i++) {
			System.out.println("print");
			try {
				Thread.sleep(800); // 0.8초 간격
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
