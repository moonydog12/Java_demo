package com.example.demo_9;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class StringTest {
	
	@Test
	public void test1() {
		// String 等號後面直接賦予值，則會把內容值放到一個叫 String Pool(字串池)的地方存放
		String str = "ABC";
		String str1 = "ABC";
		//只要是 new，就表示會產生一個新的記憶體位址
		String str2 = new String("ABC"); 
		String str3 = new String("ABC");
		// Java 中兩個等號是只能用來比較 1.記憶體位址 2.原始資料型態的值
		System.out.println(str == str1);
		System.out.println(str == str2);
		System.out.println(str2 == str3);
		// 比較String(字串)的內容值要用 equals(大小寫要一樣) 或者 equalsIgnoreCase(忽略大小寫)
		System.out.println(str2.equals(str3));
		System.out.println(str2.equalsIgnoreCase(str3));
	}
	
	@Test
	public void test2() {
		String str = "ABCD";
		System.out.println(str.length());
		String str1 = ""; //空字串，長度 0
		String str2 = "  "; //空白字串，一個空白長度是 1
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("======================");
		System.out.println(str1.length());
		System.out.println(str2.length());
		//=============================
		//isEmpty()是用來判斷字串的長度是否為0
		System.out.println(str1.isEmpty());
		System.out.println(str2.isEmpty());
		//=============================
		//isBlank()是用來判斷空字串以及空白字串:就是字串中沒有任何字母或文字就會回 true
		System.out.println(str1.isBlank());
		System.out.println(str2.isBlank());
	}

	@Test
	public void test3() {
		String str = null;
		String str1 = "";
		String str2 = "ABC";
		String str3 = new String();
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println(str3.length());
		//當一個類別變數的值是 null時，呼叫方法會報錯(空指針錯誤，NullPointerException)
		System.out.println(str.length());
	}
	
	@Test
	public void test4() {
		String str = "ABCDBEFB";
		//    index : 01234567
		//indexOf: 從位置0開始由左往右，回傳找到第一個符合搜尋值的索引位置
		System.out.println(str.indexOf("B"));
		//indexOf(搜尋值，搜尋起始索引值): 從位置"搜尋起始索引值"開始由左往右，回傳找到第一個符合搜索值的索引位置
		System.out.println(str.indexOf("B", 3));
		//lastIndexOf("B"): 從最後開始往回找，回傳找到第一個(實際上是最後一個)符合搜索值的索引位置
		System.out.println(str.lastIndexOf("B"));
		//===================
		// 把BE 當成一個搜尋字串，回傳符合搜尋值的第一個索引位置
		System.out.println(str.indexOf("BE"));
		System.out.println(str.indexOf("BF"));
	}
	@Test
	public void test10() {
		String str = "神鵰俠侶是楊過與小龍女的故事，我不喜歡小龍女的甲仙，雖然小龍女在楊過眼中是清新脫俗";
		String mono = "小龍女";
				int count = 0;
				int startIndex = 0;
//				while((startIndex = str.indexOf(target, startIndex)) ! = -1){
//				count++;
//				startIndex += mono.length();
//	}
				while(true) {
					int index = str.indexOf(mono, startIndex); //8
					if (index == -1) { // index == -1，表示找不到
						break;
					}
					count++;
					startIndex = index + mono.length(); // startIndex = Index +3 = 0 + 3
				}
	    System.out.println(count);

	       
	    
		    System.out.println(str.indexOf("小龍女", 11));
	        System.out.println(str.indexOf("小龍女", 22));
        
	}
	
	@Test
	public void test16() {
		String str = "神鵰俠侶是楊過與小龍女的故事，我不喜歡小龍女的甲仙，雖然小龍女在楊過眼中是清新脫俗";
		String subStr = str.substring(8);
		System.out.println(subStr);
		//==============================
		subStr = str.substring(8, 11);
		System.out.println(subStr);
	}
		
	
	@Test
	public void test17() {
		String str = "神鵰俠侶是楊過與小龍女的故事，我不喜歡小龍女的甲仙，雖然小龍女在楊過眼中是清新脫俗";
		String newStr = str.replaceFirst("小龍女", "小籠包");
		System.out.println(newStr);
		
	}
	@Test
	public void test18() {
		String str = " 神 雕 俠 侶 ";
		System.out.println(str);
		//trim(): 刪除字串最前面和最後面所有空白
		String newStr = str.trim();
		System.out.println(newStr);
		//replace(" ", ""): 刪除所有空白
		newStr = str.replace(" ", "");
		System.out.println(newStr);
	}
	@Test
	public void test19() {
		String str = "大尾鱸鰻";
		//用空字串去切，會切割每個字
		String[] newStr = str.split(""); //newStr = [大, 尾, 鱸, 鰻]
		for (String item : newStr) {
			System.out.println(item);
		}
		//newStr2 = 大_尾_鱸_鰻
		//join: 用於用於將字串的陣列/集合串成新字串		
		String newStr2 = String.join("_", newStr);
		System.out.println(newStr2);
	}
	@Test
	public void test20() {
		StringBuffer sbf = new StringBuffer();
//      StringBuffer sbf = new StringBuffer("ABC");
		sbf.append("ABC").append("DEF");
		sbf.append("QWE");
		String str = sbf.toString();
		System.out.println(str);
	}
	@Test
	public void test21() {

		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入文字");
		String str = scan.next();		
		StringBuffer sbf = new StringBuffer(str);{
			if(sbf.reverse().toString().equals(str));
			System.out.println(str + " 是迴文");
			System.out.println(str + " 不是迴文");{
				
			}
		}
	
	}
	

		@Test
		public void test22() {
			StringBuffer sb = new StringBuffer("ABACADEF");
			int lastIndex = sb.lastIndexOf("A");
			sb.setCharAt(lastIndex, 'W');
			System.out.println(sb.toString());
			}


		@Test
		
		 public void hw2(){
		        String str = "AABCBDCDACBDA";
		        int[] counts = new int[4]; // A, B, C, D

		        for (char c : str.toCharArray()) {
		            if (c == 'A') {
		                counts[0]++;
		            } else if (c == 'B') {
		                counts[1]++;
		            } else if (c == 'C') {
		                counts[2]++;
		            } else if (c == 'D') {
		                counts[3]++;
		            }
		        }

		        System.out.println("Occurrences of 'A': " + counts[0]);
		        System.out.println("Occurrences of 'B': " + counts[1]);
		        System.out.println("Occurrences of 'C': " + counts[2]);
		        System.out.println("Occurrences of 'D': " + counts[3]);
		    }
		@Test
		 public void hw3(){
			String str = "AABCBDCDACBDA";
			int length = str.length();
			while(length != 0) {
				//取得第一個字元:
				char ch = str.charAt(0);
				//String.valueOf(ch) 將字元轉換成字串
				//取得第一個字元A，將A全部用空字串取代，所以取代後的字串不會有A
				str = str.replace(String.valueOf(ch), "");
				//用原本字串的長度減去新的字串長度，就會得到A出現了幾次
				int count = length - str.length();
				// %s 表示參數的資料型態是字串;%d 表示參數的資料型態是數字
				System.out.printf("字母 %s 出現了 %d 次 \n", String.valueOf(ch), count);
				//長度要替換成新字串的長度
				length = str.length();
			}
			
		}

}