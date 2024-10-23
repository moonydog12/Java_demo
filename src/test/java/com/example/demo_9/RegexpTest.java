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
      // \\d �ΨӪ�� 0~9 ���Ʀr
//	  String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
	  //�Τj�A��{}�B�z���ƥX�{���r��
//	  String pattern = "\\d{4}-\\d{3}-\\d{3}";
	  // �Τp�A���B�z����
	  String pattern = "\\d{4}(-\\d{3}){2}";
	  System.out.println(str.matches(pattern));
  }
  
  @Test
  public void test3(){
	  String a = "\\d";
	  // (2�X)8�X
	  // �p�A��()�bpattern ���O���եΡA�ݩ󦳷N�q���Ÿ�:
	  // �n����ܦ��L�N�q���Ÿ��A��´N�u�O�A�����r�šA�n�θ���Ÿ�:
	  // ����Ÿ������W�s�b�A�n��2�� \\
	  String pattern = "\\(\\d{2}\\)\\d{8}";
	  String str = "(02)12345678";
			  System.out.println(str.matches(pattern));
  }
  
  @Test
  public void test4(){
	  // pattern ���A�޹D| ���e�ᤣ�঳�ť�
	  // �H�U pattern ���g�k���: 2�X���Ʀr+�@�ӪťթάO�@�Ӫť�+3�X�Ʀr �~�|�ǰt
	  // �n���T�ǰt2�X��3�X�Ʀr�A���ӬO: pattern = "\\d{2}|\\d{3}"
	  String pattern = "\\d{2}|\\d{3}";
	  String str = "123";
	  String str1 = "12 ";
	  System.out.println(str.matches(pattern));
	  System.out.println(str1.matches(pattern));
  }
  
  @Test
  public void test5(){
	  // ? ��ܥi���i�L�A�Y 0~1 ��
	  String pattern = "John(na)?son";
	  // * ��� 0~�h��
	  String pattern1 = "John(na)*son";
	  // + ��� 1~�h��
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
    	System.out.println("�п�J�q�ܸ��X");
    	String str = "0[1-9] {1,3}-||d{7,8}";
    	System.out.println();
    }
  
    @Test
    public void test7() {
    	 Scanner str = new Scanner(System.in);
    	 System.out.println("���ˬd�����Ҧr��");
    	 String pattern = "[A-Za-z][1-2]\\d{8}";
    	 String pattern1 = "[A-Za-z&&[ABDEFHabdefh]][1-2]\\d{8}";
    	 
    }
   
    
}
