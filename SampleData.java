package com.programming;

interface SampleData {
	void fullName(String firstName, String lastName);
}

public class SomeData implements SampleData {
	public void fullName(String firstName, String lastName) {
		System.out.println("Name is" + firstName + " " + lastName);
	}

	public static void main(String[] args) {
		SomeData obj = new SomeData();
		obj.fullName("ABC", "XYZ");
	}
}
