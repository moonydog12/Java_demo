package com.example.demo_9;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class ConditionTest {

	@Test
	public void ifTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J2�ӼƦr(�ΪŮ���j)~~");
		int x = scan.nextInt();
		int y = scan.nextInt();
		if (x > y) {
			System.out.println("��J���Ĥ@�ӼƦr����j");
		}
	}

	@Test
	public void ifElseTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J2�ӼƦr(�ΪŮ���j)~~");
		int x = scan.nextInt();
		int y = scan.nextInt();
		if (x > y) {
			System.out.println("��J���Ĥ@�ӼƦr����j");
		} else {
			System.out.println("��J���Ĥ@�ӼƦr����p");
		}
	}
	@Test
	public void ifElseTest2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J2�ӼƦr(�ΪŮ���j)~~");
		int x = scan.nextInt();
		int y = scan.nextInt();
		String str = "";
		if (x > y) {
			str = "��J���Ĥ@�ӼƦr����j";
		} else {
			str = "��J���Ĥ@�ӼƦr����p";
		}
	    System.out.println(str);
	}
	@Test
	public void ifElseTest3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J2�ӼƦr(�ΪŮ���j)~~");
		int x = scan.nextInt();
		int y = scan.nextInt();
		String str = x > y ? "��J���Ĥ@�ӼƦr����j" : "��J���Ĥ@�ӼƦr����p";
//		if (x > y) {
//			str = "��J���Ĥ@�ӼƦr����j";
//		} else {
//			str = "��J���Ĥ@�ӼƦr����p";
//		}
//	    System.out.println(str);
	}
	@Test
	public void ifElseIfTest() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J2�ӼƦr(�ΪŮ���j)~~");
		int x = scan.nextInt();
		int y = scan.nextInt();
		if (x > y) {
			System.out.println("��J���Ĥ@�ӼƦr����j");
		} else if (x == y){
			System.out.println("��J���Ʀr�@�ˤj");
		} else {
			System.out.println("��J���Ĥ@�ӼƦr����p");
		}
		
    }
	@Test
	public void ifElseIfTest2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J2�ӼƦr(�ΪŮ���j)~~");
		int x = scan.nextInt();
		int y = scan.nextInt();
		if (x > y) {
			System.out.println("��J���Ĥ@�ӼƦr����j");
		}  if (x == y){
			System.out.println("��J���Ʀr�@�ˤj");
		} else {
			System.out.println("��J���Ĥ@�ӼƦr����p");
		}
		
    }
	@Test
	public void hw() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J���g���u��");
		int hr = scan.nextInt();
		double a = hr*150*0.8;
		if (hr < 40) {
			//hr*150*0.8 �p�⵲�G����ƫ��A�|�O double�A�|���p���I
			//�n�h���p���I�u��ܾ�ơA�N�n���ӭp�⵲�G�૬�� int
			//�`�N: �B�I���૬����ơA�u�|����ơA���ޤp���I�᪺�Ʀr�O�h�֡A�ҷ|�h��
			//      �Ҧp: (int)15.8  --> 15: (int)0.8  --> 0
			System.out.println("�u��0.8��~~���g�~��: " + (int)(hr*150*0.8) + " ��");
		}  else if (hr == 40){
			System.out.println("�u��1��~~���g�~��: " + hr*150 + " ��");
		} else if (hr > 40 && hr <= 50){
			System.out.println("�u��1.2��~~���g�~��: " + hr*150*1.2 + " ��");
		} else {
			System.out.println("�u��1.6��~~���g�~��: " + hr*150*1.6 + " ��");
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
       System.out.println("�п�J���Z");	
       int score = scan.nextInt();
       switch(score/10) {
           case 10:
    	     System.out.println("A+");
    	     break;
           case 9:// 9 �O score/10 �����G���@
    	     System.out.println("A");
    	     break; // break �O�����X��� switch ����϶�:�Y�S�� break�A�{���X�|�~�򩹤U����
           case 8:
        	   System.out.println("B");
        	   break;
           case 7:
        	   System.out.println("C");
        	   break;
           case 6:
        	   System.out.println("D");
        	   break;
           default: //�W�z�Ҧ� case �����ŦX�ɡA�|�i�Ӧ��϶��F���P�� else
        	   System.out.println("E");
       }
	
	}
	@Test
	public void switchtest1(){
       Scanner scan = new Scanner(System.in);
       System.out.println("�п�J�Ѽ�");	
       int days = scan.nextInt();
       switch(days % 7) {
       case 0:
  	     System.out.println("�P����");
  	     break;  
       case 6:
    	     System.out.println("�P����");
    	     break;
           case 5:
    	     System.out.println("�P����");
    	     break;
           case 4:
      	     System.out.println("�P���|");
      	     break;
           case 3:
      	     System.out.println("�P���T");
      	     break;
           case 2:
      	     System.out.println("�P���G");
      	     break;
           case 1:
      	     System.out.println("�P���@");
      	     
       }
	}
	@Test
	public void switchtest2(){
       Scanner scan = new Scanner(System.in);
       System.out.println("�п�J�Ѽ�");	
       int days = scan.nextInt();
       switch(days % 7) {
       case 0:
  	     System.out.println("�P����");
  	     break;  
       case 6:
    	     System.out.println("�P���|");
    	     break;
           case 5:
    	     System.out.println("�P���T");
    	     break;
           case 4:
      	     System.out.println("�P���G");
      	     break;
           case 3:
      	     System.out.println("�P���@");
      	     break;
           case 2:
      	     System.out.println("�P����");
      	     break;
           case 1:
      	     System.out.println("�P����");
      	     
       }
	}
	@Test
	public void switchtest3(){
       Scanner scan = new Scanner(System.in);
       System.out.println("�п�J���ѬO�P���X");
       int today = scan.nextInt(); //1~7
       if (today < 1 || today > 7) { // �ư��k
           System.out.println("��J���P���X���~");
    	   return;
       }   
       System.out.println("�п�J�Ѽ�");	
       int days = scan.nextInt();
       int x = (today+days) % 7;
       switch(x) {
       case 0:
  	       System.out.printf("���ѬO�P�� %d�A%d �ѫ�O�P����", today, days);
           break;
       case 1:
    	   System.out.printf("���ѬO�P�� %d�A%d �ѭԬO�P��%d", today, days, x);
    	   break;
       case 2:
    	   System.out.printf("���ѬO�P�� %d�A%d �ѭԬO�P��%d", today, days, x);
    	   break;
       case 3:
    	   System.out.printf("���ѬO�P�� %d�A%d �ѭԬO�P��%d", today, days, x);
    	   break;
       case 4:
    	   System.out.printf("���ѬO�P�� %d�A%d �ѭԬO�P��%d", today, days, x);
    	   break;
       case 5:
    	   System.out.printf("���ѬO�P�� %d�A%d �ѭԬO�P��%d", today, days, x);
      	   break;
       case 6:
      	   System.out.println("�P���@");
      	     
       }
	}
}
