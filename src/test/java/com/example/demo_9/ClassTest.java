package com.example.demo_9;

import org.junit.jupiter.api.Test;

public class ClassTest {
	@Test
	public void dogTest() {
		// 使用關鍵字new 建立實例(instance)
		Dog myDog = new Dog();

		// 設定實例的屬性
		myDog.breed = "墨西哥無毛犬";
		myDog.color = "灰色";
		myDog.name = "Donte";
		myDog.age = 3;

		System.out.println("品種" + myDog.breed);
		System.out.println("毛色" + myDog.color);

		// 使用方法
		myDog.bark();
		myDog.sprint(myDog.name);
		myDog.eat("Fatty");
	}

	@Test
	public void bankTest() {
		Bank myBank = new Bank();
		myBank.setUser("AAA");
		myBank.setBalance(1000);

		myBank.withdraw(-1);
	}

	@Test
	public void bankTest2() {
		Bank bank1 = new Bank("TTB", "BBB", 2000);

		// withdraw3是靜態方法，可以直接透過類別名稱呼叫
		Bank.withdraw3(0, "test", "test");

	}

	@Test
	public void stringTest() {
		// 用給值得方式宣告字串，會被存在字串池(可重複利用
		String str = "ABC";
		String str1 = "ABC";

		// 用類別宣告的方式字串會被存在記憶體
		String str2 = new String("ABC");
		String str3 = str2;

		System.out.println(str == str1);
		System.out.println(str2 == str3);

		Bank testBank = new Bank();
	}

	@Test
	public void interfaceTest() {
		Car car = new Car();
		Human human = new Human();
		Person person = new Person();

		car.run();
		human.run();
		person.run();
	}

	@Test
	public void submarineTest() {
		Submarine submarine = new Submarine();
		submarine.move();
	}
}
