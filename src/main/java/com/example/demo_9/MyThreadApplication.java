package com.example.demo_9;

public class MyThreadApplication {
//	public static void main(String[] args) {
//		MyThread t = new MyThread();
//		System.out.println("a");
////		t.run(); // 一般方法呼叫，印出 sum
//		t.start(); // 呼叫執行緒方式，印出 sum
//		System.out.println("b");
//	}

////	// 繼承 Thread　類別
//	public static void main(String[] args) {
//		HorseRacing t1 = new HorseRacing("風丸");
//		HorseRacing t2 = new HorseRacing("小太郎");
//
//		// 執行一班方法
////		t1.run();
////		t2.run();
//
////		執行thread
//		t1.start();
//		t2.start();
//	}

	// 實作 Runnable 介面
//	public static void main(String[] args) {
//		HorseRacing2 h1 = new HorseRacing2("風丸");
//		HorseRacing2 h2 = new HorseRacing2("小太郎");
//
//		// 要讓實作 Runnable 介面的 HorseRacing2 可以透過 start() 呼叫執行緒方法
//		// 就要把 h1、h2 放到執行緒中，所以要先建立執行緒
//		Thread t1 = new Thread(h1);
//		Thread t2 = new Thread(h2);
//
////		執行thread
//		t1.start();
//		t2.start();
//	}

	// 賣票程式:會友競賽危害發生
	public static void main(String[] args) {
		// 模擬只有 10張票，所以只能 new 一個 SellTickets
		SellTickets st = new SellTickets();
		
		// 模擬2台機器在賣僅有的10張票，2台機器所以開兩個 thread
		Thread t1 = new Thread(st, "機器1");
		Thread t2 = new Thread(st, "機器2");
		t1.start();
		t2.start();

	}

}
