package com.programming;

public class selectionStmt2 {
public static void main(String[] args) {
	grading('A');
	grading('B');
	grading('C');
	grading('D');
}
static void grading(char grade) {
	int success;
	switch (grade) {
	
	case 'A':
	success = 1;
	System.out.println("Excellent grade");
	break;
	case 'B':
	case 'C':
	success = 0;
	System.out.println("Good grade");
	break;
	default:
	success = -1;
	System.out.println("Unknown grade");
	}
	passTheCourse(success);
}

static void passTheCourse(int success) {
	switch(success) {
	case 1:
		System.out.println("Passed the course");
		break;
	case 0:
		System.out.println("Can give exam again, your option!");
		break;
	case -1:
		System.out.println("Reschedule the exam date");
	}
}
}
