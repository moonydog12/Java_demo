package com.example.demo_9;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ConditionTest {

	@Test
	public void ifTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入2個數字(用空格分隔)~~");
		int x = scan.nextInt();
		int y = scan.nextInt();
		if (x > y) {
			System.out.println("輸入的第一個數字比較大");
		}
	}

	@Test
	public void ifElseTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入2個數字(用空格分隔)~~");
		int x = scan.nextInt();
		int y = scan.nextInt();
		if (x > y) {
			System.out.println("輸入的第一個數字比較大");
		} else {
			System.out.println("輸入的第一個數字比較小");
		}
	}
	@Test
	public void ifElseTest2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入2個數字(用空格分隔)~~");
		int x = scan.nextInt();
		int y = scan.nextInt();
		String str = "";
		if (x > y) {
			str = "輸入的第一個數字比較大";
		} else {
			str = "輸入的第一個數字比較小";
		}
	    System.out.println(str);
	}
	@Test
	public void ifElseTest3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入2個數字(用空格分隔)~~");
		int x = scan.nextInt();
		int y = scan.nextInt();
		String str = x > y ? "輸入的第一個數字比較大" : "輸入的第一個數字比較小";
//		if (x > y) {
//			str = "輸入的第一個數字比較大";
//		} else {
//			str = "輸入的第一個數字比較小";
//		}
//	    System.out.println(str);
	}
	@Test
	public void ifElseIfTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入2個數字(用空格分隔)~~");
		int x = scan.nextInt();
		int y = scan.nextInt();
		if (x > y) {
			System.out.println("輸入的第一個數字比較大");
		} else if (x == y){
			System.out.println("輸入的數字一樣大");
		} else {
			System.out.println("輸入的第一個數字比較小");
		}
		
    }
	@Test
	public void ifElseIfTest2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入2個數字(用空格分隔)~~");
		int x = scan.nextInt();
		int y = scan.nextInt();
		if (x > y) {
			System.out.println("輸入的第一個數字比較大");
		}  if (x == y){
			System.out.println("輸入的數字一樣大");
		} else {
			System.out.println("輸入的第一個數字比較小");
		}
		
    }
	@Test
	public void hw() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入本週的工時");
		int hr = scan.nextInt();
		double a = hr*150*0.8;
		if (hr < 40) {
			//hr*150*0.8 計算結果的資料型態會是 double，會有小數點
			//要去除小數點只顯示整數，就要把整個計算結果轉型成 int
			//注意: 浮點數轉型成整數，只會取整數，不管小數點後的數字是多少，皆會去除
			//      例如: (int)15.8  --> 15: (int)0.8  --> 0
			System.out.println("工資0.8倍~~本週薪水: " + (int)(hr*150*0.8) + " 元");
		}  else if (hr == 40){
			System.out.println("工資1倍~~本週薪水: " + hr*150 + " 元");
		} else if (hr > 40 && hr <= 50){
			System.out.println("工資1.2倍~~本週薪水: " + hr*150*1.2 + " 元");
		} else {
			System.out.println("工資1.6倍~~本週薪水: " + hr*150*1.6 + " 元");
		}
		
	}
   
	@Test
	public void test(){
	    System.out.println(90/10); // 9
	    System.out.println(99/10); // 9.9
	    System.out.println(99.0/10);
	    System.out.println(99/10.0);
	 }
	@Test
	public void switchtest(){
       Scanner scan = new Scanner(System.in);
       System.out.println("請輸入成績");	
       int score = scan.nextInt();
       switch(score/10) {
           case 10:
    	     System.out.println("A+");
    	     break;
           case 9:// 9 是 score/10 的結果之一
    	     System.out.println("A");
    	     break; // break 是指跳出整個 switch 執行區塊:若沒有 break，程式碼會繼續往下執行
           case 8:
        	   System.out.println("B");
        	   break;
           case 7:
        	   System.out.println("C");
        	   break;
           case 6:
        	   System.out.println("D");
        	   break;
           default: //上述所有 case 都不符合時，會進來此區塊；等同於 else
        	   System.out.println("E");
       }
	
	}
	@Test
	public void switchtest1(){
       Scanner scan = new Scanner(System.in);
       System.out.println("請輸入天數");	
       int days = scan.nextInt();
       switch(days % 7) {
       case 0:
  	     System.out.println("星期天");
  	     break;  
       case 6:
    	     System.out.println("星期六");
    	     break;
           case 5:
    	     System.out.println("星期五");
    	     break;
           case 4:
      	     System.out.println("星期四");
      	     break;
           case 3:
      	     System.out.println("星期三");
      	     break;
           case 2:
      	     System.out.println("星期二");
      	     break;
           case 1:
      	     System.out.println("星期一");
      	     
       }
	}
	@Test
	public void switchtest2(){
       Scanner scan = new Scanner(System.in);
       System.out.println("請輸入天數");	
       int days = scan.nextInt();
       switch(days % 7) {
       case 0:
  	     System.out.println("星期五");
  	     break;  
       case 6:
    	     System.out.println("星期四");
    	     break;
           case 5:
    	     System.out.println("星期三");
    	     break;
           case 4:
      	     System.out.println("星期二");
      	     break;
           case 3:
      	     System.out.println("星期一");
      	     break;
           case 2:
      	     System.out.println("星期天");
      	     break;
           case 1:
      	     System.out.println("星期六");
      	     
       }
	}
	@Test
	public void switchtest3(){
       Scanner scan = new Scanner(System.in);
       System.out.println("請輸入今天是星期幾");
       int today = scan.nextInt(); //1~7
       if (today < 1 || today > 7) { // 排除法
           System.out.println("輸入的星期幾錯誤");
    	   return;
       }   
       System.out.println("請輸入天數");	
       int days = scan.nextInt();
       int x = (today+days) % 7;
       switch(x) {
       case 0:
  	       System.out.printf("今天是星期 %d，%d 天後是星期天", today, days);
           break;
       case 1:
    	   System.out.printf("今天是星期 %d，%d 天候是星期%d", today, days, x);
    	   break;
       case 2:
    	   System.out.printf("今天是星期 %d，%d 天候是星期%d", today, days, x);
    	   break;
       case 3:
    	   System.out.printf("今天是星期 %d，%d 天候是星期%d", today, days, x);
    	   break;
       case 4:
    	   System.out.printf("今天是星期 %d，%d 天候是星期%d", today, days, x);
    	   break;
       case 5:
    	   System.out.printf("今天是星期 %d，%d 天候是星期%d", today, days, x);
      	   break;
       case 6:
      	   System.out.println("星期一");
      	     
       }
	}
}
