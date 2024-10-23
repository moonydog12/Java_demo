package com.example.demo_9;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class LoopTest {

    @Test  
	public void forTest() {
	    int sum = 0;
    	for(int i = 1; i <= 10; i++) { // i++ ==> i = i + 1； i+=2 ==> i=i+2
		    System.out.printf("i = %d; 原本的 sum = %d\n", i, sum);
		    sum = sum + i;
		    System.out.printf("i = %d; 加總後的 sum =%d \n", i, sum);
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
//	    		break; // 跳出這整個迴圈
	    		continue; //跳過當次迴圈
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
	   while(true) { //無窮迴圈
		   System.out.println(i++);
	   }
   }
   @Test
   public void whileTest3() {
	   int i = 0;
	   for(;;) { //無窮迴圈
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
     			// break 和 continue 的作用範圍是離其最近的迴圈
     			//所以這裡的 break 和 continue 跳離的是j 的迴圈
     			break a;  //使用標籤並可以指定要跳出哪個迴圈
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
    	   System.out.printf("請在 %d ~ %d 之間猜個數字來解除炸彈\n", bottom, top);
    	   int num = scan.nextInt();
    	   //輸入的數字超出範圍

    		if(num < bottom || num > top ) {
    			System.out.printf("數字超出範圍，請在 %d ~ %d 之間猜個數字來解除炸彈\n", bottom, top);
    		    continue;
    			
    		} 
    		if (num == bomb) {
    		   System.out.println("恭喜，炸彈即將引爆");
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
    	System.out.println("計算結果 = " + z);
    }
 	   

 	   
 	   }
 	   
    		 


	
	
	
	
	
	
	

