package com.example.demo_9;

// 抽象類別無法透過 new 來實例化
abstract class Shape {
	//　抽象類別可定義一般方法或抽象方法
	
	// 一般方法可被定義在一般類別或抽象類別中
	public void draw() {
	}

	// 抽象方法
	// 1.純定義方法(不能有實作內容)
	// 2.分號結尾
	// 3.抽象方法只能被定義在抽象類別中
	// 4.抽象方法必須要被重新定義(因為無實作內容)
	public abstract void draw1();
}

class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("Real circle");
	}

	// 被繼承的 Shape 類別中，因為有定義抽象方法 draw1，這個方法須被重新定義
	@Override
	public void draw1() {
		System.out.println("Fake circle");
	}

}