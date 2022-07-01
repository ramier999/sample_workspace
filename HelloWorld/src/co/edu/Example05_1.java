package co.edu;

import java.util.Scanner;

public class Example05_1 {
	public static void main(String[] args) {
		
		String name = new String("홍길동");
		System.out.println("값을 입력하세요. ");
		Scanner sn = new Scanner(System.in);
		
		String input = sn.nextLine();
		System.out.printf("입력값은 %s", input);
		
		int input1 = sn.nextInt(); 
		System.out.printf("입력값은 %d", input1);
		
	}
}