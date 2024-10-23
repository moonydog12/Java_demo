package com.example.demo_9;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class Lec5Test {
	@Test
	public void mathTest() {
		int a = Math.max(1, 2);
		System.out.println(a);
		int c = Math.max(1, Math.max(2, 99)); // 比較三數以上
		this.stringPractice("AAABBDDCC");
	}

	@Test
	public void stringTest() {
		String str1 = "123456";
		int a = str1.length();
		System.out.println(a);

		// 判斷內容有無意義
		String str2 = "";
		String str3 = " ";
		String str5 = new String(); // 預設空字串
		boolean b1 = str2.isEmpty();
		boolean b2 = str3.isEmpty();
		System.out.printf("字串長度為:%d, isEmpay結果:%b\n", str2.length(), b1);
		System.out.printf("字串長度為:%d, isEmpay結果:%b\n", str3.length(), b2);

		// search
		String para = "小龍女與楊過與李莫愁";
//		System.out.println(para.contains("小"));
//		System.out.print(para.charAt(para.length() - 1));
//		System.out.print(para.indexOf("龍"));
		System.out.println(para.substring(7));
		System.out.println(para.substring(7, 9));

		// 轉換型態
		String[] arr2 = para.split("");
		System.out.println(Arrays.toString(arr2));
		System.out.println(String.join("", arr2));
	}

	@Test
	public void stringPractice(String str) {
		String[] arr = str.split("");
		System.out.println(str.replace("A", ""));
		System.out.println(Arrays.toString(arr));
		int countsA = 0;
		int countsB = 0;
		int countsC = 0;
		int countsD = 0;
		for (int i = 0; i < arr.length; i++) {
			String current = arr[i];
			switch (current) {
			case "A":
				countsA += 1;
				break;
			case "B":
				countsB += 1;
				break;
			case "C":
				countsC += 1;
				break;
			case "D":
				countsD += 1;
				break;
			}
		}
		System.out.println();
		System.out.println(countsA);
		System.out.println(countsA + "個A" + " " + countsB + "個B" + " " + countsC + "個C" + " " + countsD + "個D");

	}
}
