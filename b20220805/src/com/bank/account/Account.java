package com.bank.account;

import java.sql.Date; // 년 월 일 까지 표현
// java.util.Date; // 년 월 일 시 분 초 까지 표현

public class Account {
	
	private String memberId;
	private String accountId;
	private int balance;
	private Date credate;
	
	public String getMemberId() {
		return memberId;
	}
	
	public String getAccountId() {
		return accountId;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public Date getCredate() {
		return credate;
	}
	
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void setCredate(Date credate) {
		this.credate = credate;
	}
	
}
