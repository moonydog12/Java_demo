package com.example.demo_9;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class Regextest {
	@Test
	public void test() {
		// 比對手機號碼格式
		// \d 表示數字 0-9 任意其一
		// \在java中是跳脫符，讓有特殊意義的符號變成字串
		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入手機號碼:格式為 XXXX-XXX-XXX");
		String input = scan.next();
//		boolean isMatch = input.matches(pattern);
//		if (isMatch) {
//			System.out.println(input + " 符合手機號碼格式");
//		} else {
//			System.out.println(input + " 不符合手機號碼格式");
//		}

		// 匿名方式(不需要用變數名稱來存計算結果)改寫
		if (input.matches(pattern)) {
			System.out.println(input + " 符合手機號碼格式");
		} else {
			System.out.println(input + " 不符合手機號碼格式");
		}
	}

	@Test
	public void test1() {
		// 使用大括號處理pattern中重複出現的字串
//		String pattern = "\\d{4}-\\d{3}-\\d{3}";

		// \\d{3}重複出現，-\\d{3}包含 -,\\d,{3} 3個字串
		// 因此需要用小括號將3個字串框成一組
		String pattern = "\\d{4}(-\\d{3}){2}";
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入手機號碼:格式為 XXXX-XXX-XXX");
		String input = scan.next();
		if (input.matches(pattern)) {
			System.out.println(input + " 符合手機號碼格式");
		} else {
			System.out.println(input + " 不符合手機號碼格式");
		}
	}

	@Test
	public void test2() {
		// 市話格式1: 數字2碼-數字7碼
		String pattern1 = "\\d{2}-\\d{7}";
		// 市話格式2: (數字2碼)-數字7碼
		String pattern2 = "\\(\\d{2}\\)-\\d{7}";
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入市話號碼: 格視為數字2碼-數字7碼 或 (數字2碼)-數字7碼");
		String input = scan.next();
		if (input.matches(pattern1) || input.matches(pattern2)) {
			System.out.println("符合");
		} else {
			System.out.println("不符合");
		}

		// ====================================
		// 合併 pattern1 & pattern2
		String pattern3 = "\\d{2}-\\d{7}|\\(\\d{2}\\)-\\d{7}";
		if (input.matches(pattern3)) {
			System.out.println("符合");
		} else {
			System.out.println("不符合");
		}

		String pattern4 = "(\\d{2}|\\(\\d{2}\\))-\\d{7}";
	}

	@Test
	public void test3() {
		// 市話格式:數字2碼-數字7碼或8碼
		String pattern = "\\d{2}-(\\d{7}|\\d{8})";
		// \\d{7,8} : 表 \\d 至少出現7次，至多8次
		String pattern1 = "\\d{2}-\\d{7,8}";
	}

	@Test
	public void test4() {
//		區碼和號碼有以下2種格式
//		區碼有小括號，後面接連電話號碼，例如 (02)12345678
//		區碼沒有小括號，但區碼和電話號碼用 – 連接，例如 02-1234567

		String pattern = "(\\(\\d{2}\\)|\\d{2}-)\\d{7,8}";
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入市話號碼test4");
		String input = scan.next();
		if (input.matches(pattern)) {
			System.out.println("符合");
		} else {
			System.out.println("不符合");
		}
	}

	@Test
	public void test5() {
//		區碼總共會有 2~4 碼，0開頭
//		電話號碼 7~8 碼
//		區碼和號碼中間以 – 連接，例如 02-12345678

		String pattern = "0[1-9]{1,3}-\\d{7,8}";
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入市話號碼test5");
		String input = scan.next();
		if (input.matches(pattern)) {
			System.out.println("符合");
		} else {
			System.out.println("不符合");
		}
	}

	@Test
	public void charTest() {
		String pattern = "[A-CSW-Z]";
		String str = "S";
		System.out.println(str.matches(pattern));
	}

	@Test
	public void checkTaiwanIdNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入身分證字號");
		String input = scan.next();
		System.out.println(input);
		String pattern = "[A-Za-z&&[^ABDEFHabdefh]][1-2]\\d{8}";
		if (input.length() != 10) {
			System.out.println(false);
			return;
		}

		if (!input.matches(pattern)) {
			System.out.println(false);
			return;
		}
		System.out.println(true);
	}
}
