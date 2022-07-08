package co.edu.loop;

import java.util.Scanner;

public class BankAccount {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		// 1:입금, 2:출금, 3:잔액조회, 4:종료
		
		System.out.println("원하시는 메뉴의 번호를 선택하세요.");
		
		int valance = 0;
		
		while(true) {
			System.out.println("1:입금, 2:출금, 3:잔액조회, 4:종료");
			int menu = scn.nextInt();
			
			if (menu==1) {
				System.out.println("입금하실 금액을 입력하세요. >> ");
				int amt = scn.nextInt();
				if(amt<0) {
					System.out.println("ERROR");
					continue;
				}				
					valance += amt;
					if(valance>100000) {
						valance -= amt;
						System.out.println("잔액은 100000원을 초과하여 입금할 수 없습니다.");
						continue; // else 대신
					}
					System.out.println("정상적으로 입금되었습니다.");
			
			} else if (menu==2) {
				System.out.println("출금하실 금액을 입력하세요. >> ");
				int amt = scn.nextInt();
				if(amt<0) {
					System.out.println("ERROR");
				} else {
					if(valance<amt) {
						System.out.println("잔액이 부족하여 거래를 취소합니다.");
					} else {
						valance -= amt;
						System.out.println("정상적으로 출금되었습니다.");
					}
				}
				
			} else if (menu==3) {
				System.out.println("현재 잔액은 "+valance+"원 입니다.");
				
			} else if (menu==4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			
			} else {
				System.out.println("ERROR");
			}
		} // end of while
		
	}

}
