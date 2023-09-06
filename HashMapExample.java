package com.programming;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {

		HashMap<Integer, String> hMap = new HashMap<>();

		hMap.put(123, "ABC");

		hMap.put(123, null);

		hMap.put(121, null);

		hMap.put(null, "PQR");

		hMap.put(null, "XYZ");

		hMap.put(145, "MNO");

		for (Map.Entry<Integer, String> M : hMap.entrySet()) {

			System.out.println(M.getKey() + ";" + M.getValue());

		}

		// TODO Auto-generated method stub

	}

}
