package com.programming;

public class EqualsMerthod {
public static void main(String[] args) {
	String str1 = "String is a immutable class";
	String str2 = "String is a immutable class";
	if(str1 == str2) {
		System.out.println("Works for literals or constants");
	}
	else
	{
		System.out.println("== does not Works for literals or constants");
	}
	String str3 = new String("String is a immutable class");
	String str4 = new String("String is a immutable class");
	if(str3 == str4) {
		System.out.println("== Works for literals or constants");
	}
	else
	{
		System.out.println("==  does not Works for literals or constants");
	}
	if(str3.equals(str4)) {
		System.out.println("equals works for object");
	}
	else
	{
		System.out.println("== equals does not works for object");
	}
	System.out.println("Memory address is"+ str3.hashCode());
	System.out.println("Memory address is"+ str4.hashCode());
}
}
