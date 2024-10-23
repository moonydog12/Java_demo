package com.example.demo_9;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class LoopTest {

    @Test  
	public void forTest() {
	    int sum = 0;
    	for(int i = 1; i <= 10; i++) { // i++ ==> i = i + 1�F i+=2 ==> i=i+2
		    System.out.printf("i = %d; �쥻�� sum = %d\n", i, sum);
		    sum = sum + i;
		    System.out.printf("i = %d; �[�`�᪺ sum =%d \n", i, sum);
		    System.out.println("======================");
		    // i = 1; sum = 0; sum = 0 + 1
		    // i = 2; sum = 1; sum = 1 + 2
	    }
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("sum = " + sum);
    }
	
    @Test  
	public void forTest2() {
    	for(int i = 1; i <= 9; i++) {
    	    for(int j = 1; j <=9; j++) {
    	    System.out.printf("%d*%d=%d" , i, j, i*j);
    	}
        System.out.println("\n");
    	}
    
    }
    
    @Test  
	public void forTest3() {
	    int sum = 0;
	    for(int i = 1; i <=10; i++){
	    	if(i == 5) {
//	    		break; // ���X�o��Ӱj��
	    		continue; //���L���j��
	    	}
   	        System.out.println("i = " + i);
	    	sum = sum + i;
   	        
	    }
        System.out.println("sum = " + sum);    
    }


   @Test
   public void whileTest() {
	   int i = 1;
	   int sum = 0;
	   while(i <= 10) {
          sum += i; // sum = sum + i;
          i++;
	   
	   }
       System.out.println("sum = " + sum);
    
   }    
   @Test
   public void whileTest2() {
	   int i = 0;
	   while(true) { //�L�a�j��
		   System.out.println(i++);
	   }
   }
   @Test
   public void whileTest3() {
	   int i = 0;
	   for(;;) { //�L�a�j��
          System.out.println(i++);
	   }
	   }

     @Test
     public void dowhileTest(){
    	 int i = 1;
    	 int sum = 0;
    	 do {
    		 sum += i; //sum = sum + i;
    		 i++;
    	 } while(i <= 10);
    	 System.out.println("sum = " + sum);
    	 
    		 {
    			 {
    		 {
    		 
    		 }
    			 
    			 }
    			 }

    	 }
     @Test  
 	public void forTest62() {
     	a:for(int i = 1; i <= 9; i++) {
     		for(int j = 1; j <=9; j++) {
     		if(j == 5) {
     			// break �M continue ���@�νd��O����̪񪺰j��
     			//�ҥH�o�̪� break �M continue �������Oj ���j��
     			break a;  //�ϥμ��Ҩåi�H���w�n���X���Ӱj��
//     		    continue;
     		}
     	    
     	    System.out.printf("%d*%d=%2d" , i, j, i*j);
     	}
         System.out.printf("\n");
     	}
     
     }
     
 	   
 	   
 	   
 	   
    @Test
    public void hw() {
        int bomb = 87;
    	int bottom = 1;
    	int top = 99;
    	Scanner scan = new Scanner(System.in);
    	while(true) {
    	   System.out.printf("�Цb %d ~ %d �����q�ӼƦr�ӸѰ����u\n", bottom, top);
    	   int num = scan.nextInt();
    	   //��J���Ʀr�W�X�d��

    		if(num < bottom || num > top ) {
    			System.out.printf("�Ʀr�W�X�d��A�Цb %d ~ %d �����q�ӼƦr�ӸѰ����u\n", bottom, top);
    		    continue;
    			
    		} 
    		if (num == bomb) {
    		   System.out.println("���ߡA���u�Y�N���z");
    		   break;
    		}
    		if(num < bomb) { //
    		   bottom = num;
    		}else {
    		  top = num;
       }
          }
    	}
   
    @Test
    public void addTest() {
    	add(5, 3);
    }
    public void add(int x, int y) {
    	int z = 2*x + 3*y;
    	System.out.println("�p�⵲�G = " + z);
    }
 	   

 	   
 	   }
 	   
    		 


	
	
	
	
	
	
	

