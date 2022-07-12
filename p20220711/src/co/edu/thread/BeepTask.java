package co.edu.thread;

import java.awt.Toolkit;

public class BeepTask implements Runnable{

	@Override
	public void run() {
		// 스피커 소리 출력
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(800); // 0.8초 간격
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
