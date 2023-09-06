package com.programming;

import java.util.Arrays;

public class SortedArray {
	public static void main(String[] args)
	{
		int[] intArr = {10,9,67,56,98,3,2};
		Arrays.sort(intArr);
		System.out.println("Sorted Array is" + Arrays.toString(intArr));
		
		String[] strArr = {"z","A","X","B","W"};
Arrays.sort(strArr);	
System.out.println("Sorted Array is" + Arrays.toString(strArr));
	}

}
