package com.example.demo_9;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class StringTest {
	
	@Test
	public void test1() {
		// String �����᭱�����ᤩ�ȡA�h�|�⤺�e�ȩ��@�ӥs String Pool(�r���)���a��s��
		String str = "ABC";
		String str1 = "ABC";
		//�u�n�O new�A�N��ܷ|���ͤ@�ӷs���O�����}
		String str2 = new String("ABC"); 
		String str3 = new String("ABC");
		// Java ����ӵ����O�u��ΨӤ�� 1.�O�����} 2.��l��ƫ��A����
		System.out.println(str == str1);
		System.out.println(str == str2);
		System.out.println(str2 == str3);
		// ���String(�r��)�����e�ȭn�� equals(�j�p�g�n�@��) �Ϊ� equalsIgnoreCase(�����j�p�g)
		System.out.println(str2.equals(str3));
		System.out.println(str2.equalsIgnoreCase(str3));
	}
	
	@Test
	public void test2() {
		String str = "ABCD";
		System.out.println(str.length());
		String str1 = ""; //�Ŧr��A���� 0
		String str2 = "  "; //�ťզr��A�@�Ӫťժ��׬O 1
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("======================");
		System.out.println(str1.length());
		System.out.println(str2.length());
		//=============================
		//isEmpty()�O�ΨӧP�_�r�ꪺ���׬O�_��0
		System.out.println(str1.isEmpty());
		System.out.println(str2.isEmpty());
		//=============================
		//isBlank()�O�ΨӧP�_�Ŧr��H�Ϊťզr��:�N�O�r�ꤤ�S������r���Τ�r�N�|�^ true
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
		//��@�����O�ܼƪ��ȬO null�ɡA�I�s��k�|����(�ū��w���~�ANullPointerException)
		System.out.println(str.length());
	}
	
	@Test
	public void test4() {
		String str = "ABCDBEFB";
		//    index : 01234567
		//indexOf: �q��m0�}�l�ѥ����k�A�^�ǧ��Ĥ@�ӲŦX�j�M�Ȫ����ަ�m
		System.out.println(str.indexOf("B"));
		//indexOf(�j�M�ȡA�j�M�_�l���ޭ�): �q��m"�j�M�_�l���ޭ�"�}�l�ѥ����k�A�^�ǧ��Ĥ@�ӲŦX�j���Ȫ����ަ�m
		System.out.println(str.indexOf("B", 3));
		//lastIndexOf("B"): �q�̫�}�l���^��A�^�ǧ��Ĥ@��(��ڤW�O�̫�@��)�ŦX�j���Ȫ����ަ�m
		System.out.println(str.lastIndexOf("B"));
		//===================
		// ��BE ���@�ӷj�M�r��A�^�ǲŦX�j�M�Ȫ��Ĥ@�ӯ��ަ�m
		System.out.println(str.indexOf("BE"));
		System.out.println(str.indexOf("BF"));
	}
	@Test
	public void test10() {
		String str = "����L�Q�O���L�P�p�s�k���G�ơA�ڤ����w�p�s�k���ҥP�A���M�p�s�k�b���L�����O�M�s��U";
		String mono = "�p�s�k";
				int count = 0;
				int startIndex = 0;
//				while((startIndex = str.indexOf(target, startIndex)) ! = -1){
//				count++;
//				startIndex += mono.length();
//	}
				while(true) {
					int index = str.indexOf(mono, startIndex); //8
					if (index == -1) { // index == -1�A��ܧ䤣��
						break;
					}
					count++;
					startIndex = index + mono.length(); // startIndex = Index +3 = 0 + 3
				}
	    System.out.println(count);

	       
	    
		    System.out.println(str.indexOf("�p�s�k", 11));
	        System.out.println(str.indexOf("�p�s�k", 22));
        
	}
	
	@Test
	public void test16() {
		String str = "����L�Q�O���L�P�p�s�k���G�ơA�ڤ����w�p�s�k���ҥP�A���M�p�s�k�b���L�����O�M�s��U";
		String subStr = str.substring(8);
		System.out.println(subStr);
		//==============================
		subStr = str.substring(8, 11);
		System.out.println(subStr);
	}
		
	
	@Test
	public void test17() {
		String str = "����L�Q�O���L�P�p�s�k���G�ơA�ڤ����w�p�s�k���ҥP�A���M�p�s�k�b���L�����O�M�s��U";
		String newStr = str.replaceFirst("�p�s�k", "�pŢ�]");
		System.out.println(newStr);
		
	}
	@Test
	public void test18() {
		String str = " �� �J �L �Q ";
		System.out.println(str);
		//trim(): �R���r��̫e���M�̫᭱�Ҧ��ť�
		String newStr = str.trim();
		System.out.println(newStr);
		//replace(" ", ""): �R���Ҧ��ť�
		newStr = str.replace(" ", "");
		System.out.println(newStr);
	}
	@Test
	public void test19() {
		String str = "�j���t��";
		//�ΪŦr��h���A�|���ΨC�Ӧr
		String[] newStr = str.split(""); //newStr = [�j, ��, �t, ��]
		for (String item : newStr) {
			System.out.println(item);
		}
		//newStr2 = �j_��_�t_��
		//join: �Ω�Ω�N�r�ꪺ�}�C/���X�ꦨ�s�r��		
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
		System.out.println("�п�J��r");
		String str = scan.next();		
		StringBuffer sbf = new StringBuffer(str);{
			if(sbf.reverse().toString().equals(str));
			System.out.println(str + " �O�j��");
			System.out.println(str + " ���O�j��");{
				
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
				//���o�Ĥ@�Ӧr��:
				char ch = str.charAt(0);
				//String.valueOf(ch) �N�r���ഫ���r��
				//���o�Ĥ@�Ӧr��A�A�NA�����ΪŦr����N�A�ҥH���N�᪺�r�ꤣ�|��A
				str = str.replace(String.valueOf(ch), "");
				//�έ쥻�r�ꪺ���״�h�s���r����סA�N�|�o��A�X�{�F�X��
				int count = length - str.length();
				// %s ��ܰѼƪ���ƫ��A�O�r��;%d ��ܰѼƪ���ƫ��A�O�Ʀr
				System.out.printf("�r�� %s �X�{�F %d �� \n", String.valueOf(ch), count);
				//���׭n�������s�r�ꪺ����
				length = str.length();
			}
			
		}

}