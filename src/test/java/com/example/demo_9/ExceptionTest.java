package com.example.demo_9;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ExceptionTest {
	@Test
	public void test() {
		String str = null;
		getLength(str);
	}

	public void getLength(String str) {
//		try {
//			System.out.println(str.length());
//		} catch (Exception e) {
//
//			System.out.println(e.getMessage());
//		}

		try {
			System.out.println(str.length());
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());

		} finally {
			System.out.println("finally必定會執行");
		}
	}

	@Test
	public void test2() {
		Scanner scan = new Scanner(System.in);
		try {
			String input = scan.next();
		} catch (Exception e) {
		} finally {
//			scan 屬於 I/O, new 出來會建議在不使用時將其關閉，避免資源浪費
			scan.close();

		}

//		try with resources: 
//		1.將 new 出來的 I/O 類寫在 try 後面的小括號中，
//		2.程式碼離開 try catch區塊後自動執行 close 關閉資源
//		3.小括號中有多個 I/O 類的時候，用分號區隔
	}
}
