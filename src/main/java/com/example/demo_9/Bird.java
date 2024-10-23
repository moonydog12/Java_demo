package com.example.demo_9;

// 用 extends 來繼承 Animal 中已有的 properties & methods
public class Bird extends Animal {
	// 1.屬性 name & getter/setter
	// 2.eat,sleep method
	// 以上Animal class都有，不需要重複寫

	// constructor
	// 預設建構方法(沒有參數)
	public Bird() {
		// 1.在呼叫子類別的建構方法前，會先呼叫父類別的建構方法，不論是預設建構方法還是帶參建構方法
		// 2.即使拿調父類別的 super()，程式依然先執行父類別的建構方法
		super();
		System.out.println("I am son");
	}

	// name, age 繼承自父類別 Animal,所以帶有 name, age 的建構方法會去呼叫父類別的建構方法
	public Bird(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	// 透過關鍵字 super 來使用定義在父類別中的 public method
	// 屬性 name 權限是 private, 只能在 Animal class 使用
	public void fly() {
		System.out.println(super.getName() + " fly");

		// 目前 Java 版本可以省略 super
		System.out.println(getName() + " fly without super");
	}

	public void fly2() {
		// age 是 protected property,所以子類別可以存取
		System.out.println("今年 " + age + "歲, " + getName() + " fly");

	}

	// 1. 子類別可以重新定義(不同的實作內容)父類別的方法
	// 2. @Override 用來標記子類別充新定義父類別的方法: 目前Java版本，此註釋可省略
	//    2.1 註釋:在程式碼中提供訊息，會再編譯或執行時被處理
	// 3. 被子類別重新定義的方法:
	//     3.1 其權限不可比父類別小
	//	   3.2 回傳的資料形態要一致
	//     3.3 方法名稱和小括號中的參數數量、參數型態要一致
	//     3.4 唯一的不同是大括號中的實作內容
	@Override
	public void eat() {
		System.out.println(getName() + " Can not stop eating");
	}

	@Override
	public void sleep() {
		System.out.println(getName() + " Sleep too much");
	}

}
