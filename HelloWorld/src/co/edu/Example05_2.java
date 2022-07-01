package co.edu;

import java.util.Scanner;

public class Example05_2 {
	public static void main(String[] args) {
		
//		String name = new String("홍길동");
		System.out.println("값을 입력");
		Scanner sn = new Scanner(System.in);
		
//		String input = sn.nextLine(); // 문자열
//		int input = sn.nextInt(); // 정수
//		System.out.printf("입력값은 %d", input);

		System.out.println("첫 번째 값을 입력");
		int num1 = sn.nextInt();
		
		System.out.println("두 번째 값을 입력");
		int num2 = sn.nextInt();
		
		int result; // 입력 2수의 차
		
		if ( num1 > num2 ) {
			result = num1 - num2;
		} else {
			result = num2 - num1;
		}
		
		System.out.printf("입력값 %d, %d의 차이는 %d입니다.", num1, num2, result); // 입력값 10과 20의 합은 30입니다.
		
	}
}
