package review;

import java.util.Scanner;

public class Result {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Question 1]");
		Employee ed = new EmpDept("이지나", 3000, "교육부");
		ed.getInformation();
		ed.print();
		
		System.out.println();
		System.out.println("Question 2]");
		
		Human swi = new StandardWeightInfo("홍길동", 168, 45);
		swi.getInformation();
		
		Human oi = new ObesityInfo("박둘이", 168, 90);
		oi.getInformation();
		
		System.out.println();
		System.out.println("Question 3]");
		Culture movie = new Movie("추격자", 7, 5);
		Culture performance = new Performance("지킬앤하이드", 9, 10);
		// 관객수와 점수를 직접 입력하는 경우
//		System.out.print("영화의 관객수를 입력하세요. >> ");
//		int auM = Integer.parseInt(scn.nextLine());
//		for(int i=0; i<auM; i++) {
//			System.out.print((i+1)+"번 관객의 영화의 점수(1~5점)를 입력하세요. >> ");
//			int scM = Integer.parseInt(scn.nextLine());
//			movie.setTotalScore(scM);
//		}
		// 관객수와 점수를 예시와 같게 넣어주는 경우 ( 관객수 : 3명 / 총점 : 12점 )
		movie.setTotalScore(5);
		movie.setTotalScore(4);
		movie.setTotalScore(3);
		// 관객수와 점수를 직접 입력하는 경우
//		System.out.print("공연의 관객수를 입력하세요. >> ");
//		int auP = Integer.parseInt(scn.nextLine());
//		for(int i=0; i<auP; i++) {
///			System.out.print((i+1)+"번 관객의 공연 점수(1~5점)를 입력하세요.>> ");
//			int scP = Integer.parseInt(scn.nextLine());
//			performance.setTotalScore(scP);
//		}
		// 관객수와 점수를 예시와 같게 넣어주는 경우 ( 관객수 : 10명 / 총점 : 46점 )
		performance.setTotalScore(5);
		performance.setTotalScore(5);
		performance.setTotalScore(5);
		performance.setTotalScore(5);
		performance.setTotalScore(5);
		performance.setTotalScore(5);
		performance.setTotalScore(5);
		performance.setTotalScore(5);
		performance.setTotalScore(5);
		performance.setTotalScore(1);
		movie.getGrade();
		movie.getInformation();
		System.out.println("=====================");
		performance.getGrade();
		performance.getInformation();
	}
}
