package com.programming;

public class ReflectionClassInJava {}
interface MyInterface{}

public class ReflectionClassInJava {
	
	void printName(Object obj) {
		Class c = obj.getClass();
		System.out.println(c.getCanonicalName());
		System.out.println(c.getName());
	}
	public static void main(String[] args) {
		
		ReflectionClassInJava obj = new ReflectionClassInJava ();
		ReflectionClassInJava rC = new ReflectionClassInJava ();
		rC.printName(obj);
		
		Class c = boolean.class;
		System.out.println(c.getName());
		
		Class c2 = ReflectionClassInJava.class;
		System.out.println(c2.getName());
		
		Class c4 = Class.forName("com.programming.Class c2 = ReflectionClassInJava");
		System.out.println(c4.getName());
	}
}