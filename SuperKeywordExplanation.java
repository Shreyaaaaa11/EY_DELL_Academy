package com.programming.class8;

class parent {

	void show() {
		System.out.println("Parent class function show");
	}

	int data = 10;
}

public class SuperKeywordExplanation extends parent {
	void show() {
		System.out.println("Child class function show");
	}

	int data = 20;

	void display() {
		System.out.println("the value of the current class object data is" + this.data);

		System.out.println("the value of the current class object data is" + super.data);

		this.show();

		super.show();

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		SuperKeywordExplanation obj = new SuperKeywordExplanation();

		obj.display();

	}
}
