package com.bank.account;

import java.util.Scanner;

public class AccountService {
	
	Scanner scn = new Scanner(System.in);
	
	public void makeAccount() {
		Account ac = new Account();
		
		System.out.print("계좌번호 >> ");
		String accountId = scn.nextLine();
		System.out.print("고객ID >> ");
		String customId = scn.nextLine();
		
		ac.setAccountId(accountId);
		ac.setMemberId(customId);
	}
	
	public void money() {
		Account account = new Account();
		System.out.println("1. 입금 | 2. 출금");
		System.out.print(">> ");
		int cmd = Integer.parseInt(scn.nextLine());
		System.out.print("계좌번호 >> ");
		String accountId = scn.nextLine();
		if(cmd==1) {
			System.out.print("입금 금액 >> ");
		} else if(cmd==2) {
			System.out.print("출금 금액 >> ");
		}
		int money = Integer.parseInt(scn.nextLine());
		account.setAccountId(accountId);
		account.setBalance(money);
		int result = AccountManage.getInstance().updateMoney(account, cmd);
		if(result==1 && cmd==1) {
			System.out.println("정상적으로 입금되었습니다.");
		} else if(result==1 && cmd==2) {
			System.out.println("정상적으로 출금되었습니다.");
		} else {
			System.out.println("ERROR!!(입출금오류)");
		}
	}
	
	// 계좌해지
	public void deleteAccount() {
		System.out.println("****** * *  *   *  계 좌 해 지  *   *  * * ******");
		System.out.print("계좌 입력 >> ");
		String accountId = scn.nextLine();
		int result = AccountManage.getInstance().delAccount(accountId);
		
		if(result==1) {
			System.out.println("정상적으로 해지되었습니다.");
		} else {
			System.out.println("ERROR!!(해지오류)");
		}
	}
	
	// 계좌이체
	public void transfer() {
		System.out.println("========== 계좌 이체 ==========");
		System.out.print("받는 사람 계좌 >> ");
		String toAccountId = scn.nextLine();
		System.out.print("보내는 사람 계좌 >> ");
		String fromAccountId = scn.nextLine();
		System.out.print("송금 금액 >> ");
		int balance = Integer.parseInt(scn.nextLine());
		AccountManage.getInstance().transferMoney(toAccountId, fromAccountId, balance);
	}
}
