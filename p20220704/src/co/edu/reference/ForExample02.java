package co.edu.reference;

import java.util.Scanner;

public class ForExample02 {
	
	// 메소드 정의구문
	public static int sumAry(int[] num) {
		int sum = 0;
		for(int i=0; i<num.length; i++) {
		sum += num[i];
		}
		return sum; // 메소드를 호출한 영역으로 sum의 값을 반환
	}
	
	public static void main(String[] args) {
		
		// 메소드 호출구문
//		int result = sumAry();
//		System.out.println(result);
		
		System.out.println();
		
		// 배열 합계
		
		int sum = 0;
		double avg = 0;
		
		int[]intAry = { 34, 23, 56, 22, 99, 28 };	
		
		sum = sumAry(intAry);
		
//		for(int i=0; i<intAry.length; i++) {
//			sum += intAry[i];
//		}
		avg = (double) sum / intAry.length;
		System.out.println("합계: "+sum);
		System.out.printf("평균: %.1f\n", avg);
		
		System.out.println();
		
		// intArray 배열의 합과 평균
		
		int sum1 = 0;
		double avg1 = 0;
		
		int[] intArray = new int[6];
		System.out.print("intArray = { ");
		for(int i=0; i<intArray.length; i++) {
			intArray[i]=(int)(Math.random()*100+1);
//			sum1 += intArray[i];
			System.out.printf("%d ", intArray[i]);
		}
		sum1 = sumAry(intAry);
		System.out.print("}");
		avg1 = (double) sum1 / intArray.length;
		System.out.println("\n합계: "+sum1);
		System.out.printf("평균: %.1f", avg1);
		
		System.out.println("\n");
		
		// scanArray 배열의 합과 평균
		
		int sum2 = 0;
		double avg2 = 0;
		
		int[] scanArray = new int[5];
		Scanner scn = new Scanner(System.in);


		for(int i=0; i<scanArray.length; i++) {
			System.out.print("임의의 수를 입력 >> ");
			scanArray[i] = scn.nextInt();
//			sum2 += scanArray[i];
		}

		System.out.print("\n입력한 임의의 수 = { ");
		for(int i=0; i<scanArray.length; i++) {
			System.out.printf("%d ", scanArray[i]);
		}
		System.out.println("}");
		sum2 = sumAry(scanArray);
		avg2 = (double) sum2 / scanArray.length;
		System.out.println("합계: "+sum2);
		System.out.printf("평균: %.1f", avg2);
		
	}
}
