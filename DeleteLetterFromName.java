package com.programming.class8;

public class DeleteLetterFromName {

	public static void main(String[] args) {

		StringBuilder str = new StringBuilder("Shreya");

		System.out.println(str);
		str.delete(3, 4);
	    str.replace(3, 3, "rana");
		System.out.println(str);

	}

}
