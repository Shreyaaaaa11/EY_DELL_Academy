package com.programming.class8;

public class ThisKeywordUsage {
	int data = 30;

	void display() {
		int data = 20;
		System.out.println("Value of local variable is" + data);
		System.out.println("Value of instance variable is" + this.data);
	}

	void display(int data) {
		System.out.println("value of local variable" + data);

		System.out.println("value of local variable" + this.data);

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		ThisKeywordUsage obj = new ThisKeywordUsage();

		obj.display();

		obj.display(40);

		obj.display();

	}

}
