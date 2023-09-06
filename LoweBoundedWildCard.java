package com.programinig.class6;
import java.util.ArrayList;
import java.util.List;

public class LoweBoundedWildCard {
	
	public static void main(String[] args) {
		
		List<Integer> listInt = new ArrayList<Integer>();
		listInt.add(123);
		listInt.add(456);
		listInt.add(789);
		printListItems(listInt);
		
		List<Number> listfloat = new ArrayList<Number>();
		listfloat.add(14L);
		listfloat.add(3.14f);
		listfloat.add(21L);
		printListItems(listfloat);
		
		List<Double> listDouble = new ArrayList<Double>();
		listDouble.add(11.1D);
		listDouble.add(33.1D);
		listDouble.add(365.1D);

		//printListItems(listDouble);
	}
	
	static void printListItems(List<? super Integer> list) {
		for(Object num : list) {
			System.out.println();
		}
	
	}

}
