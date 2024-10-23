package com.example.demo_9;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.boot.origin.SystemEnvironmentOrigin;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.FileSystemXmlApplicationContext;

//@SpringBootTest
public class Demo9ApplicationTests {

	@Test
	public void contextLoads() {
		int x = 5; // �ŧi�ܼ� X = 5�A��5�o�ӭȳ]�w���ܼ� X
		// �]���ܼ� X �O�Ĥ@���ϥΡA�ҥH�@�w�n�ŧi�A�Y�b�ܼ� X �e���[�W��ƫ��A int
		System.out.println(x);// �⵲�G�L�X�� console�A�ֱ���: ��J syso ��� alt + /
		x = 10; // �ۦP���ܼ� X �i�H���ƨϥΡA�����୫�ƫŧi(�ŧi�O���ܼ� X �e���[�W��ƫ��A int)
		// �]���ۦP���ܼơA���e�ȷ|��\�e�A�ҥH X ���ȷ|�q5�ܦ�10
		System.out.println(x);
		x = x + 5; // �|��10+5���p�⵲�G�ᤩ���ܼ� X
		System.out.println(x);
	}

	@Test
	public void exam1() {
		int hrS = 120;
		int hr = 8;
		int z = hrS * hr * 300;
		System.out.println("�`�~��: " + z);// �r��P�ƭȦ걵�A�|��ƭ�z�ন�r��A�걵
		// �L�X�����G �`�~��: 288000 �A288000�ݰ_�ӬO�Ʀr�A����ڤW����ƫ��A�O�r��
		System.out.println("���~: " + hrS + ",�C�Ѫ��u�@�ɼ�: " + hr + ", �u�@300�Ѧ~�~: " + z);
		System.out.printf("���~: %d ,�C�Ѫ��u�@�ɼ�: %d,�u�@300�Ѧ~�~: %d \n", hrS, hr, z);

	}

	@Test
	public void exam2() {
		int x = 10;
		int y = 20;
		System.out.println(x + y);// �ƭȪ��ۥ[
		String str = "ABC";
		String str1 = "DEF";
		System.out.println(str + str1);// �r�ꪺ�걵�i�H�βŸ� +
	}

	@Test
	public void exam3() {
		int x = 100;
		long y = 1234567890123L;
		float f = 1.123F;
		double d = 1.234;
		char c = 'a';
		System.out.println(c + "======");
	}

	@Test
	public void exam4() {
		// ����Ÿ�
		System.out.println(1 > 2); // �j��
		System.out.println(1 < 2); // �p��
		System.out.println(5 == 5); // ����
		System.out.println(1 >= 2); // �j�󵥩�
		System.out.println(1 <= 2); // �p�󵥩�
		System.out.println(1 != 2); // ������
//===============================
		boolean boo = 1 >= 2;
		System.out.println("boo: " + boo);
	}

	@Test
	public void exam5() {
		int x = 5;
		System.out.println(x);
		x++; // ���P�� x = x+1;
		System.out.println(x);

	}

	@Test
	public void exam6() {
		int x = 5;
		System.out.println("x =" + x);// 5
		int y = ++x;
		System.out.println("x =" + x);// 6
		System.out.println("y =" + y);// 6
		int z = y--;
		System.out.println("y =" + y);// 5
		System.out.println("z =" + z);// 6
	}

	@Test
	public void exam7() {
		// �򥻸�ƫ��A���ܼƫŧi
		// int: ��ƫ��A; x: �ܼ�: 10: ��
		int x = 10;
		// ���O(class)���ܼƫŧi(���O�����i�H�����O�ظ�ƫ��A)
		// String: ���O(class); str: �ܼƦW��; new String(): ���O�n�ᤩ���ܼ� str �N�n�ϥ�new+
		// ���O�W��()
		String str = new String();
		// new String(): ��ܫإ����O�ɡA��������l�A�Y��ܬO�Ŧr��
		// new String(ABC): ��ܫإ����O�ɡA������l�� ABC
		String str1 = new String("ABC");
		// =============================================
		// �]�� String �b Java ������S��A�ҥH�i�H���򥻸�ƫ��A���ˡA�ŧi�ܼƮɪ����ᤩ��
		String str2 = new String("ABC");
	}

	@Test
	public void scannerTest() {
		// String: ��ƫ��A; str: �ܼƦW��: "ABC": ��
		String str = "ABC";
		// String �O���O(class)�A���ݩ�8�ظ�ƫ��A�A�쥻���ӬO�n�ϥ� NEW ���O���覡�ӽᤩ��
		// �� JAVA �� String �O�S�����O�A�i�H�����b�����᭱�ᤩ��
		String str1 = new String("ABC");
		// Scanner �O���O�A�����n�� New Scanner()���覡�ᤩ��
		// �B�W�w�b new Scanner �ɡA�b�p�A�����n��J System.in
		Scanner scan = new Scanner(System.in);
		// �N���O��� new �X�ӫ�ᤩ���ܼ� scan�A����N�O�z�L scan �Ӿާ@
		System.out.println("�п�J�@�ӼƦr~~");// ���ܨϥΪ̭n��J�Ʀr
		// �n�ϥ� scan �̭��w�q����k<�i�H�z�L�I(.)�өI�s
		int x = scan.nextInt();// ���o��J�����
		System.out.println("��J���Ʀr�O: " + x);
	}

	@Test
	public void scannerTest2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ǳƦn�Y�J�a���F��~~");
		String str = scan.nextLine();
		System.out.println("�z���^���O: " + str);

	}

	@Test
	public void interfaceTest() {
		MyInterface my = new MyInterfaceImpl();
		my.soar();
		my.fly();
	}

}
