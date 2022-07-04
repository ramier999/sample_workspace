package homework;

import java.util.Scanner;

public class hw20220704 {
	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0;
		Scanner scn = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택> ");
			int num = scn.nextInt();
			if(num==1) {
				System.out.println("예금액> ");
				int money = scn.nextInt();
				balance += money;
			} else if(num==2) {
				System.out.println("출금액>");
				int money = scn.nextInt();
				balance -= money;
			} else if(num==3) {
				System.out.println("잔고>"+balance+"\n");
			} else if(num==4) {
				System.out.println("\n프로그램 종료");
				break;
			}
		}
		
	}

}
