package com.kh.miniproject;

public class Bank {
	// 필드
	// 유저, 계좌번호(4자리), 잔고
	private String user;
	private String accountNum;
	private int balance;
	
	// 생성자
	public Bank() {}
	
	public Bank(String user, String accountNum, int balance) {
		this.user = user;
		this.accountNum = accountNum;
		this.balance = balance;
	}
	
	// 메소드
	// 입금될 계좌에 누적합 구하는 메소드
	public void plusMoney(int moneyInMyAcc) {
		this.balance += moneyInMyAcc;   
	}
	
	// 출금될 계좌에서 입금할 금액의 차를 구하는 메소드
	public void minusMoney(int moneyInMyAcc) {
		this.balance -= moneyInMyAcc;
	}
	
	// get
	public String getUser() {
		return user;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public int getBalance() {
		return balance;
	}
	
	// set
	public void setUser(String user) {
		this.user = user;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

}
