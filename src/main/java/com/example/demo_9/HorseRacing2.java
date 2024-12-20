package com.example.demo_9;

public class HorseRacing2 implements Runnable {

	private String name;

	public HorseRacing2() {
		super();
	}

	public HorseRacing2(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 30; i++) {
			try {
				Thread.sleep(2000); // 單位是毫秒 1秒=1000ms
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.printf("%s 正在跑第 %d 圈!! \n", getName(), i);
		}
	}

	public String getName() {
		return name;
	}

}
