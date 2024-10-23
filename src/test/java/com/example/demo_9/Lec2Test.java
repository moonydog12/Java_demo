package com.example.demo_9;

import org.junit.jupiter.api.Test;

public class Lec2Test {

	@Test
	public void reviewLec1() {
		int a;
		String b = "1111";
		System.out.println(b);
	}

	/**
	 * @param test 書本的ISBN編號
	 * @return 書本名稱
	 */
	public String fileCommentTest(int test) {
		return null;
	}

	@Test
	public void computeTest() {
		int b = 10;
		int remainder = 10 % 3;
		int quotient = 10 / 3;
		System.out.println(remainder);
		System.out.println(quotient);

		int a = 10;
		System.out.println(a);
		System.out.println(a++ * 10);
		System.out.println(a);

		a = 10;
		System.out.println(a);
		System.out.println(++a * 10);
		System.out.println(a);
	}

	@Test
	public void computeTestCompound() {
		// a = a + 9 => a += 9
		// a = a - 1 => a --
		// a = 5 * a => a *= 5
		// a = b / 5
		// a = a % b => a %= b
		// a = b % a
		int a = 10;
		a += 9;
		System.out.println(a);
	}

	@Test
	public void booleanTest() {
		boolean res1 = (1 != 1);
		boolean res2 = (1 == 1);
		System.out.println(res1 && res2);
		System.out.println(res1 || res2);
	}

	@Test
	public void practiceTest() {
		int a = this.sum(3, 5);
		System.out.println(a);
	}

	public int sum(int start, int end) {
		return ((start + end) * (end - start + 1)) / 2;
	}

	@Test
	public void practiceConvert() {
		System.out.println(this.convertCelsiusToFahrenheit(100));
		System.out.println(this.convertFahrenheitToCelsius(212));
	}

	public double convertCelsiusToFahrenheit(double degree) {
		// 華式溫度 = 攝氏溫度 * 9/5 + 32
		return degree * 9 / 5 + 32;
	}

	public double convertFahrenheitToCelsius(double degree) {
		// 華式溫度 = 攝氏溫度 * 9/5 + 32
		return (degree - 32) * 5 / 9;
	}

	public int forLoop(int number) {
		int sum = 0;
		for (int i = 0; i <= number; i++) {
			sum += i;
		}
		return sum;
	}

	@Test
	public void forLoopTest() {
		int result = this.forLoop(10);
		System.out.println(result);
	}

	@Test
	public void nineTimesNine() {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
//				System.out.println(i+"x"+j+"="+i*j);
				System.out.printf("%dx%d=%2d  ", i, j, i * j);
			}
			System.out.println();
		}
	}

	@Test
	public void whileSum() {
		int i = 1;
		int sum = 0;
		while (i <= 5) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

	@Test
	public void nineTimesNineWhile() {
		int i = 1;
		int limit = 10;
		while (i < limit) {
			// 要把j放在內側迴圈重置，否則他到10就會停了，導致只印出第一次
			int j = 1;
			while (j < limit) {
				System.out.printf("%dx%d=%2d  ", i, j, i * j);
				j++;
			}
			i++;
			System.out.println();
		}
	}

	@Test
	public void doWhileLoop() {
		boolean l = true;
		do {
			System.out.println("I am in");
		} while (!l);
	}

	@Test
	public void doWhileSum() {
		int i = 1;
		int sum = 0;
		do {
			sum += i;
			i++;
		} while (i <= 5);
		System.out.println(sum);
	}

	public void infiniteForloop() {
		int i = -2;
		for (;;) {
			i++;
			if (i == 1) {
				break;
			}
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("I still here");
	}

	@Test
	public void nestedLoopBreakTest() {
		a: for (int i = 0; i < 10; i += 2) {
			System.out.println(i);
			for (int j = 1; j < 10; j += 2) {
				System.out.println(j);
				// break; // 預設匯兌最近的迴圈作用，顧會跳出j迴圈
				break a; // 若要對外層迴圈作用，需再外層迴圈加上標籤，在著名此標籤迷稱
			}
			System.out.println("內圈已結束");
		}
		System.out.println("外層以結束");
	}

	@Test
	public void chickenRabbitTogetherByInfiniteLoop(int head, int foot) {
		// 判斷是否為偶數
		if (foot % 2 != 0) {
			System.out.println("此題無解");
			return;
		}

		// 假設兔子數目0
		int rabbit = 0;

		while (true) {
			// 利用兔子數目反推雞數目
			int chicken = head - rabbit;

			// 符合腳的數目，即為解
			if (rabbit * 4 + chicken * 2 == foot) {
				System.out.printf("雞 : 兔\n%d : %d\n", chicken, rabbit);

				// 因為只有唯一解，離開迴圈
				// break;
				return; // 因為離開迴圈沒有要做其他事，所以也可以直接離開迴圈
			}

			// 下一輪
			rabbit++;

			if (rabbit > head) {
				System.out.println("此題無解");
				return;
			}
		}
	}

}