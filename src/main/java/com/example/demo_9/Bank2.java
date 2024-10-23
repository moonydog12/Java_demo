package com.example.demo_9;

public class Bank2 {
	private String branchTitle;

	// 常數: 變數名稱全大寫，以_串接不同字
	public final int MAX_BALANCE = 100000;

	// 一般屬性變數，用小駝峰命名
	private int balance;

	public Bank2() {
		super();
	}

	public Bank2(String branchTitle, int balance) {
		super();
		this.branchTitle = branchTitle;
		this.balance = balance;
	}

	public String getBranchTitle() {
		return branchTitle;
	}

	public int getBalance() {
		return balance;
	}

}
