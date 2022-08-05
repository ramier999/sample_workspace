package com.bank.loan;

import java.sql.Date;

public class Loan {
	
	private String memberId;
	private String loanId;
	private Date loanDate;
	private String state;
	
	public String getMemberId() {
		return memberId;
	}
	
	public String getLoanId() {
		return loanId;
	}
	
	public Date getLoanDate() {
		return loanDate;
	}
	
	public String getState() {
		return state;
	}
	
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}
	
	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}
	
	public void setState(String state) {
		this.state = state;
	}

}
