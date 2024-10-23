package com.example.demo_9;

public class Submarine extends Boat implements Dive {

	private String name = "波士頓號";

	@Override
	public void diving() {
		System.out.println("Diving");

	}

	@Override
	public void move() {
		System.out.println(this.name + " move forward");
	}

}
