package com.example.demo_9;

public class Employee {
	private String id;

	private String name;

	private int age;

	private String gender;

	// 把自定義的 HomeTown 類別當成 Employee 的屬性之一
	private HomeTown homeTown;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String id, String name, int age, String gender, HomeTown homeTown) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.homeTown = homeTown;
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

	public String getGender() {
		return gender;
	}

	public HomeTown getHomeTown() {
		return homeTown;
	}

}
