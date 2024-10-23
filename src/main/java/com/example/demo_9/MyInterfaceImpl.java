package com.example.demo_9;

// 類別要實作介面的 keyword 是 implements
public class MyInterfaceImpl implements MyInterface {

	// 類別必須要重新定義"所有"定義在介面中的方法
	@Override
	public void fly() {
		System.out.println("We flying~");
	}

	@Override
	public void soar() {
		System.out.println("We soaring");

	}

	// 預設方法不強制重新定義
	@Override
	public void jump(String name) {
		// TODO Auto-generated method stub
		MyInterface.super.jump(name);
	}

}
