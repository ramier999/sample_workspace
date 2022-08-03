package review;

import java.util.Scanner;

public class review3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
		
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i]==60) {
				System.out.println(arr1[i]+"은 "+(i+1)+"번째 위치입니다.");
			}
		}
		
		System.out.print("{ ");
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i]!=3) {
				System.out.print(arr1[i]+" ");
			}
		}
		System.out.println("}");
		
		System.out.print("변경할 인덱스 값 입력 >> ");
		int indexNo = Integer.parseInt(scn.nextLine());
		arr1[indexNo] = 1000;
		
		int max = arr1[0];
		int min = arr1[0];
		for(int i=0; i<arr1.length; i++) {
			if(max<arr1[i]) {
				max = arr1[i];
			}
			if(min>arr1[i]) {
				min = arr1[i];
			}
		}
		System.out.println("max : "+max);
		System.out.println("min : "+min);
		
		int[] arr2 = new int[10];
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = (int)(Math.random()*100+1);
			System.out.print(arr2[i]+" ");
		}
	}
}
