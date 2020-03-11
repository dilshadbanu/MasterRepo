//Assignment #16

package com.epsilon.assignment.day.three;

import java.util.Arrays;

public class Person {
	String name;
	String address;

	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public static void main(String[] args) {
		Person[] people = { new Student("Shyam", "Bangalore, Karnataka", "Java fundamentals", 2010, 4500.0),
				new Staff("Anand", "Bangalore, Karnataka", "Delhi Public school", 35000.0),
				new Staff("Umesh", "Bangalore, Karnataka", "National Public school", 42000.0),
				new Student("Suresh", "Hassan, Karnataka", "Java fundamentals", 2012, 4750.0),
				new Student("Kiran", "Vasco, Goa", "Reactjs", 2017, 12500.0) };
		System.out.println(Arrays.toString(people));
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
