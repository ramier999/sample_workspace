package co.edu;

import java.util.Scanner;

public class IfCondition {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int num = 6;
		
		if (num % 2 ==0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
		// if문은 순서대로 실행되기 때문에 주의!
		if (num % 2 == 0 || num % 3 == 0 ) { // || == &&
			System.out.println("2와 3의 배수입니다.");
		} else if (num % 2 == 0) {
			System.out.println("2의 배수입니다.");
		} else if (num % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("뭐임?");
		}
		
		int score = 80;
		String grade = "";
		// 100 ~ 90 => A, 89 ~ 80 => B, 79 ~ 70 => C, 그 외 => D
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else {
			grade = "D";
		}
		System.out.printf("%s점은 %s등급 입니다.", score, grade);
		
		
	}
}
