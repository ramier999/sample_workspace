package co.edu.reference;

import java.util.Arrays;

public class ForExample01 {
	public static void main(String[] args) {
		
		// 배열
		
		int[] tempAry = new int[5];
		for(int i=0; i<tempAry.length; i++) {
			tempAry[i]=(int)(Math.random()*50);
		}
		for(int num : tempAry) {
			System.out.printf("%d ", num);
		}
		
		System.out.println("\n");
		
		int max = 0;
		for(int i=0; i<tempAry.length; i++) {
			if(tempAry[i]>max) {
				max = tempAry[i];
			}
		}
		System.out.println("제일 큰 값: "+ max);
		
		int min = Arrays.stream(tempAry).min().getAsInt();
		
		System.out.println("제일 작은 값: "+ min);
	}
}
