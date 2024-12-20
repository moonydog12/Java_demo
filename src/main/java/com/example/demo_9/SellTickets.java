package com.example.demo_9;

public class SellTickets implements Runnable {

	private int tickets = 10;

	// 同步方法: synchronized 寫在方法上面 --> 獨佔整個方法，哪台機器(thread)先搶到資源，就會把票賣光
//	@Override
//	public synchronized void run() { 
//
//		for (int i = 0; i < 10; i++) {
//			tickets--;
//			if (tickets > 0) {
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				System.out.printf("%s 賣出一張票，剩下 %d 張 \n", Thread.currentThread().getName(), tickets);
//			} else {
//				System.out.println(Thread.currentThread().getName() + " 票都已經賣完了");
//			}
//
//		}
//
//	}

	// 同步區塊: 將需要獨佔資源的程式碼區塊用 synchronized (this) 包起來
	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			synchronized (this) {
				tickets--;
				if (tickets > 0) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.printf("%s 賣出一張票，剩下 %d 張 \n", Thread.currentThread().getName(), tickets);
				} else {
					System.out.println(Thread.currentThread().getName() + " 票都已經賣完了");
				}
			}

		}

	}

}
