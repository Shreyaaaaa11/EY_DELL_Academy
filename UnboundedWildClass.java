package com.programinig.class6;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class UnboundedWildClass {

	public static void main(String[] args) {

		UnboundedWildClass obj = new UnboundedWildClass();
		List<String> listStr = new ArrayList<>();
		listStr.add("ABC");
		listStr.add("XYZ");
		obj.printCollectionData(listStr);

		List<Integer> listInt = new ArrayList<>();
		listInt.add(123);
		listInt.add(456);
		obj.printCollectionData(listInt);
	}

	void printCollectionData(Collection<?> objToPrint) {
		System.out.println("[");
		for (Object obj : objToPrint) {
			System.out.println(obj.getClass().getCanonicalName() + ";" + obj);
		}
		System.out.print("[");
		System.out.println();

	}
}
