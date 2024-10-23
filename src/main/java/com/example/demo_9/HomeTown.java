package com.example.demo_9;

public class HomeTown {
	// properties
	private String city;

	private String state;

	private String country;

	// constructor
	public HomeTown() {
		super();
	}

	public HomeTown(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}

	// getter methods
	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}
	
	// methods

}
