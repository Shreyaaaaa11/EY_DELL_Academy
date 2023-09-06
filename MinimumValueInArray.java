package com.programming;

public class MinimumValueInArray {
	public static void main(String[] args) {
		int intArr[] = {10,2,3,5,67,4,3,4,5,7,75,4,33};
		min(intArr);
	}
static void min(int[] intArr) {
	int min = intArr[0];
	for(int i =0; i< intArr.length; i++) {
		if(min > intArr[i]) {
			min = intArr[i];				
		}
	}
System.out.println("Minimum Value is "+min);
}
}