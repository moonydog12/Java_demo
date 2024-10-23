package com.example.demo_9;

public class Bank {
	// 賦予 branch 預設值，而不是Java本身預設值
	private String branch = "TTA";

	private String user;

	private int balance;

	// 預設建設方法，格式: 方法的存取權限 類別名稱(){}
	// public Bank(){}
	// 預設建構方法 -> 就是沒有參數的建構方法
	// 當類別中沒有建立帶參數的建構方法，沒有參數的建構方法就是預設建構方法，可省略不寫
	// 類別中有帶參數的建構方法時，沒參數的建購方法就不再是預設建構方法，沒有就不能使用
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	// 帶有參數的建構方法，實作內容等於setter 方法，可以減少code 數量
	public Bank(String branch, String user, int balance) {
		super();
		this.branch = branch;
		this.user = user;
		this.balance = balance;
	}

	// 建立屬性的存取方法(getter,setter)
	// 一般方法:
	// 格式: 方法的存取權限 回傳直資料型態 方法名稱(參數資料型態 參數變數名稱){方法內容實作}
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 存款
	public void deposite(int amount) {
		System.out.println("存款前餘額: " + this.balance);
		if (amount >= 0) {
			this.balance += amount;
		} else {
			System.out.println("Invalid amount number");
		}

		System.out.println("存款後餘額: " + this.balance);
	}

	// 提款
	public void withdraw(int amount) {

		if (amount > this.balance) {
			System.out.println("餘額不足");
			return;
		}
		if (amount < 0) {
			System.out.println("不可為負");
			return;
		}
		System.out.println("提款前餘額: " + this.balance);
		this.balance -= amount;
		System.out.println("提款後餘額: " + this.balance);

	}

	// 可變參數
	static void withdraw3(int balance, String... params) {
		// params is an array that includes title, branch , user
		String title = params[0];
		String branch = params[1];
		System.out.println(title);
		System.out.println(branch);
		System.out.println(balance);
	}

	// 可變參數
	public void withdraw4(int balance, String... params) {
		// params is an array that includes title, branch , user
		String title = params[0];
		String branch = params[1];
		String user = params[2];
		System.out.println(title);
		System.out.println(branch);
		System.out.println(balance);
	}
}
