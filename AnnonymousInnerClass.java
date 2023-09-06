package com.programming;
abstract class sample{
	abstract void show();
}
public class AnnonymousInnerClass {
	public static void main(String[] args) {
		sample obj = new sample() {
		void show() {
			System.out.println("Hello everyone");
		}
	};
	obj.show();
}
}
