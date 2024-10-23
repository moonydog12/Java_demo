package com.example.demo_9;

public class Dog {
	// 宣告屬性(特性)
	String breed;

	String color;

	String name;

	int age;

	// 定義方法(行為)
	public void sprint() {
		System.out.println("Sprinting");
	}

	// method overload
	// 方法名稱一樣，但方法中的參數個數不一樣，呼叫 sprint 方法時可以以辨別是呼叫哪一個
	// 1.
	public void sprint(String name) {
		System.out.println(this.name + " is Sprinting");
	}

	// 2.方法名稱一樣，方法中的參數個數一樣，但是相同位置的參數資料型態不一樣
	public void sprint(String name, int age) {
		System.out.println(this.name + " is Sprinting");
	}

	public void bark() {
		System.out.println(this.name + " is barking");
	}

	public void eat(String name) {
		System.out.println(this.name + "很愛吃變成" + name);

	}
}
