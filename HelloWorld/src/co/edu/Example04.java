package co.edu;

import java.io.IOException;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

// 키보드 입력값 코드나 값을 메소드
public class Example04 {
	public static void main(String[] args) {
		// system
		System.out.println("값을 입력하세요.");
		int num = 10;
		boolean run = true;
		while (run) {
			int result = 0;
			try {
				result = System.in.read();
				System.out.printf("입력값은 %d입니다. ", result);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				// try - catch : 예외처리
			}
			run = result != 48;
		}
		System.out.println("\nend of prog");
	}
}
