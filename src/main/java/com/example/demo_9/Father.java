package com.example.demo_9;

public class Father {

	protected String name;

	public Father() {
		super();
	}

	public Father(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void walk() {
		System.out.println(name + " is walking!");
	}

}
