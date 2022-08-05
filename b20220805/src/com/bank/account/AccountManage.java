package com.bank.account;

import java.util.concurrent.ConcurrentHashMap;

import com.bank.common.DAO;
import com.bank.member.MemberManage;

public class AccountManage extends DAO {
	
	private static AccountManage am = new AccountManage();
	
	private AccountManage() {
		
	}
	
	public static AccountManage getInstance() {
		return am;
	}
	
	public int insertAccount(Account account) {
		int result = 0;
		try {
			conn();
			String sql = "INSERT INTO account(account_id, member_id) VALUES( ?, ?)";
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}
	
	// 입출금
	public int updateMoney(Account account, int cmd) {
		int result = 0;
		try {
			conn();
			// 입출금 -> update
			// 계산한 데이터를 바로 넣어주면 다른 연산 없이 가능
			// 현재 잔고를 가져오는 query
			String sql1 = "SELECT balance FROM account WHERE account_id = ?";
			pstmt = conn.prepareStatement(sql1);
			pstmt.setString(1, account.getAccountId());
			rs = pstmt.executeQuery();
			int balance = 0;
			if(rs.next()) {
				balance = rs.getInt("balance");
				
			}
			// 잔고 계산
			// 입금 = 1, 출금 = 2
			if(cmd==1) {
				account.setBalance(balance+account.getBalance());
			} else if(cmd==2) {
				if(balance >= account.getBalance()) {
					account.setBalance(balance-account.getBalance());
					String sql2 = "UPDATE account SET balance = ? WHERE account_id = ?";
					pstmt = conn.prepareStatement(sql2);
					pstmt.setInt(1, account.getBalance());
					pstmt.setString(2, account.getAccountId());
					result = pstmt.executeUpdate();
				} else {
					System.out.println("잔고가 부족합니다.");
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}
	
	// 계좌해지
	public int delAccount(String accountId) {
		int result = 0;
		try {
			conn();
			String sql = "DELETE FROM account WHERE account_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, accountId);
			result = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}
	
	// 계좌이체
	public void transferMoney(String toAccount, String fromAccount, int balance) {
		int result1 = 0;
		int result2 = 0;
		try {
			conn();
			// 보내는 사람 계좌
			String sql2 = "UPDATE account SET ( balacne - ? ) WHERE account_id = ? ";
			pstmt = conn.prepareStatement(sql2);
			pstmt.setInt(1, balance);
			pstmt.setString(2, fromAccount);
			result1 = pstmt.executeUpdate();
			if(result1==1) {
				// 받는 사람 계좌
				String sql1 = "UPDATE account SET ( balance + ? ) WHERE account_id = ? ";
				pstmt = conn.prepareStatement(sql1);
				pstmt.setInt(1, balance);
				pstmt.setString(2, toAccount);
				result2 = pstmt.executeUpdate();
				if(result2==1) {
					System.out.println("정상적으로 송금되었습니다.");
				} else {
					System.out.println("ERROR!!(송금-입금오류)");
				}
			} else {
				System.out.println("ERROR!!(송금-출금오류)");
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
}
