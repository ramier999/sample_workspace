package co.edu;

import java.util.Scanner;

public class MorningEx {
	public static void main(String[] args) {
		
		String[] fruits = {"딸기", "바나나", "오렌지", "파인애플"};
		Scanner scn = new Scanner(System.in);
		
		boolean exist = false;
		System.out.print("과일 이름을 입력하세요. >> ");
		String fruit = scn.nextLine();
		for(int i=0; i<fruits.length; i++) {
			if(fruits[i].equals(fruit)) {
				System.out.println(i+1+"번째 위치에 있습니다.");	
				exist = true;
				break;
			}
		}
		if(!exist) {
		System.out.println("찾는 과일이 없습니다.");
		}
	}
}
