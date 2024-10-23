package com.example.demo_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;//Ctrl+Shift+O

public class ArrayTest {

	//���ŧi�}�C
	//double[] degree = new double[7];
	
	//�ŧi�}�C�P�ɽᤩ��
	//double[] degree = { ��,..........}
	
	@Test
	public void test1() {
		double[] degree = {25, 22, 24, 20, 26, 21, 23};
		System.out.println(degree[0]);
		System.out.println(degree[1]);
	}
	
	@Test
	public void test10() {
		    //index(���ޭ�) = 0, 1, 2, 3, 4, 5, 6: �}�C���׬O7
		double[] degree = {25, 22, 24, 20, 26, 21, 23};
		double sum = 0;
		for (int i = 0; i < degree.length; i++) {
			sum = sum + degree[i];
		}
		System.out.println(sum/7);
	}
	
	@Test
	public void test11() {
		    //index(���ޭ�) = 0, 1, 2, 3, 4, 5, 6: �}�C���׬O7
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
		//��J���j��
		for(int i = 0; i < 5; i++) {
			System.out.println("�п�J�@�ӼƦr�A0��ܰ����J");
			int x = scan.nextInt();
			if (x == 0) { //0��ܰ����J
				break;
			}
			arr[i] = x;
		}
		//�p��}�C���j��
		int sum = 0;
		int count = 0; //�Ψӭp��}�C���A�D0���Ʀr���X��
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.println(arr[i]);
				sum += arr[i];//sum = sum + arr[i];
				count++;
			}
		}
		System.out.println("��J�Ʀr������: " + sum/count);
	}
	
	@Test
	public void test3() {
		// List �O����(Interface)�A�L�k�Q new �X�ӡA�ҥH�n�o�n�h new �@�ӹ�@�Ӥ��������O
		List<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		//��J���j��
				for(int i = 0; i < 5; i++) {
					System.out.println("�п�J�@�ӼƦr�A0��ܰ����J");
					int x = scan.nextInt();
					if (x == 0) { //0��ܰ����J
						break;
					}
					list.add(x); //add(x): �N��J���ȥ[�J�� list �C��
	             }
				//�p��}�C���j��
				int sum = 0;
				for(int i = 0; i < list.size(); i++) {
					//���o list ���Y�Ӧ�m(index)�������ȡA�O�ϥ� get(index)
					if (list.get(i) != 0) {
						System.out.println(list.get(i));
						sum += list.get(i);
					}
				}
				System.out.println("��J�Ʀr������: " + sum/ list.size());
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
		System.out.println("�п�J�@�ӼƦr");
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
		    //Math.sqrt(i): ��i�}�ڸ�����
		    //���ơA�u�n���p�󵥩�ؼЭȶ}�ڸ��Y�i
		    for(int j = 2; j <= Math.sqrt(i); j++) {
		    	if(i % j == 0) {
		    		continue a;
		    	}		        
		    }
		    list.add(i);
		}
	    //�˧�
		Collections.reverse(list);
		//�L�X���G
		for(Integer item : list) {
			System.out.println(item);
		}
	}
	
}
