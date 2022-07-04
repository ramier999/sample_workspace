package co.edu;

import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("임의의 숫자를 입력하세요. >> ");
		int num1 = scn.nextInt();
		
		if ( num1 % 3 == 0 ) {
			System.out.printf("%d은(는) 3의 배수입니다.", num1);
		} else {
			System.out.printf("%d은(는) 3의 배수가 아닙니다.", num1);
		}
		
	}
}
