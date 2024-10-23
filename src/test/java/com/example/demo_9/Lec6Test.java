package com.example.demo_9;

import org.junit.jupiter.api.Test;

public class Lec6Test {
	@Test
	void contextLoads() {
		int a = 10;
		Integer b = 20;// class的預設值為null
		Integer c = new Integer(30);

		// class類別
		String str = "abc";
		String str1 = new String("abc");

		int aaa; // default is 0
		Integer bbb; // default is null, because Integer is a class
	}

	@Test
	public void stringTest() {
		String str = "abc";
		String str1 = "abc";
		String str2 = new String("abc");
		System.out.println(str == str1); // point to string pool
		System.out.println(str1 == str2);
		System.out.println(str.equals(str2));
	}

	@Test
	public void stringBUfferTest() {
		StringBuffer strBuf = new StringBuffer("abc");
		strBuf.append("ABC").append(false);
		System.out.println(strBuf.toString());
	}

	@Test
	public void stringReverseTest() {
		String str = "abcde";
		String[] strArray = str.split("");
		String output = "";
		for (int i = strArray.length - 1; i >= 0; i--) {
			output += strArray[i];
		}
		System.out.println(output);
	}

	@Test
	public void tttTest() {
		int a = 20;
		if (a >= 18) {
			System.out.println("年齡: " + a);
			System.out.println("成年");
		}
	}

}
