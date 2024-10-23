package com.example.demo_9;

import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Lec3Test {
	@Test
	public void recurrenceTest() {
		System.out.println(this.recurrence(100));
	}

	@Test
	public void countTicketPriceTest() {
		System.out.println(this.countTicketPrice(60));
	}

	public double countTicketPrice(int age) {
		double originalPrice = 100;
		boolean isBetweenSevenAndTwelve = (age >= 7 && age <= 12);
		boolean isBetweenSixtyAndSeventyNine = (age >= 60 && age <= 79);

		if (age <= 6 || age >= 80) {
			return originalPrice * 0.2;
		}

		if (isBetweenSevenAndTwelve || isBetweenSixtyAndSeventyNine) {
			return originalPrice * 0.5;
		}
		return originalPrice;
	}

	public int recurrence(int x) {
		// 當拆解到最小問題時，回傳答案(遞迴的中止條件)
		if (x == 1) {
			return 1;
		}

		// 每一次答案會是原本傳進參數+以(參數-1)來呼叫此方法的結果
		// 方法呼叫自身的行為就是遞迴
		int sum = x + this.recurrence(x - 1);
		return sum;
	}

	@Test
	public void ifTest() {
		boolean isRaining = false;
		if (isRaining) {
			System.out.println("Bring umbrella");
		} else {
			System.out.println("Sunny!");
		}
	}

	@Test
	public void switchTest() {
		int score = 69;
//		90~100 => A
//				80~89 => B
//				70~79 => C
//				60~69 => D
//				<60 => F

		switch ((int) score / 10) {
		case 10:
			System.out.println("100");
			break;
		case 9:
			System.out.println("90-99");
			break;
		case 8:
			System.out.println("80-89");
			break;
		case 7:
			System.out.println("70-79");
			break;
		case 6:
			System.out.println("60-69");
			break;
		default:
			System.out.println("60down");
			break;

		}

	}

	@Test
	public void guessNumberPrepare() {
		// 螢幕輸入
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		System.out.println(test);
	}
}