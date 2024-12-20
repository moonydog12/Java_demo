package com.example.demo_9;

public class HorseRacing extends Thread {

	// 父類別 Thread 中已經有定義 name
	public HorseRacing() {
		super();
	}

	public HorseRacing(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			try {
				sleep(2000); // 單位是毫秒 1秒=1000ms
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("%s 正在跑第 %d 圈!! \n", super.getName(), i);
		}
	}

}
