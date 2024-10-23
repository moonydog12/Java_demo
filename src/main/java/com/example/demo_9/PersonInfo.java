package com.example.demo_9;

public class PersonInfo {
	private String id;

	private String name;

	private int age;

	private String city;

	private Bank2 bank;

	public PersonInfo() {
		super();
	}

	public PersonInfo(String id, String name, int age, String city, Bank2 bank) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.bank = bank;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

	public Bank2 getBank() {
		return bank;
	}

}
