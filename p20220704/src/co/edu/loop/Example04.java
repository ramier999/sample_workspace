package co.edu.loop;

import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		// while 반복문의 종료 조건
		// 1 ~ 100 임의의 수를 생성
		
		Scanner scn = new Scanner(System.in);
		
		boolean isTrue = true;
		
		int temp = (int) (Math.random()*100)+1;
		do {
			System.out.println("1 ~ 100 사이의 숫자를 입력해 맞춰보세요.");
			int inputVal = scn.nextInt();
			if (temp==inputVal) {
				System.out.println("숫자를 맞췄습니다!");
				isTrue = false;
			} else if ( inputVal<0 || inputVal>100 ){
				System.out.println("1 ~ 100 사이의 숫자만 입력하세요.");
			} else if (inputVal>temp) {
				System.out.println("입력한 숫자보다 작습니다.");
				isTrue = true;
			} else if (inputVal<temp) {
				System.out.println("입력한 숫자보다 큽니다.");
				isTrue = true;
			}
		} while(isTrue);
		System.out.println("게임을 종료합니다.");
		
		
	}
}
