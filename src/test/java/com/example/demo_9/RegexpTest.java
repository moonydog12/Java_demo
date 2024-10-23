package com.example.demo_9;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class RegexpTest {
	
  @Test
  public void test1() {
	  Scanner scan = new Scanner(System.in);
	  String str = scan.next();
	  String[] array = str.split("-");
	  if (array.length != 3) {
		  System.out.println();
	  }
  }
	
  @Test
  public void test2(){
	  String str = "0979-826-417";
      // \\d 用來表示 0~9 的數字
//	  String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
	  //用大括號{}處理重複出現的字串
//	  String pattern = "\\d{4}-\\d{3}-\\d{3}";
	  // 用小括號處理分組
	  String pattern = "\\d{4}(-\\d{3}){2}";
	  System.out.println(str.matches(pattern));
  }
  
  @Test
  public void test3(){
	  String a = "\\d";
	  // (2碼)8碼
	  // 小括號()在pattern 中是分組用，屬於有意義的符號:
	  // 要把其變成無意義的符號，單純就只是括號的字符，要用跳脫符號:
	  // 跳脫符號不能單獨存在，要用2個 \\
	  String pattern = "\\(\\d{2}\\)\\d{8}";
	  String str = "(02)12345678";
			  System.out.println(str.matches(pattern));
  }
  
  @Test
  public void test4(){
	  // pattern 比對，管道| 的前後不能有空白
	  // 以下 pattern 的寫法表示: 2碼的數字+一個空白或是一個空白+3碼數字 才會匹配
	  // 要正確匹配2碼或3碼數字，應該是: pattern = "\\d{2}|\\d{3}"
	  String pattern = "\\d{2}|\\d{3}";
	  String str = "123";
	  String str1 = "12 ";
	  System.out.println(str.matches(pattern));
	  System.out.println(str1.matches(pattern));
  }
  
  @Test
  public void test5(){
	  // ? 表示可有可無，即 0~1 次
	  String pattern = "John(na)?son";
	  // * 表示 0~多次
	  String pattern1 = "John(na)*son";
	  // + 表示 1~多次
	  String pattern2 = "John(na)+son"; 
	  //=======================
	  String str = "Johnson";
	  String str1 = "Johnnason";
	  String str2 = "Johnnanason";
	  //=======================
	  System.out.println(str.matches(pattern));
	  System.out.println(str.matches(pattern1));
	  System.out.println(str.matches(pattern2));
	  System.out.println("===================");
	  System.out.println(str1.matches(pattern));
	  System.out.println(str1.matches(pattern1));
	  System.out.println(str1.matches(pattern2));
	  System.out.println("===================");
	  System.out.println(str2.matches(pattern));
	  System.out.println(str2.matches(pattern1));
	  System.out.println(str2.matches(pattern2));
	  System.out.println("===================");
  }
  
    @Test 
    public void test6() {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("請輸入電話號碼");
    	String str = "0[1-9] {1,3}-||d{7,8}";
    	System.out.println();
    }
  
    @Test
    public void test7() {
    	 Scanner str = new Scanner(System.in);
    	 System.out.println("請檢查身分證字號");
    	 String pattern = "[A-Za-z][1-2]\\d{8}";
    	 String pattern1 = "[A-Za-z&&[ABDEFHabdefh]][1-2]\\d{8}";
    	 
    }
   
    
}
