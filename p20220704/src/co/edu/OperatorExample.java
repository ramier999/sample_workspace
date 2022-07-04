package co.edu;

import java.util.Scanner;

public class OperatorExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int num1 = 10;
		int num2 = 20;
		
		int result = num1 + num2;
		result = num1 - num2;
		result = num1 * num2;
		result = num1 / num2;
		result = num1 % num2; // 나머지 연산자
		result = num1 % 2; // 홀수, 짝수 구분
		
		System.out.println("임의의 값을 입력: ");
		num1 = scn.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

		num1++; // num1 = num1 + 1;
		System.out.println(num1);
		num1--; // num1 = num1 - 1;
		System.out.println(num1);
		
		System.out.println(num1++); // num1의 값을 선출력하여 1이 더해진 값이 출력되지 않는다.
		System.out.println(++num1); // 먼저 1을 증가시켜 num1의 값을 출력한다.
		
		result = num1++ + num2++; // num1 = 12, num2 = 20
		System.out.println(result); // result = 32, num1 = 13, num2 = 21
		
		result = num1 + num2;
		System.out.println(result);
		
		boolean idEven = result % 2 == 0;
		if(!idEven) { // ! : 논리 부정 연산자
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}

	}

}
