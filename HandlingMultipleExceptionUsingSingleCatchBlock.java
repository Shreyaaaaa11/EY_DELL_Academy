package com.programming;

public class HandlingMultipleExceptionUsingSingleCatchBlock {
public static void main(String[] args) {
	try {
		HandlingMultipleExceptionUsingSingleCatchBlock obj = new HandlingMultipleExceptionUsingSingleCatchBlock();
	}catch(NullPointerException | ArithmeticException | IndexOutOfBoundsException e) {
		System.out.println(e.getMessage());
	}
}
}
