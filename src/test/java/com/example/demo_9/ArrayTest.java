package com.example.demo_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;//Ctrl+Shift+O

public class ArrayTest {

	//指宣告陣列
	//double[] degree = new double[7];
	
	//宣告陣列同時賦予值
	//double[] degree = { 值,..........}
	
	@Test
	public void test1() {
		double[] degree = {25, 22, 24, 20, 26, 21, 23};
		System.out.println(degree[0]);
		System.out.println(degree[1]);
	}
	
	@Test
	public void test10() {
		    //index(索引值) = 0, 1, 2, 3, 4, 5, 6: 陣列長度是7
		double[] degree = {25, 22, 24, 20, 26, 21, 23};
		double sum = 0;
		for (int i = 0; i < degree.length; i++) {
			sum = sum + degree[i];
		}
		System.out.println(sum/7);
	}
	
	@Test
	public void test11() {
		    //index(索引值) = 0, 1, 2, 3, 4, 5, 6: 陣列長度是7
		double[] degree = {25, 22, 24, 20, 26, 21, 23};
		double sum = 0;
		for (double mono : degree) {
			sum = sum + mono;
		}
		System.out.println(sum/7);
	}
	
	@Test
	public void test2() {		    
		int[] arr = new int[5];
		Scanner scan = new Scanner(System.in);
		//輸入的迴圈
		for(int i = 0; i < 5; i++) {
			System.out.println("請輸入一個數字，0表示停止輸入");
			int x = scan.nextInt();
			if (x == 0) { //0表示停止輸入
				break;
			}
			arr[i] = x;
		}
		//計算陣列的迴圈
		int sum = 0;
		int count = 0; //用來計算陣列中，非0的數字有幾個
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.println(arr[i]);
				sum += arr[i];//sum = sum + arr[i];
				count++;
			}
		}
		System.out.println("輸入數字的平均: " + sum/count);
	}
	
	@Test
	public void test3() {
		// List 是介面(Interface)，無法被 new 出來，所以要得要去 new 一個實作該介面的類別
		List<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		//輸入的迴圈
				for(int i = 0; i < 5; i++) {
					System.out.println("請輸入一個數字，0表示停止輸入");
					int x = scan.nextInt();
					if (x == 0) { //0表示停止輸入
						break;
					}
					list.add(x); //add(x): 將輸入的值加入到 list 列表中
	             }
				//計算陣列的迴圈
				int sum = 0;
				for(int i = 0; i < list.size(); i++) {
					//取得 list 中某個位置(index)對應的值，是使用 get(index)
					if (list.get(i) != 0) {
						System.out.println(list.get(i));
						sum += list.get(i);
					}
				}
				System.out.println("輸入數字的平均: " + sum/ list.size());
	}

	@Test
	public void test6() {
	int target = 56;
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i <= target; i++) {
			if(list.contains(i)) {
				break;
			}
			if(target%i == 0) {
				list.add(i);
				list.add(target/i);
			}
				
			}
		//list: 1, 56, 2, 28, 4, 14, 7, 8
		for(int i = 0; i < list.size(); i+=2) {
			System.out.printf("%d*%d\n", list.get(i), list.get(i+1));
		}
	}	
	@Test
	public void hw() {	
		List<Integer> list = new ArrayList<>();
		int i, j;
        for(i = 1; i <= 20; i++) {
        	for(j = 2; j<i; j++) {
        		if(i%j == 0)
        			break;
        	}
        	if (j == i) System.out.println(i);
        }		
		for (int mono : list) {
		System.out.println(mono);
	    }   		
	}
	@Test
	public void hwt() {
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入一個數字");
		int limit = scan.nextInt();
		List<Integer> list = new ArrayList<>();
		a : for(int i = 2; i <= limit; i++) {
			if(i == 2 || i == 3) {
				list.add(i);
				continue;
			}
		    if(i % 2 == 0) {
		    	continue;
		    }
		    //Math.sqrt(i): 找i開根號的值
		    //找質數，只要找到小於等於目標值開根號即可
		    for(int j = 2; j <= Math.sqrt(i); j++) {
		    	if(i % j == 0) {
		    		continue a;
		    	}		        
		    }
		    list.add(i);
		}
	    //倒序
		Collections.reverse(list);
		//印出結果
		for(Integer item : list) {
			System.out.println(item);
		}
	}
	
}
