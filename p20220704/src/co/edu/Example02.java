package co.edu;

import java.util.Scanner;

public class Example02 {
	public static void main(String[] args) {
		
		// 사용자 입력값을 읽어서 100~90 : A , ~80 : B, ~70 : C, 그 외 : D
		// 출력값 : 점수 78점은 C등급입니다!
		
		Scanner scn = new Scanner(System.in);

		System.out.println("점수를 입력하세요.");
		
		int score = scn.nextInt();
		
//		String grade = ( score >= 90 ) ? "A" : (( score >= 80) ? "B" : (( score >= 70 ) ? "C" : "D" ));
		
		String grade = "";
		if ( score >= 90 ) {
			if ( score >= 95 ) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if ( score >= 80 ) {
			if ( score >= 85 ) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} else if ( score >= 70 ) {
			if ( score >= 75 ) {
				grade = "C+";
			} else {
				grade = "C";
			}
		} else {
			grade = "D";
		}
		
		System.out.printf("점수 %d점은 %s등급입니다!", score, grade);
		
		

	}
}
