package com.example.demo_9;

public class Animal {
	private String name;

	protected int age;

	public String getName() {
		return name;
	}

	// constructor
	public Animal() {
		super();
		// 建構方法中若有呼叫父類別 super method, 不論預設或帶參數的建構方法
		// 其餘的程式碼都只能寫在 super()方法之後
		System.out.println("daddy");
	}

	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void eat() {
		System.out.println(name + " Eat");
	}

	public void sleep() {
		System.out.println(name + " Sleep");
	}
}
