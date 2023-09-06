package com.programming;

class Parent1 {

	void show() {
		System.out.println("parent class function");
	}
	int data = 10;

}

public class RunTimePolymorphism extends Parent1 {

	void show() {

		System.out.println("child class function");

	}

	int data = 20;

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Parent1 obj = new Parent1();

		obj.show();

		System.out.println("the value of the data is " + obj.data);

		RunTimePolymorphism obj2 = new RunTimePolymorphism();

		obj2.show();

		System.out.println("the value of the data is " + obj2.data);

		RunTimePolymorphism obj3 = new RunTimePolymorphism();

		obj3.show();

		System.out.println("the value of the data is " + obj3.data);

	}

}