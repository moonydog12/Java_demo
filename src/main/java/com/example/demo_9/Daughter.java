package com.example.demo_9;

public class Daughter extends Father {
	public Daughter() {
		super();
	}

	public Daughter(String name) {
		super(name);

	}

	public void shopping() {
		System.out.printf(super.getName() + " is shopping!");
	}

}
