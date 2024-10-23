package com.example.demo_9;

public class Son extends Father {

	public Son(String name) {
		super();
		this.name = name;
	}

	public Son() {
		super();
	}

	@Override
	public void walk() {
		System.out.println(super.name + " is walking!");
	}

	public void playball() {
		System.out.println(super.name + " is playing ball!");
	}

}
