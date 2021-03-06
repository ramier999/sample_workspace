package co.edu.reference;

import java.util.Scanner;

public class MoningEx {
	public static void main(String[] args) {
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scn = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = Integer.parseInt(scn.nextLine());
			
			if(selectNo==1) {
				System.out.print("학생수 > ");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int[studentNum];
			
			} else if(selectNo==2) {
				if(studentNum==0) {
					System.out.println("학생수를 먼저 입력해주세요.");
					continue;
				}
				for(int i=0; i<studentNum; i++) {
					System.out.print("scores["+i+"] > ");
					scores[i] = Integer.parseInt(scn.nextLine());
				}
			
			} else if(selectNo==3) {
				if(scores==null) {
					System.out.println("점수를 먼저 입력해주세요.");
					continue;
				}
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"] > "+scores[i]);
				}
			
			} else if(selectNo==4) {
				if(scores==null) {
					System.out.println("점수를 먼저 입력해주세요.");
					continue;
				}
				int max = 0;
				for(int i=0; i<scores.length; i++) {
					if(max<scores[i]) {
						max = scores[i];
					}
				}
				System.out.println("최고 점수: "+max);
				
				int sum = 0;
				double avg = 0;
				for(int i=0; i<scores.length; i++) {
					sum += scores[i];
					avg = (double) sum / scores.length;
				}
				System.out.printf("평균 점수: %.1f\n", avg);
			
			} else if(selectNo==5) {
				run = false;
			} else {
				System.out.println("유효한 숫자를 입력해주세요.");
			}
		}
		
		System.out.println("프로그램 종료");
		
	}
}
