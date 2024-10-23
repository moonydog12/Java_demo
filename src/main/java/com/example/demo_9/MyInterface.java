package com.example.demo_9;

// 介面本身就是抽象物件，abstract keyword 可省略
// 完整寫法: public abstract interface
// 抽象物件無法使用 new keyword 生成實例
public interface MyInterface {
	// 定義在介面中的屬性
	// 1.權限只能是 public or nomodifier
	// 2.要給初始值
	int NUM = 10;
	// 3.完整寫法
	// 4.因為被定義成 final，是常數，變數名稱全大寫
	public static final int NUMBER = 10;

	// 因為介面是抽象物件，定義其中的方法皆是抽象方法
	public void fly();

	public void soar();

	// 介面中可有預設的方法實作內容，需加上 default keyword
	// 預設方法不強制重新定義
	public default void jump(String name) {
		System.out.println(name + " jumping");
	}

	
	// 定義在介面中的 static 方法，一定要有實作內容
	// static 方法無法被重新定義
	public static void jump2(String name) {
		System.out.println(name + " jumping2");
	}

}
