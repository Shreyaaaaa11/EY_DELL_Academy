package com.programming;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class HowComparableAndComparatorWorks {
public static void main(String[] args) {
	
	int[] intArr = {10,2,82,93,103,1,3,3};
	Arrays.sort(intArr);
	System.out.println("Sorted Integer arrays is" + Arrays.toString(intArr));
	
	String[] strArr = {"Z","A","X","B","W"};
	Arrays.sort(intArr);
	System.out.println("Sorted Integer arrays is" + Arrays.toString(strArr));
	
	List<String> liststr = new ArrayList<>();
	liststr.add("Z");liststr.add("A");liststr.add("Z");liststr.add("Z");
	liststr.add("X");liststr.add("Y");
	Collections.sort(liststr);
		for(String str: liststr) {
		System.out.println(str + " ");
		
	}
	}
}
