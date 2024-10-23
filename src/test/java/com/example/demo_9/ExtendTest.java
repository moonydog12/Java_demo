package com.example.demo_9;

import org.junit.jupiter.api.Test;

public class ExtendTest {
	@Test
	public void animalTest() {
		Animal animal = new Animal();
		animal.setName("ANI");
		animal.eat();
		animal.sleep();
	}

	@Test
	public void animalTest2() {
		Animal animal = new Animal("Anya", 6);
		animal.eat();
		animal.sleep();
	}

	@Test
	public void birdTest() {
		Bird bird = new Bird();
		bird.setName("bibi");
		bird.eat();
		bird.sleep();
		bird.fly();
	}

	@Test
	public void birdTest2() {
		Bird bird = new Bird("Kyungsoo", 12);
		bird.eat();
		bird.sleep();
		bird.fly();
	}

	@Test
	public void birdTest3() {
		// 雖然接回來的資料型態是父類別，但因為 new 出來的實例是子類別，所以本質上是子類別
		Animal bird = new Bird("Birddy", 5);

		// 執行結果會是被重新定義的實作內容
		bird.eat();
		bird.sleep();

		// 下列方法無法呼叫，因為沒有被定義在父類別中
		// bird.fly();
		// bird.fly2();

		// 總結，當新建出子類別實例其接收資料型態是父類別時
		// 1. 只能呼叫定義在父類別中的方法
		// 2. 當子類別有重新定義父類別的方法，執行的會是子類別的實作內容

	}

	@Test
	public void birdTest4() {
		Bird bird = new Bird("BIRD", 5);

		bird.fly();

		// 重新定義 fly() 的方法
		// 1. 在建立新的實例時直接給予新的實作內容(即加上大括號
		// 2. 大括號要寫在分號之前，且結尾一定要有分號
		// 3. 重新定義的實作內容就僅在這次執行
		// 4. Override可有可無，但建議加
		Bird bird2 = new Bird("BIRD", 5) {

			@Override
			public void fly() {
				System.out.println("鳳凰展翅");
			}

		};

		bird2.fly();

		Bird bird3 = new Bird("Bubu", 10);
		bird3.fly();
	}
}
