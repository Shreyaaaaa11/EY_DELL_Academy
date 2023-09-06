package com.programming;

public class selectionStmt1 {
	public static void main(String[] args) {
		int marks = 85;
		if (marks < 100 && marks > 90) {
			System.out.println("Excelent Grade and mark is "+marks);
		}
			else if(marks < 90 && marks > 80) {
				System.out.println("Very good grade");
			}
			else {
				System.out.println("Unknown Result");
			}
		int number = 15;
		if(number % 2 == 0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
	}

}
